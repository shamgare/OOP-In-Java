package ProjectBank;

import java.text.*;
import java.util.*;

// ini kelas file untuk transaksi
public class Transaksi {
    static Scanner scan = new Scanner(System.in);
    static String PINtemp;
    static int mark = 0;
    static long topUp;
    static int countPIN;
    static int checkTopUp;

    static ArrayList<User> Transaction = Main.AllUser;

    static void display() {
        Boolean mark = true;
        int input = 0;
        System.out.println("=================================================");
        System.out.printf("| Welcome Back, %-31s |\n", Transaction.get(User.check).name);
        System.out.println("=================================================");
        System.out.println("| Choose your day today :                       |");
        System.out.println("| 1. Transaction                                |");
        System.out.println("| 2. Features                                   |");
        System.out.println("| 3. Admin                                      |");
        System.out.println("| 0. Exit                                       |");
        System.out.println("=================================================");
        do {
            System.out.print(">> ");
            try{
                input = scan.nextInt();
                scan.nextLine();
                if (input == 0) {
                    return;
                } else {
                    mark = false;
                    show(input);
                }
            }catch(InputMismatchException e){
                System.out.println("Please input Valid Input [0 - 3]");
                input = 4;
                scan.nextLine();
            }
        } while (input < 0 || input > 3 || mark == false);
    }

    static void Transfer(String name) {
        long amountOfMoney = Transaction.get(User.check).Balance + 1;
        String checkPin;
        int count = 0;

        if (Transaction.get(User.check).Balance == 0) {
            System.out.println("You don't have enough money!");
            System.out.println("Press Enter to Continue....");
            scan.nextLine();
            System.out.println("\033[H\033[2J");
            return;
        }

        NasabahBiasa.setAccountType();
        NasabahBiasa.setTransactionLimit();
        do {
            System.out.printf("<< Transaction Limit : Rp.%d>>\n", Transaction.get(User.check).transactionLimit);
            System.out.print("How much money do you want to transfer? : ");
            try {
                amountOfMoney = scan.nextLong();
                scan.nextLine();
                if (amountOfMoney > Transaction.get(User.check).Balance) {
                    System.err.println("Please input a valid amount!");
                } else {
                    if (amountOfMoney > Transaction.get(User.check).transactionLimit) {
                        System.err.println("Please input a valid amount!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("<<< Please input a valid value >>>");
                scan.nextLine();
            }
        } while (amountOfMoney > Transaction.get(User.check).Balance
                || amountOfMoney > Transaction.get(User.check).transactionLimit);

        do {
            System.out.print("Please input your PIN: ");
            checkPin = scan.nextLine();
            if (!checkPin.equals(Transaction.get(User.check).PIN)) {
                count++;
                if (count <= 2) {
                    System.err.println("Invalid PIN");
                    System.out.printf("Please input the right PIN <<< %d attemps more >>>", 3 - count);
                    System.out.println();
                } else {
                    System.err.println("Invalid PIN, returning to main page");
                    // System.out.println("\033[H\033[2J");
                    return;
                }
            } else {
                Transaction.get(User.check).Balance -= amountOfMoney;
                System.out.println("<<< Successfully Transfered Rp." + amountOfMoney + " to " + name + " >>>");
                System.out.println("Press Enter to Continue ...");
                // System.out.println("\033[H\033[2J");
                scan.nextLine();
            }
        } while (!checkPin.equals(Transaction.get(User.check).PIN) && count <= 2);

    }

    static void TopUpSaldo() {

        do {
            System.out.print("Input the amount you want to Top Up : ");
            checkTopUp = 0;
            countPIN = 0;
            try {
                topUp = scan.nextLong();
                scan.nextLine();

                if (topUp < 10000) {
                    System.out.println("The minimal amount is 10000!");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("<<< Your input is invalid, please input number only >>>");
                scan.nextLine();

            }
        } while (topUp < 10000);

        do {
            System.out.print("Input Your PIN : ");
            PINtemp = scan.nextLine();
            if (!PINtemp.equals(Transaction.get(User.check).PIN)) {
                countPIN++;
                if (countPIN <= 2) {
                    System.err.println("Invalid PIN");
                    System.out.println();
                    System.out.printf("Please input the right password <<< %d attemps more >>>\n", 3 - countPIN);
                    continue;
                } else {
                    System.err.println("Invalid PIN, returning to main page");
                    System.out.println("Press Enter To Continue ...");
                    scan.nextLine();
                    System.out.println("\033[H\033[2J");
                    break;
                }
            } else {
                Transaction.get(User.check).Balance += topUp;
                System.out.println("\033[H\033[2J");
                System.out.println("Successfully topped up!");
                System.out.println("This is your current Balance");
                System.out.println("===================================");
                System.out.printf("| Balance : Rp.%-18d |\n", Transaction.get(User.check).Balance);
                System.out.println("===================================");
                System.out.println("Press Enter to Continue ...");
                scan.nextLine();
                System.out.println("\033[H\033[2J");
                checkTopUp = 1;
                break;
            }
        } while (checkTopUp == 0);
    }

    static void ShowSaldo() {
        System.out.println("This is your current Balance");
        System.out.println("===================================");
        System.out.printf("| Balance : Rp.%-18d |\n", Transaction.get(User.check).Balance);
        System.out.println("===================================");
        System.out.println("Press Enter to Continue ...");
        scan.nextLine();
        System.out.println("\033[H\033[2J");
        return;
    }

    static void transactionMenu() {

        String NameTransfer;
        int choose_transaction = 0;

        do {
            System.out.println();
            System.out.println("===================================");
            System.out.println("| <<< Choose Your Transaction >>> |");
            System.out.println("===================================");
            System.out.println("| 1. Transfer                     |");
            System.out.println("| 2. Top Up Balance               |");
            System.out.println("| 3. View Balance                 |");
            System.out.println("| 0. Exit                         |");
            System.out.println("===================================");
            System.out.print(">> ");
            try{
                choose_transaction = scan.nextInt();
                scan.nextLine();
                if (choose_transaction == 1) {
                    System.out.print("Who do you want to transfer to?: ");
                    NameTransfer = scan.nextLine();
                    Transfer(NameTransfer);
                    choose_transaction = 4;
                } else if (choose_transaction == 2) {
                    TopUpSaldo();
                    choose_transaction = 4;
                } else if (choose_transaction == 3) {
                    ShowSaldo();
                    choose_transaction = 4;
                } else if (choose_transaction == 0) {
                    break;
                }
            }catch(InputMismatchException e){
                System.out.println(e);
                System.out.println("Input a valid number [0 - 3]");
                scan.nextLine();
            }
        } while (choose_transaction < 0 || choose_transaction > 3);
        System.out.println("\033[H\033[2J");
    }

    static void show(int input) {
        if (input == 1) {
            transactionMenu();
        } else if (input == 2) {
            Features.features();
        } else if (input == 3) {
            Admin.display();
        }
    }

    // this is for
}