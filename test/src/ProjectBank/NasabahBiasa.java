package ProjectBank;

import java.util.*;

//ini kelas untuk NasabahBiasa
public class NasabahBiasa {
    static Scanner scan = new Scanner(System.in);

    static ArrayList<User> nb = Main.AllUser;
    static String nasabahNumber = "" + ((int) (Math.random() * 100000 + 99999));

    // ini kode untuk mengeset account type dari setiap user
    static void setAccountType() {
        if (nb.get(User.check).Balance >= 1000000000) {
            nb.get(User.check).accountType = "Priority";
        } else {
            nb.get(User.check).accountType = "Standard";
        }
    }

    static void setTransactionLimit() {
        if (nb.get(User.check).accountType.equals("Priority")) {
            nb.get(User.check).transactionLimit = 500000000;
        } else {
            nb.get(User.check).transactionLimit = 40000000;
        }
    }

    static void displayData() {
        setAccountType();
        setTransactionLimit();

        // the other thing
        System.out.println("====================================================");
        System.out.println("|               Personal Information               |");
        System.out.println("====================================================");
        System.out.println("====================================================");
        System.out.printf("| Account Number              : %-17s  |\n", nasabahNumber);
        System.out.printf("| Account Type                : %-17s  |\n", nb.get(User.check).accountType);
        System.out.printf("| Account Balance             : Rp.%-14d  |\n", nb.get(User.check).Balance);
        System.out.printf("| Account Transaction Limit   : Rp.%-14d  |\n", nb.get(User.check).transactionLimit);
        System.out.println("====================================================");

        System.out.println("Press Enter To Continue ...");
        scan.nextLine();
        System.out.println("\033[H\033[2J");
    }
}
