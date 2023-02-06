package ProjectBank;

import java.util.*;

public class Hotel {
    static ArrayList<User> user = Main.AllUser;
    static Scanner scan = new Scanner(System.in);
    private static Integer chooseStay;
    private static Integer dateStay;
    private static String dateStayTemp = "test";
    private static String hotelName;
    private static String stay;
    private static String PINtemp;
    private static int countPIN = 0;
    private static int check = 0;

    Transaksi transaksi = new Transaksi();

    static void payHotel() {
        countPIN = 0;
        if (chooseStay == 1) {
            if (user.get(User.check).Balance - 1150000 < 0) {
                System.out.println("Your Balance is Insufficient!");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 11500000;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Please Input a valid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN >= 3)
                            return;
                    }
                } while (check != 1);
            }
        } else if (chooseStay == 2) {
            if (user.get(User.check).Balance - 950000 < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 950000;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Please Input a valid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN >= 3)
                            return;
                    }
                } while (check != 1);
            }
        } else if (chooseStay == 3) {
            if (user.get(User.check).Balance - 870000 < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 870000;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Please Input a valid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN >= 3)
                            return;
                    }
                } while (check != 1);
            }
        } else if (chooseStay == 4) {
            if (user.get(User.check).Balance - 1500000 < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 1500000;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Please Input a valid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN >= 3)
                            return;
                    }
                } while (check != 1);
            }
        } else if (chooseStay == 5) {
            if (user.get(User.check).Balance - 1110000 < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 1110000;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Please Input a valid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN >= 3)
                            return;
                    }
                } while (check != 1);
            }
        } else if (chooseStay == 6) {
            if (user.get(User.check).Balance - 950000 < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 950000;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Please Input a valid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN >= 3)
                            return;
                    }
                } while (check != 1);
            }
        } else if (chooseStay == 7) {
            if (user.get(User.check).Balance - 850000 < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 850000;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Please Input a valid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN >= 3)
                            return;
                    }
                } while (check != 1);
            }
        } else if (chooseStay == 8) {
            if (user.get(User.check).Balance - 555000 < 0) {
                System.out.println("Your Balance is Insufficient");
                return;
            } else {
                do {
                    System.out.print("Enter Your PIN : ");
                    PINtemp = scan.nextLine();
                    if (PINtemp.equals(user.get(User.check).PIN)) {
                        user.get(User.check).Balance -= 555000;
                        System.out.println("Thank You for Your Purchase!");
                        check = 1;
                    } else {
                        System.err.println("Please Input a valid PIN!");
                        countPIN++;
                        System.out.printf("Please input the right PIN <<< %d attemps more >>>\n", 3 - countPIN);
                        if (countPIN >= 3)
                            return;
                    }
                } while (check != 1);
            }
        }
        check = 0;

        if (chooseStay == 1) {
            hotelName = "Pullman Hotel";
        } else if (chooseStay == 2) {
            hotelName = "Harris Hotel";
        } else if (chooseStay == 3) {
            hotelName = "Ibis Hotel";
        } else if (chooseStay == 4) {
            hotelName = "Aston Hotel";
        } else if (chooseStay == 5) {
            hotelName = "Seraton Hotel";
        } else if (chooseStay == 6) {
            hotelName = "101 Hotel";
        } else if (chooseStay == 7) {
            hotelName = "Amaris Hotel";
        } else if (chooseStay == 8) {
            hotelName = "Oyo Hotel";
        }

        System.out.println(
                "===============================================================================");
        System.out.printf("| Stay         : %-60s |\n", stay);
        System.out.printf("| Hotel Name   : %-60s |\n", hotelName);
        System.out.printf("| Date         : %-60s |\n", dateStayTemp);
        System.out.printf("| Name         : %-60s |\n", user.get(User.check).name);
        System.out.printf("| Phone Number : %-60s |\n", user.get(User.check).phoneNumber);
        System.out.println(
                "===============================================================================");
        System.out.println("Press Enter to Continue!");
        scan.nextLine();
        System.out.println("\033[H\033[2J");
    }

    static void hotel() {
        int check = 0;

        do {
            System.out.println("Where Do You Want to Stay?");
            System.out.println("======================");
            System.out.println("| Destination Stay : |");
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
            System.out.print("Input Your Destination Stay (Case Sensitive) : ");
            stay = scan.nextLine();
            if (stay.equals("Bali") || stay.equals("Surabaya") || stay.equals("Makassar")
                    || stay.equals("Medan") || stay.equals("Palembang") || stay.equals("Semarang")
                    || stay.equals("Papua") || stay.equals("Pontianak")
                    || stay.equals("Jakarta")) {
                check = 1;
            } else if (stay.equals("0")) {
                return;
            } else {
                check = 0;
            }
        } while (check != 1);
        check = 0;
        System.out.println("\033[H\033[2J");
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
            dateStay = scan.nextInt();
            scan.nextLine();
        } while (dateStay < 1 || dateStay > 8);
        if (dateStay == 0) {
            return;
        } else if (dateStay == 1) {
            dateStayTemp = "Senin, 20 Februari 2022";
        } else if (dateStay == 2) {
            dateStayTemp = "Selasa, 21 Februari 2022";
        } else if (dateStay == 3) {
            dateStayTemp = "Rabu, 22 Februari 2022";
        } else if (dateStay == 4) {
            dateStayTemp = "Kamis, 23 Februari 2022";
        } else if (dateStay == 5) {
            dateStayTemp = "Jumat, 24 Februari 2022";
        } else if (dateStay == 6) {
            dateStayTemp = "`Sabtu, 25 Februari 2022";
        } else if (dateStay == 7) {
            dateStayTemp = "Minggu, 26 Februari 2022";
        }

        System.out.println("\033[H\033[2J");
        do {
            System.out.println("================================================================================");
            System.out.println("| Hotel Name       | City           | Date                       | Price       |");
            System.out.println("================================================================================");
            System.out.printf("| 1. Pullman       | %-14s | %-26s | Rp1.150.000 |\n", stay, dateStayTemp);
            System.out.printf("| 2. Harris Hotel  | %-14s | %-26s | Rp950.000   |\n", stay, dateStayTemp);
            System.out.printf("| 3. Ibis Hotel    | %-14s | %-26s | Rp870.000   |\n", stay, dateStayTemp);
            System.out.printf("| 4. Aston Hotel   | %-14s | %-26s | Rp1.500.000 |\n", stay, dateStayTemp);
            System.out.printf("| 5. Seraton Hotel | %-14s | %-26s | Rp1.110.000 |\n", stay, dateStayTemp);
            System.out.printf("| 6. 101 Hotel     | %-14s | %-26s | Rp950.000   |\n", stay, dateStayTemp);
            System.out.printf("| 7. Amaris Hotel  | %-14s | %-26s | Rp850.000   |\n", stay, dateStayTemp);
            System.out.printf("| 8. Oyo Hotel     | %-14s | %-26s | Rp555.000   |\n", stay, dateStayTemp);
            System.out.println("================================================================================");
            System.out.println("(Press 0 to go back)");
            System.out.println("Input Number You Want to Choose [1 - 8] : ");
            chooseStay = scan.nextInt();
            scan.nextLine();
            System.out.println("\033[H\033[2J");
            if (chooseStay == 0) {
                return;
            }
        } while (chooseStay < 0 || chooseStay > 8);
        payHotel();
    }

}
