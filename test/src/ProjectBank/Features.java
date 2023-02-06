package ProjectBank;

import java.util.*;

public class Features {
    static Scanner scan = new Scanner(System.in);
    private static int input;
    static ArrayList<User> user = Main.AllUser;

    // this is code for features
    static void features() {
        do {
            System.out.println("=========================");
            System.out.println("| Choose Your Feature : |"); // si paling designer wkwkwk
            System.out.println("=========================");
            System.out.println("| 1. Tiket Pesawat      |");
            System.out.println("| 2. Hotel              |");
            System.out.println("| 0. Back               |");
            System.out.println("=========================");
            System.out.print("Please Input Number [1 - 2] : ");
            try{
                input = scan.nextInt();
                if (input == 1) {
                    Pesawat.pesawat();
                } else if (input == 2) {
                    Hotel.hotel();
                } else if (input == 0) {
                    return;
                }
            }catch(InputMismatchException e){
                System.out.println("Please input a valid number [0 - 2]");
                scan.nextLine();
            }
            System.out.println("\033[H\033[2J");
        } while (input != 3);
    }
}
