package ProjectSekolah;
import java.util.*;
public class MenuUser {
    private final Scanner scan;
    private final Sekolah sekolah;
    static int n = 1;
    public MenuUser (Sekolah sekolah, Scanner scan) {
        this.sekolah = sekolah;
        this.scan = scan;
    }

    //===============================================

    public void signUp() {
        String name = "";
        int age = 0;
        String email = "";
        String password = "";
        String type = "";

        System.out.println("<<< SIGN UP PAGE >>>");
        do {
            System.out.print("Please enter your name [must not be empty]: ");
            name = scan.nextLine();
        } while (!name.matches("[a-zA-Z ]+") || name.equals(""));

        do {
            System.out.print("Please enter your age [> 15]: ");
            try {
                age = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Please input a valid number!");
                System.out.println("Press enter to continue....");
                scan.nextLine();
                scan.nextLine();
            }
        } while (age < 16);

        do {
            System.out.print("Please enter your email (gmail) [must not be empty]: ");
            email = scan.nextLine();
        } while (!email.matches("[@a-zA-Z0-9.]+") || email.length() < 11 || !email.substring(email.length() - 10).matches("@gmail.com"));

        do {
            System.out.print("Please enter your password [must not be empty]: ");
            password = scan.nextLine();
        } while (password.equals(""));

        do {
            System.out.println("Enter a character to create your account type [T/S]: ");
            System.out.println("1. Teacher [T]");
            System.out.println("2. Student [S]");
            System.out.print(">> ");
            type = scan.nextLine();
        } while (!type.matches("T") && !type.matches("S"));

        if (type.matches("T")) {
            String subject = "";
            String accessCode;

            do {
                System.out.print("Enter the subject you are teaching: ");
                subject = scan.nextLine();
                if (searchSubject(sekolah, subject) == -1) {
                    System.out.println("Subject Not Found!");
                    System.out.println("Press enter to continue....");
                    scan.nextLine();
                }
            } while (searchSubject(sekolah, subject) == -1);

            accessCode = String.format("G%04d", n++);
            System.out.println("Your access code is " + accessCode);

            Guru newGuru = new Guru(name, email, age, password, accessCode, subject);
            sekolah.addGuru(newGuru);
            sekolah.addUser(newGuru);
        } else {
            String nim = "";

            do {
                System.out.print("Please enter your nim [5 digits only & must not be empty]: ");
                nim = scan.nextLine();
            } while (nim.equals("") || !nim.matches("[0-9]+") || nim.length() > 5);

            Murid newMurid = new Murid(name, email, age, password, nim);
            sekolah.addMurid(newMurid);
            sekolah.addUser(newMurid);
        }

        System.out.println("Account Successfully Created!");
        System.out.println("Press enter to continue....");
        scan.nextLine();
    }
    public int logIn(String type) {
        String email = "";
        String password = "";
        int indexGuru = -1;
        int indexMurid = -1;
        int count = 0;

        ArrayList<User> test = sekolah.getUserList();
        ArrayList<Guru> gurus = sekolah.getGuruList();
        ArrayList<Murid> murids = sekolah.getMuridList();

        if (test.isEmpty()) {
            System.out.println("Please Sign Up First!");
            System.out.println("Press enter to continue....");
            scan.nextLine();
            return -1;
        }

        System.out.println("<<< LOG IN PAGE >>>");

        System.out.print("Please enter your email: ");
        email = scan.nextLine();

        if (type.matches("T")) {
            for (Guru guru: gurus) {
                if (guru.getEmail().matches(email)) {
                    indexGuru = gurus.indexOf(guru);
                    do {
                        System.out.print("Please enter your password: ");
                        password = scan.nextLine();
                        if (!password.matches(guru.getPassword())) count++;
                    } while (count != 3 && !password.matches(guru.getPassword()));

                    if (count == 3) {
                        System.out.println("Invalid password!");
                        System.out.println("Returning to home page...");
                        System.out.println("Press enter to continue....");
                        scan.nextLine();
                        return -1;
                    }
                }
            }
            if (indexGuru == -1) {
                System.out.println("Your email is not registered!");
                System.out.println("Returning to home page...");
                System.out.println("Press enter to continue....");
                scan.nextLine();
                return -1;
            } else {
                System.out.println("Successfully Logged In!");
                System.out.println("Press enter to continue....");
                scan.nextLine();
                System.out.println("Welcome Back " + gurus.get(indexGuru).getName() + "!");
            }
            return indexGuru;
        } else {
            for (Murid murid: murids) {
                if (murid.getEmail().matches(email)) {
                    indexMurid = murids.indexOf(murid);
                    do {
                        System.out.print("Please enter your password: ");
                        password = scan.nextLine();
                        if (!password.matches(murid.getPassword())) count++;
                    } while (count != 3 && !password.matches(murid.getPassword()));

                    if (count == 3) {
                        System.out.println("Invalid password!");
                        System.out.println("Returning to home page...");
                        System.out.println("Press enter to continue....");
                        scan.nextLine();
                        return -1;
                    }
                }
            }
            if (indexMurid == -1) {
                System.out.println("Your email is not registered!");
                System.out.println("Returning to home page...");
                System.out.println("Press enter to continue....");
                scan.nextLine();
                return -1;
            } else {
                System.out.println("Successfully Logged In!");
                System.out.println("Press enter to continue....");
                scan.nextLine();
                System.out.println("Welcome Back " + murids.get(indexMurid).getName() + "!");
            }
            return indexMurid;
        }
    }
    public int searchSubject(Sekolah sekolah, String name) {
        for (Pelajaran p : sekolah.getPelajaranList()) {
            if (p.getSubjectName().matches(name)) {
                return sekolah.getPelajaranList().indexOf(p);
            }
        }
        return -1;
    }
    public void menu(Sekolah sekolah, Scanner scan, int index) {}
    public int display(Sekolah sekolah, Scanner scan, int index) { return 0;}
    public void displayPersonal(Sekolah sekolah, Scanner scan, int index) {}
}
