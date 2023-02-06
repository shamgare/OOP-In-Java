package ProjectBank;

import java.util.*;

public class User {
    String name;
    String age;
    String phoneNumber;
    String address;
    String PIN;
    String accessCode;
    String accessLoginCode;
    String accountType;
    long transactionLimit;
    long Balance;

    public static int check = -1;
    static Scanner scan = new Scanner(System.in);

    // void login
    ArrayList<User> user = Main.AllUser;

    void LogIn() {
        check = -1;
        if (Main.countNasabah == 0) {
            System.out.println("<<< Please Sign Up First! >>>");
            System.out.println("Press Enter to Continue ...");
            scan.nextLine();
            System.out.println("\033[H\033[2J");
            return;
        } else {
            do {
                System.out.print("Please Enter Your Access Code [6 Characters] : ");
                accessLoginCode = scan.nextLine();

                if (accessLoginCode.length() < 6) {
                    System.out.println("You entered less than 6 character !!!");
                    continue;
                }
                // ini untuk ngecek jika terdapat access code dari si user
                for (int i = 0; i < Main.countNasabah; i++) {
                    if (accessLoginCode.equals(user.get(i).accessCode)) {
                        check = i;
                        break;
                    }
                }
            } while (check == -1);

            if (check > -1) {
                Transaksi.display();
            }
        }
    }

    void SignUp() {
        int check_;
        do {
            System.out.print("Enter Your Name [alphabet and whitespace only]: ");
            this.name = scan.nextLine();
            if (name.matches("[a-zA-Z ]+")) { // ngecek isinya harus alphabet
                check_ = 1;
            } else {
                check_ = 0;
            }
        } while (check_ != 1);
        check_ = 0;

        // validasi umur harus angka
        do {
            System.out.print("Enter Your Age [>16] : ");
            this.age = scan.nextLine();
            if (age.chars().allMatch(Character::isDigit) && Integer.parseInt(age) > 16) {
                check_ = 1;
            } else {
                check_ = 0;
            }
        } while (check_ != 1);
        check_ = 0;

        do {
            System.out.print("Enter Your Phone Number [11 - 13 digits] : ");
            this.phoneNumber = scan.nextLine();
            if (phoneNumber.chars().allMatch(Character::isDigit)
                    && (phoneNumber.length() > 10 && phoneNumber.length() < 14)) {
                check_ = 1;
            } else {
                check_ = 0;
            }
        } while (check_ != 1);
        check_ = 0;

        do {
            System.out.print("Enter Your Address [Max 75 Characters] : ");
            this.address = scan.nextLine();
            if (address.length() > 1 && address.length() < 75) {
                check_ = 1;
            } else {
                check_ = 0;
            }
        } while (check_ != 1);
        check_ = 0;

        do {
            System.out.print("Enter Your PIN [must be 6 digits] : ");
            this.PIN = scan.nextLine();
            if (PIN.length() == 6) {
                check_ = 1;
            } else {
                check_ = 0;
                System.out.println("PIN must be 6 digits!");
            }
        } while (check_ != 1);
        check_ = 0;

        do {
            System.out.print("Enter Your Access Code [must be 6 Characters] : ");
            this.accessCode = scan.nextLine();
            if (accessCode.length() == 6) {
                check_ = 1;
            } else {
                check_ = 0;
            }
        } while (check_ != 1);
        check_ = 0;

        System.out.println();
        System.out.println("Congratulations! Your Account has been successfully created!!!");
        System.out.print("Press Enter to Continue ...");
        scan.nextLine();
        System.out.println("\033[H\033[2J");
        Main.countNasabah++;
    }
}