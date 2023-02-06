package ProjectSekolah;
import java.util.*;
public class MenuMurid extends MenuUser {
    public MenuMurid (Sekolah sekolah, Scanner scan) {
        super(sekolah, scan);
    }

    //========================================================
    @Override
    public void menu(Sekolah sekolah, Scanner scan, int index) {
        int input = 0;
        int i = 0;
        do {
            System.out.println("END OF SEMESTER IS HERE!");
            System.out.println("=======================================");
            System.out.println("| Please enter a menu:                |");
            System.out.println("=======================================");
            System.out.println("| 1. View Semester Scores             |");
            System.out.println("| 2. Add Subject                      |");
            System.out.println("| 3. Display Personal Data            |");
            System.out.println("| 4. Log Out                          |");
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
            } else if (input == 2) {
                addSubject(sekolah, scan, index);
            } else if (input == 3) {
                displayPersonal(sekolah, scan, index);
            } else if (input == 4) {
                System.out.println("Returning to home page...");
                System.out.println("Press enter to continue....");
                scan.nextLine();
                return;
            } else {
                System.out.println("Please input a valid number!");
                System.out.println("Press enter to continue....");
                scan.nextLine();
            }
        } while (input != 4);
    }
    @Override
    public int display(Sekolah sekolah, Scanner scan, int index) {
        Murid m = sekolah.getMuridList().get(index);
        int indexPelajaran = 0;
        System.out.println("=========================================================");
        System.out.println("| No.  | Subject          | ASG     | Quiz    | Final   |");
        System.out.println("=========================================================");
        for (Pelajaran p1: m.getPelajarans()) {
            indexPelajaran = m.getPelajarans().indexOf(p1);
            System.out.printf("| %-4d | %-16s | %-7d | %-7d | %-7d |\n", indexPelajaran + 1,
                    m.getPelajarans().get(indexPelajaran).getSubjectName(),
                    m.getPelajarans().get(indexPelajaran).getNilaiAsg(),
                    m.getPelajarans().get(indexPelajaran).getNilaiQuiz(),
                    m.getPelajarans().get(indexPelajaran).getNilaiFinal());
        }
        System.out.println("=========================================================");
        System.out.println("Press enter to continue....");
        scan.nextLine();
        return 1;
    }
    @Override
    public void displayPersonal(Sekolah sekolah, Scanner scan, int index) {
        String password = "";
        int count = 0;

        do {
            System.out.print("Please enter your password: ");
            password = scan.nextLine();
            if (!password.matches(sekolah.getMuridList().get(index).getPassword())) count++;
        } while (count != 3 && !password.matches(sekolah.getMuridList().get(index).getPassword()));

        if (count == 3) {
            System.out.println("Invalid password!");
            System.out.println("Returning to menu page...");
            System.out.println("Press enter to continue....");
            scan.nextLine();
            return;
        }

        Murid m = sekolah.getMuridList().get(index);
        System.out.println("=================================================");
        System.out.println("| Personal Data                                 |");
        System.out.println("=================================================");
        System.out.printf("| Name          : %-29s |\n", m.getName());
        System.out.printf("| Age           : %-29d |\n", m.getAge());
        System.out.printf("| Email         : %-29s |\n", m.getEmail());
        System.out.printf("| Password      : %-29s |\n", m.getPassword());
        System.out.printf("| NIM           : %-29s |\n", m.getNim());
        System.out.println("=================================================");
        System.out.println("Press enter to continue....");
        scan.nextLine();
    }
    public void addSubject(Sekolah sekolah, Scanner scan, int index) {
        String subject = "";
        do {
            System.out.print("Enter a new subject name: ");
            subject = scan.nextLine();
            if (!subject.matches("[a-zA-Z ]+")) {
                System.out.println("Please enter a valid subject name!");
                System.out.println("Press enter to continue....");
                scan.nextLine();
            } else if (searchSubject(sekolah, subject) != -1) {
                System.out.println("Please enter a new subject name!");
                System.out.println("Press enter to continue....");
                scan.nextLine();
            }
        } while (searchSubject(sekolah, subject) != -1 || !subject.matches("[a-zA-Z ]+"));

        Murid m = sekolah.getMuridList().get(index);
        ArrayList<Pelajaran> pelajarans = m.getPelajarans();

        Pelajaran p1 = new Pelajaran(subject, 0, 0, 0);
        pelajarans.add(p1);
        sekolah.addPelajaran(p1);

        System.out.println("Subject Added!");
        System.out.println("Press enter to continue....");
        scan.nextLine();

//        System.out.println("Pelajarans : ");
//        for (Pelajaran p: pelajarans) {
//            System.out.println(p.getSubjectName());
//        }
//        System.out.println("");
//        System.out.println("Sekolah Pelajarans: ");
//        for (Pelajaran p: sekolah.getPelajaranList()) {
//            System.out.println(p.getSubjectName());
//        }
    }
}
