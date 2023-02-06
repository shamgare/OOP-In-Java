package ProjectBank;

import java.util.*;

public class Pesawat {
    static Scanner scan = new Scanner(System.in);
    static int input;
    private static String departure;
    private static String destination;
    private static String dateTemp = "test";
    private static Integer date;
    private static String time;
    private static String pesawatName;
    private static Integer check = 0;
    private static String PINtemp;
    private static int countPIN = 0;
    private static int choose = 0;
    private static int tiket;

    static ArrayList<User> user = Main.AllUser;

    static void multiplyTicket() {
        do {
            System.out.println("Input how many ticket do you want to buy : ");
            tiket = scan.nextInt();
            scan.nextLine();
            if (tiket < 0) {
                System.out.println("Please Input Ticket More Than 0");
            } else if (tiket > 0 || tiket < 21) {
                payPesawat();
            }
        } while (tiket < 1 || tiket > 20);
    }

    static void payPesawat() {
        countPIN = 0;
        if (choose == 1) {
            if (user.get(User.check).Balance - 750000 * tiket < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 750000 * tiket;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Invalid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN > 3) {
                            return;
                        }
                    }
                } while (check != 1);
            }
        } else if (choose == 2) {
            if (user.get(User.check).Balance - 950000 * tiket < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 950000 * tiket;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Invalid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN > 3) {
                            return;
                        }
                    }
                } while (check != 1);
            }
        } else if (choose == 3) {
            if (user.get(User.check).Balance - 770000 * tiket < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 770000 * tiket;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Invalid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN > 3) {
                            return;
                        }
                    }
                } while (check != 1);
            }
        } else if (choose == 4) {
            if (user.get(User.check).Balance - 800000 * tiket < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 800000 * tiket;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Invalid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN > 3) {
                            return;
                        }
                    }
                } while (check != 1);
            }
        } else if (choose == 5) {
            if (user.get(User.check).Balance - 910000 * tiket < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 910000 * tiket;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Invalid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN > 3) {
                            return;
                        }
                    }
                } while (check != 1);
            }
        } else if (choose == 6) {
            if (user.get(User.check).Balance - 950000 * tiket < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 950000 * tiket;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Invalid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN > 3) {
                            return;
                        }
                    }
                } while (check != 1);
            }
        } else if (choose == 7) {
            if (user.get(User.check).Balance - 850000 * tiket < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 850000 * tiket;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Invalid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN > 3) {
                            return;
                        }
                    }
                } while (check != 1);
            }
        } else if (choose == 8) {
            if (user.get(User.check).Balance - 755000 * tiket < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 755000 * tiket;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Invalid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN >= 3) {
                            return;
                        }
                    }
                } while (check != 1);
            }
        }
        check = 0;

        System.out.println("===========================================");
        System.out.println("| This is your ticket!                    |");
        System.out.println("===========================================");
        System.out.printf("| Departure    : %-24s |\n", departure);
        System.out.printf("| Destination  : %-24s |\n", destination);
        System.out.printf("| Flight       : %-24s |\n", pesawatName);
        System.out.printf("| Date         : %-24s |\n", dateTemp);
        System.out.printf("| Time         : %-24s |\n", time);
        System.out.printf("| Name         : %-24s |\n", user.get(User.check).name);
        System.out.printf("| Phone Number : %-24s |\n", user.get(User.check).phoneNumber);
        System.out.println("===========================================");
        System.out.println("Press Enter to Continue....");
        scan.nextLine();
        System.out.println("\033[H\033[2J");
    }

    static void pesawat() {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.println();
        do {
            System.out.println("======================");
            System.out.println("| Destination City : |");
            System.out.println("======================");
            System.out.println("| 1. Bali            |");
            System.out.println("| 2. Surabaya        |");
            System.out.println("| 3. Makassar        |");
            System.out.println("| 4. Medan           |");
            System.out.println("| 5. Palembang       |");
            System.out.println("| 6. Semarang        |");
            System.out.println("| 7. Papua           |");
            System.out.println("| 8. Pontianak       |");
            System.out.println("| 9. Jakarta         |");
            System.out.println("| 0. Back            |");
            System.out.println("======================");
            System.out.print("Input Your Destination City (Case Sensitive) : ");
            destination = scan.nextLine();
            if (destination.equals("Bali") || destination.equals("Surabaya") || destination.equals("Makassar")
                    || destination.equals("Medan") || destination.equals("Palembang") || destination.equals("Semarang")
                    || destination.equals("Papua") || destination.equals("Pontianak")
                    || destination.equals("Jakarta")) {
                check = 1;
            } else if (destination.equals("Back")) {
                return;
            } else {
                System.out.println("Please input a valid option!");
                System.out.println("Press Enter to Continue....");
                scan.nextLine();
                System.out.println("\033[H\033[2J");
                check = 0;
            }
        } while (check != 1);
        check = 0;
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.println();
        do {
            System.out.println("======================");
            System.out.println("| Departure City :   |");
            System.out.println("======================");
            System.out.println("| 1. Bali            |");
            System.out.println("| 2. Surabaya        |");
            System.out.println("| 3. Makassar        |");
            System.out.println("| 4. Medan           |");
            System.out.println("| 5. Palembang       |");
            System.out.println("| 6. Semarang        |");
            System.out.println("| 7. Papua           |");
            System.out.println("| 8. Pontianak       |");
            System.out.println("| 9. Jakarta         |");
            System.out.println("| 0. Back            |");
            System.out.println("======================");
            System.out.print("Input Your Departure City (Case Sensitive) : ");
            departure = scan.nextLine();
            if (departure.equals(destination)) {
                System.out.println("Please input a valid departure!");
                System.out.println("Press Enter to Continue....");
                scan.nextLine();
                System.out.println("\033[H\033[2J");
                check = 0;
            } else if (departure.equals("Bali") || departure.equals("Surabaya") || departure.equals("Makassar")
                    || departure.equals("Medan") || departure.equals("Palembang") || departure.equals("Semarang")
                    || departure.equals("Papua") || departure.equals("Pontianak")
                    || departure.equals("Jakarta")) {
                check = 1;
            } else if (departure.equals("Back")) {
                return;
            } else {
                check = 0;
            }
        } while (check != 1);
        System.out.println("\033[H\033[2J");
        check = 0;
        System.out.println();
        System.out.println();
        do {
            System.out.println("Choose Your Departure Date [1 - 7] : ");
            System.out.println("1. Senin, 20 Februari 2022");
            System.out.println("2. Selasa, 21 Februari 2022");
            System.out.println("3. Rabu, 22 Februari 2022");
            System.out.println("4. Kamis, 23 Februari 2022");
            System.out.println("5. Jumat, 24 Februari 2022");
            System.out.println("6. Sabtu, 25 Februari 2022");
            System.out.println("7. Minggu, 26 Februari 2022");
            System.out.println("0. Back");
            date = scan.nextInt();
            scan.nextLine();
            if (date < 0 || date > 7) {
                System.out.println("Please input a valid departure!");
                System.out.println("Press Enter to Continue ...");
                scan.nextLine();
                System.out.println("\033[H\033[2J");
            }
        } while (date < 0 || date > 7);
        if (date == 8) {
            return;
        } else if (date == 1) {
            dateTemp = "Senin, 20 Februari 2022";
        } else if (date == 2) {
            dateTemp = "Selasa, 21 Februari 2022";
        } else if (date == 3) {
            dateTemp = "Rabu, 22 Februari 2022";
        } else if (date == 4) {
            dateTemp = "Kamis, 23 Februari 2022";
        } else if (date == 5) {
            dateTemp = "Jumat, 24 Februari 2022";
        } else if (date == 6) {
            dateTemp = "Sabtu, 25 Februari 2022";
        } else if (date == 7) {
            dateTemp = "Minggu, 26 Februari 2022";
        } else if (date == 0) {
            return;
        }

        System.out.println();
        System.out.println();
        do {
            System.out.println(
                    "==============================================================================================================");
            System.out.println(
                    "| Flight        | Departure      | Destination                | Date                     | Time  | Price     |");
            System.out.println(
                    "==============================================================================================================");
            System.out.printf("| 1. Liong Air  | %-14s | %-26s | %-24s | 10:15 | Rp750.000 |\n", departure, destination,
                    dateTemp);
            System.out.printf("| 2. Elang Air  | %-14s | %-26s | %-24s | 12:00 | Rp950.000 |\n", departure, destination,
                    dateTemp);
            System.out.printf("| 3. Townlink   | %-14s | %-26s | %-24s | 14:00 | Rp770.000 |\n", departure, destination,
                    dateTemp);
            System.out.printf("| 4. Liong Air  | %-14s | %-26s | %-24s | 15:00 | Rp800.000 |\n", departure, destination,
                    dateTemp);
            System.out.printf("| 5. Batok Air  | %-14s | %-26s | %-24s | 16:30 | Rp910.000 |\n", departure, destination,
                    dateTemp);
            System.out.printf("| 6. Batok Air  | %-14s | %-26s | %-24s | 18:00 | Rp950.000 |\n", departure, destination,
                    dateTemp);
            System.out.printf("| 7. Swarajaya  | %-14s | %-26s | %-24s | 20:45 | Rp850.000 |\n", departure, destination,
                    dateTemp);
            System.out.printf("| 8. Elang Air  | %-14s | %-26s | %-24s | 22:00 | Rp755.000 |\n", departure, destination,
                    dateTemp);
            System.out.println(
                    "==============================================================================================================");
            System.out.println("Press 0 to Back :)");
            System.out.println("Input Number You Want to Choose [1 - 8] : ");
            choose = scan.nextInt();
            scan.nextLine();

            if (choose == 1) {
                pesawatName = "Liong Air";
                time = "10:15";
            } else if (choose == 2) {
                pesawatName = "Elang Air";
                time = "12:00";
            } else if (choose == 3) {
                pesawatName = "Townlink";
                time = "14:00";
            } else if (choose == 4) {
                pesawatName = "Liong Air";
                time = "15:00";
            } else if (choose == 5) {
                pesawatName = "Batok Air";
                time = "16:30";
            } else if (choose == 6) {
                pesawatName = "Batok Air";
                time = "18:00";
            } else if (choose == 7) {
                pesawatName = "Swarajaya";
                time = "20:45";
            } else if (choose == 8) {
                pesawatName = "Elang Air";
                time = "22:00";
            } else if (choose == 0) {
                return;
            }
        } while (choose < 0 || choose > 8);

        multiplyTicket();
    }
}