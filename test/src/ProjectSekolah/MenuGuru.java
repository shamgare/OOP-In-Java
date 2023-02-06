package ProjectSekolah;
import java.util.*;
public class MenuGuru extends MenuUser {
    public MenuGuru (Sekolah sekolah, Scanner scan) {
        super(sekolah, scan);
    }

    //============================================================
    @Override
    public void menu(Sekolah sekolah, Scanner scan, int index) {
        int input = 0;
        do {
            System.out.println("=======================================");
            System.out.println("| Please enter a menu:                |");
            System.out.println("=======================================");
            System.out.println("| 1. Display Students                 |");
            System.out.println("| 2. Set ASG Score                    |");
            System.out.println("| 3. Set Quiz Score                   |");
            System.out.println("| 4. Set Final Score                  |");
            System.out.println("| 5. Display Personal Data            |");
            System.out.println("| 6. Log Out                          |");
            System.out.println("=======================================");
            System.out.print(">> ");

            try {
                input = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                scan.nextLine();
            }

            if (input == 1) {
                display(sekolah, scan, index);
                System.out.println("Press enter to continue....");
                scan.nextLine();
            } else if (input == 2) {
                if (validate(sekolah, scan, index) == 1) {
                    setAsgScore(sekolah, scan, index);
                    System.out.println("Press enter to continue....");
                    scan.nextLine();
                }
            } else if (input == 3) {
                if (validate(sekolah, scan, index) == 1) {
                    setQuizScore(sekolah, scan, index);
                    System.out.println("Press enter to continue....");
                    scan.nextLine();
                }
            } else if (input == 4) {
                if (validate(sekolah, scan, index) == 1) {
                    setFinalScore(sekolah, scan, index);
                    System.out.println("Press enter to continue....");
                    scan.nextLine();
                }
            } else if (input == 5) {
                displayPersonal(sekolah, scan, index);
            } else if (input == 6) {
                System.out.println("Returning to home page...");
                System.out.println("Press enter to continue....");
                scan.nextLine();
                return;
            } else {
                System.out.println("Please input a valid number!");
                System.out.println("Press enter to continue....");
                scan.nextLine();
            }
        } while (input != 6);
    }
    @Override
    public int display(Sekolah sekolah, Scanner scan, int index) {
        int indexPelajaran = 0;
        Guru g = sekolah.getGuruList().get(index);

        for (Pelajaran p: sekolah.getPelajaranList()) {
            if (p.getSubjectName().matches(g.getSubject())) {
                indexPelajaran = sekolah.getPelajaranList().indexOf(p);
            }
        }

        int j = 0;
        System.out.println("END OF SEMESTER " + g.getSubject().toUpperCase() + " SCORES");
        System.out.println("============================================================================");
        System.out.println("| No.  | Name                      | NIM     | ASG     | Quiz    | Final   |");
        System.out.println("============================================================================");
        for (Murid m:sekolah.getMuridList()) {
            if (searchStud(m, g.getSubject()) != -1) {
                System.out.printf("| %-4d | %-25s | %-7s | %-7d | %-7d | %-7d |\n", j + 1, m.getName(), m.getNim(), m.getPelajarans().get(indexPelajaran).getNilaiAsg(), m.getPelajarans().get(indexPelajaran).getNilaiQuiz(), m.getPelajarans().get(indexPelajaran).getNilaiFinal());
                j++;
            }
        }
        System.out.println("============================================================================");

        return indexPelajaran;
    }
    @Override
    public void displayPersonal(Sekolah sekolah, Scanner scan, int index) {
        String password = "";
        int count = 0;

        do {
            System.out.print("Please enter your password: ");
            password = scan.nextLine();
            if (!password.matches(sekolah.getGuruList().get(index).getPassword())) count++;
        } while (count != 3 && !password.matches(sekolah.getGuruList().get(index).getPassword()));

        if (count == 3) {
            System.out.println("Invalid password!");
            System.out.println("Returning to menu page...");
            System.out.println("Press enter to continue....");
            scan.nextLine();
            return;
        }

        Guru g = sekolah.getGuruList().get(index);
        System.out.println("=================================================");
        System.out.println("| Personal Data                                 |");
        System.out.println("=================================================");
        System.out.printf("| Name          : %-29s |\n", g.getName());
        System.out.printf("| Age           : %-29d |\n", g.getAge());
        System.out.printf("| Email         : %-29s |\n", g.getEmail());
        System.out.printf("| Password      : %-29s |\n", g.getPassword());
        System.out.printf("| Subject       : %-29s |\n", g.getSubject());
        System.out.printf("| Access Code   : %-29s |\n", g.getAccessCode());
        System.out.println("=================================================");
        System.out.println("Press enter to continue....");
        scan.nextLine();
    }
    public int validate(Sekolah sekolah, Scanner scan, int index) {
        String accessCode = "";
        int count = 0;

        do {
            System.out.print("Please input your access code: ");
            accessCode = scan.nextLine();
            if (!accessCode.matches(sekolah.getGuruList().get(index).getAccessCode())) {
                count++;
            }
        } while(!accessCode.matches(sekolah.getGuruList().get(index).getAccessCode()) && count != 3);

        if (count == 3) {
            System.out.println("Invalid Access Code!");
            System.out.println("Returning to menu page...");
            System.out.println("Press enter to continue....");
            scan.nextLine();
            return 0;
        } else {
            System.out.println("Access Granted!");
            System.out.println("Press enter to continue....");
            scan.nextLine();
            return 1;
        }
    }
    public void setAsgScore(Sekolah sekolah, Scanner scan, int index) {
        int indexPelajaran = display(sekolah, scan, index);
        int newScore = 0;

        String name = "";
        do {
            System.out.print("Please enter the student name: ");
            name = scan.nextLine();
            if (search(sekolah, name, index) == -1) {
                System.out.println("Student \"" + name + "\" Not Found!");
            }
        } while (search(sekolah, name, index) == -1);

        int indexMurid = search(sekolah, name, index);
        Murid m = sekolah.getMuridList().get(indexMurid);

        do {
            System.out.print("Please enter the ASG score: ");
            try {
                newScore = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Please input a valid number!");
                System.out.println("Press enter to continue....");
                scan.nextLine();
                scan.nextLine();
            }
        } while (newScore < 0 || newScore > 100);
        m.getPelajarans().get(indexPelajaran).setNilaiAsg(newScore);
        System.out.println("<<< Successfully Added Score! >>>");
    }
    public void setQuizScore(Sekolah sekolah, Scanner scan, int index) {
        int indexPelajaran = display(sekolah, scan, index);
        int newScore = 0;

        String name = "";
        do {
            System.out.print("Please enter the student name: ");
            name = scan.nextLine();
            if (search(sekolah, name, index) == -1) {
                System.out.println("Student \"" + name + "\" Not Found!");
            }
        } while (search(sekolah, name, index) == -1);

        int indexMurid = search(sekolah, name, index);
        Murid m = sekolah.getMuridList().get(indexMurid);

        do {
            System.out.print("Please enter the Quiz score: ");
            try {
                newScore = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Please input a valid number!");
                System.out.println("Press enter to continue....");
                scan.nextLine();
                scan.nextLine();
            }
        } while (newScore < 0 || newScore > 100);
        m.getPelajarans().get(indexPelajaran).setNilaiQuiz(newScore);
        System.out.println("<<< Successfully Added Score! >>>");
    }
    public void setFinalScore(Sekolah sekolah, Scanner scan, int index) {
        int indexPelajaran = display(sekolah, scan, index);

        String name = "";
        do {
            System.out.print("Please enter the student name: ");
            name = scan.nextLine();
            if (search(sekolah, name, index) == -1) {
                System.out.println("Student \"" + name + "\" Not Found!");
            }
        } while (search(sekolah, name, index) == -1);

        int indexMurid = search(sekolah, name, index);
        Murid m = sekolah.getMuridList().get(indexMurid);

        if (m.getPelajarans().get(indexPelajaran).getNilaiQuiz() == 0 || m.getPelajarans().get(indexPelajaran).getNilaiAsg() == 0) {
            System.out.println("Please enter the student's ASG and Quiz Score First!");
            System.out.println("Press enter to continue....");
            scan.nextLine();
            return;
        }

        int newScore = (int) (0.6 * m.getPelajarans().get(indexPelajaran).getNilaiQuiz()) + (int) (0.4 * m.getPelajarans().get(indexPelajaran).getNilaiAsg());
        System.out.println("The Final score is " + newScore);

        System.out.println("Final Score added!");
        m.getPelajarans().get(indexPelajaran).setNilaiFinal(newScore);
    }
    public int search(Sekolah sekolah, String name, int index) {
        for (Murid m: sekolah.getMuridList()) {
            if (m.getName().matches(name) && searchStud(m, sekolah.getGuruList().get(index).getSubject()) != -1) {
                return sekolah.getMuridList().indexOf(m);
            }
        }
        return -1;
    }
    public int searchStud(Murid murid, String subject) {
        for (Pelajaran p: murid.getPelajarans()) {
            if (p.getSubjectName().matches(subject)) {
                return 1;
            }
        }
        return -1;
    }
}
