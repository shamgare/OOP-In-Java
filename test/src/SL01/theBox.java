package SL01;
import java.util.Scanner;
public class theBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == 0 || i == size-1 || j == size-1 || j == i || j+i == size-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
