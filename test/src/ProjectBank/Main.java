package ProjectBank;

import java.text.*;
import java.util.*;

public class Main {
    // untuk menyimpan data user yang sudah sign up
    static ArrayList<User> AllUser = new ArrayList<User>();
    static Scanner scan = new Scanner(System.in);
    public static int countNasabah = 0;
    static Integer inputFirst = -1;
    static int check = 0;

    static void menu(int input) {
        User user = new User();
        if (input == 1) {
            user.LogIn();
            return;
        } else if (input == 2) {
            user.SignUp();
            AllUser.add(user);
            return;
        } else if (input == 0) {
            System.out.println("Thank you for using this app!");
            System.out.println("Press enter to continue ...");
            scan.nextLine();
            return;
        } else {
            System.out.println("Please input a valid number");
            System.out.println("Press enter to continue ...");
            scan.nextLine();

        }
    }

    static void firstInterface() {
        do {
            Date d = new Date();
            // Date e = new Date();
            // Date f = new Date();
            SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat b = new SimpleDateFormat("hh:mm a");

            System.out.println("ooo        ooooo                     oooo                                          o8o                 oooooooooo.                        oooo        ");
            System.out.println("`88.       .888'                     `888                                          `\"'                 `888'   `Y8b                       `888        ");
            System.out.println(" 888b     d'888   .oooo.    .ooooo.   888  oooo   .ooooo.  ooo. .oo.     oooooooo oooo   .ooooo.        888     888  .oooo.   ooo. .oo.    888  oooo  ");
            System.out.println(" 8 Y88. .P  888  `P  )88b  d88' `\"Y8  888 .8P'   d88' `88b `888P\"Y88b   d'\"\"7d8P  `888  d88' `88b       888oooo888' `P  )88b  `888P\"Y88b   888 .8P'   ");
            System.out.println(" 8  `888'   888   .oP\"888  888        888888.    888ooo888  888   888     .d8P'    888  888ooo888       888    `88b  .oP\"888   888   888   888888.    ");
            System.out.println(" 8    Y     888  d8(  888  888   .o8  888 `88b.  888    .o  888   888   .d8P'  .P  888  888    .o       888    .88P d8(  888   888   888   888 `88b.  ");
            System.out.println("o8o        o888o `Y888\"\"8o `Y8bod8P' o888o o888o `Y8bod8P' o888o o888o d8888888P  o888o `Y8bod8P'      o888bood8P'  `Y888\"\"8o o888o o888o o888o o888o ");
            System.out.println("");
            System.out.println("=========================================");
            System.out.println("| Date : " + a.format(d) + "                     |");
            System.out.println("| Time : " + b.format(d) + "                       |");
            System.out.println("=========================================");
            System.out.println("| <<< Welcome To Mackenzie Bank !!! >>> |");
            System.out.println("| 1. Log In                             |");
            System.out.println("| 2. Sign Up                            |");
            System.out.println("| 0. Exit                               |");
            System.out.println("=========================================");
            System.out.print(">> ");
            try {
                inputFirst = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("<<< Your input is invalid, please input number only >>>");
                System.out.println(e);
                scan.nextLine();
            }
            // System.out.println("\033[H\033[2J");
            if (inputFirst == 0) {
                break;
            } else {
                menu(inputFirst);
            }
        } while (inputFirst <= 0 || (inputFirst >= 1));
    }

    public static void main(String[] args) {
        firstInterface();
    }
}