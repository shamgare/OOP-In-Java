package SL01;
import java.util.Scanner;
public class palindromeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int index = input.length() - 1;
        char str[] = input.toCharArray();
        int i = 0, flag = 0;

        while (i <= index) {
            if (str[i] != str[index]) {
                System.out.println("No");
                flag = 1;
                break;
            } else {
                i++;
                index--;
            }
        }
        if (flag != 1) System.out.println("Yes");
    }
}