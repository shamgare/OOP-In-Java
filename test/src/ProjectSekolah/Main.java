package ProjectSekolah;
import java.util.*;

public class Main {
    private final Scanner scan = new Scanner(System.in);
    private final Sekolah sekolah = new Sekolah();
    public void mainMenu(Sekolah sekolah, Scanner scan) {
        dummyData();
        int input = 0;
        do {
            System.out.println(" ________  _____ ______   ________          ________  ________  ________   _________  ________             ___  ___  ___  ________  ___  ___  ________   ");
            System.out.println("|\\   ____\\|\\   _ \\  _   \\|\\   __  \\        |\\   ____\\|\\   __  \\|\\   ___  \\|\\___   ___\\\\   __  \\           |\\  \\|\\  \\|\\  \\|\\   ____\\|\\  \\|\\  \\|\\   __  \\  ");
            System.out.println("\\ \\  \\___|\\ \\  \\\\\\__\\ \\  \\ \\  \\|\\  \\       \\ \\  \\___|\\ \\  \\|\\  \\ \\  \\\\ \\  \\|___ \\  \\_\\ \\  \\|\\  \\          \\ \\  \\ \\  \\\\\\  \\ \\  \\___|\\ \\  \\\\\\  \\ \\  \\|\\  \\");
            System.out.println(" \\ \\_____  \\ \\  \\\\|__| \\  \\ \\   __  \\       \\ \\_____  \\ \\   __  \\ \\  \\\\ \\  \\   \\ \\  \\ \\ \\   __  \\       __ \\ \\  \\ \\  \\\\\\  \\ \\_____  \\ \\  \\\\\\  \\ \\   ____\\");
            System.out.println("  \\|____|\\  \\ \\  \\    \\ \\  \\ \\  \\ \\  \\       \\|____|\\  \\ \\  \\ \\  \\ \\  \\\\ \\  \\   \\ \\  \\ \\ \\  \\ \\  \\     |\\  \\\\_\\  \\ \\  \\\\\\  \\|____|\\  \\ \\  \\\\\\  \\ \\  \\___|");
            System.out.println("    ____\\_\\  \\ \\__\\    \\ \\__\\ \\__\\ \\__\\        ____\\_\\  \\ \\__\\ \\__\\ \\__\\\\ \\__\\   \\ \\__\\ \\ \\__\\ \\__\\    \\ \\________\\ \\_______\\____\\_\\  \\ \\_______\\ \\__\\");
            System.out.println("   |\\_________\\|__|     \\|__|\\|__|\\|__|       |\\_________\\|__|\\|__|\\|__| \\|__|    \\|__|  \\|__|\\|__|     \\|________|\\|_______|\\_________\\|_______|\\|__|");
            System.out.println("   \\|_________|                               \\|_________|                                                                  \\|_________|");
            System.out.println("=========================================");
            System.out.println("|      Welcome to SMA Santa Jusup!      |");
            System.out.println("=========================================");
            System.out.println("| 1. Sign Up                            |");
            System.out.println("| 2. Log In                             |");
            System.out.println("| 3. Exit                               |");
            System.out.println("=========================================");
            System.out.println("Please input a number [1 - 3]:");
            System.out.print(">> ");

            try {
                input = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                scan.nextLine();
            }

            MenuUser userMenu = new MenuUser(sekolah, scan);
            MenuGuru guruMenu = new MenuGuru(sekolah, scan);
            MenuMurid muridMenu = new MenuMurid(sekolah, scan);

            if (input == 1) {
                userMenu.signUp();
            } else if (input == 2) {
                logInMenu(guruMenu, muridMenu);
            } else if (input == 3) {
                System.out.println("Thanks for using this app!");
            } else {
                System.out.println("Please input a valid number!");
                System.out.println("Press enter to continue....");
                scan.nextLine();
            }
        } while (input != 3);
    }
    public void logInMenu(MenuGuru guruMenu, MenuMurid muridMenu) {
        String type = "";
        do {
            System.out.println("Please enter your account type [T/S]: ");
            System.out.print(">> ");
            type = scan.nextLine();
        } while (!type.matches("T") && !type.matches("S"));

        if (type.matches("T")) {
            int index = guruMenu.logIn(type);
            if (index != -1) {
                guruMenu.menu(sekolah, scan, index);
            }
        } else {
            int index = muridMenu.logIn(type);
            if (index != -1) {
                muridMenu.menu(sekolah, scan, index);
            }
        }
    }
    public void dummyData() {
        Pelajaran p1 = new Pelajaran("Science",0, 0, 0);
        Pelajaran p2 = new Pelajaran("Math",0, 0, 0);
        Pelajaran p3 = new Pelajaran("English",0, 0, 0);
        Pelajaran p4 = new Pelajaran("Indonesia",0, 0, 0);
        sekolah.addPelajaran(p1);
        sekolah.addPelajaran(p2);
        sekolah.addPelajaran(p3);
        sekolah.addPelajaran(p4);
        Murid m1 = new Murid("Daniel", "dan123@gmail.com", 19, "dan123", "23233");
        Murid m2 = new Murid("Joshua", "joshuu@gmail.com", 19, "JOSHUA", "23244");
        Murid m3 = new Murid("Michelle", "micel@gmail.com", 18, "micmic", "23243");
        Murid m4 = new Murid("Paula", "bpaula@gmail.com", 20, "p4ul4", "23223");
        sekolah.addMurid(m1); sekolah.addUser(m1);
        sekolah.addMurid(m2); sekolah.addUser(m2);
        sekolah.addMurid(m3); sekolah.addUser(m3);
        sekolah.addMurid(m4); sekolah.addUser(m4);
        Guru g1 = new Guru("Bowo", "bowwow@gmail.com", 45, "bowo69", "G0069", "Math");
        Guru g2 = new Guru("Harvianto", "harvi@gmail.com", 38, "harvey", "G0050", "Science");
        sekolah.addGuru(g1); sekolah.addUser(g1);
        sekolah.addGuru(g2); sekolah.addUser(g2);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.mainMenu(main.sekolah, main.scan);
    }
}
