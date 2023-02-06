package ProjectBank;

import java.util.*;
public class Admin {
    static Scanner scan = new Scanner(System.in);
    static String pin;
    static String pin2;
    static String Current_pin;
    static String currentAccess;
    static String AccessCode;
    static String accessCode2;
    static String yesNo;
    static int check = 0;
    static ArrayList<User> admin = Main.AllUser;
    // Main backToFirst = new Main();

    static void blockAccount() {
        do {
            System.out.print("Are you sure that you want to block this account? [y/n] : ");
            yesNo = scan.nextLine();
            if (!yesNo.equals("y") && !yesNo.equals("n")) {
                System.err.println("Please input a valid option");
                System.out.println("Press enter to continue...");
                scan.nextLine();
            } else {
                if (yesNo.equals("y")) {
                    admin.remove(User.check);
                    Main.countNasabah--;
                    System.out.println("Account has been Deleted!");
                    System.out.println("Press Enter to Continue ...");
                    scan.nextLine();
                    System.out.println("\033[H\033[2J");
                    Main.firstInterface();
                } else {
                    break;
                }
            }
        } while (!yesNo.equals("y") && !yesNo.equals("n"));
    }

    static void changePin() {
        do {
            System.out.print("Enter your current PIN : ");
            Current_pin = scan.nextLine();
        } while (!admin.get(User.check).PIN.equals(Current_pin));

        do {
            System.out.print("Enter your new PIN : ");
            pin = scan.nextLine();
        } while (pin.length() != 6 || !pin.chars().allMatch(Character::isDigit));

        do {
            System.out.print("Re-enter your new PIN : ");
            pin2 = scan.nextLine();
        } while (!pin2.equals(pin));

        admin.get(User.check).PIN = pin;
        check = 1;
        if (check == 1) {
            System.out.println("Successfully changed PIN!");
            System.out.println("Press Enter to Continue ...");
            scan.nextLine();
            System.out.println("\033[H\033[2J");
            Main.firstInterface();
        }
        check = 0;
    }

    static void changeAccessCode() {
        do {
            System.out.print("Enter your current Access Code : ");
            currentAccess = scan.nextLine();
        } while (!admin.get(User.check).accessCode.equals(currentAccess));

        do {
            System.out.print("Enter your new Access Code : ");
            AccessCode = scan.nextLine();
        } while (AccessCode.length() != 6);

        do {
            System.out.print("Re-enter your new Access Code : ");
            accessCode2 = scan.nextLine();
        } while (!accessCode2.equals(AccessCode));

        admin.get(User.check).accessCode = accessCode2;
        check = 1;
        if (check == 1) {
            System.out.println("Successfully Changed Access Code!");
            System.out.println("Press Enter to Continue ...");
            scan.nextLine();
            System.out.println("\033[H\033[2J");
            Main.firstInterface();
        }
        check = 0;
    }

    static void adminValidation(int input) {
        if (input == 1) {
            changePin();
        } else if (input == 2) {
            changeAccessCode();
        } else if (input == 3) {
            blockAccount();
        } else if (input == 4) {
            NasabahBiasa.displayData();
        } else {
            return;
        }
    }

    static void display() {
        int input = 0;
        // ini adalah tempat visual dari m admin dari admin itu sendiri
        do {
            System.out.println("=================================");
            System.out.println("| <<< Welcome to Menu Admin >>> |");
            System.out.println("=================================");
            System.out.println("| 1. Change PIN                 |");
            System.out.println("| 2. Change Access Code         |");
            System.out.println("| 3. Delete Account             |");
            System.out.println("| 4. Personal Information       |");
            System.out.println("| 0. Exit                       |");
            System.out.println("=================================");
            System.out.print(">> ");
            input = scan.nextInt();
            scan.nextLine();
            System.out.println("\033[H\033[2J");
            if (input == 0) {
                return;
            } else {
                adminValidation(input);
            }
        } while (input < 0 || input > 4);
    }
}
