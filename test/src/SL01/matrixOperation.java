package SL01;
import java.util.Scanner;
public class matrixOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[6][6];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int check = scan.nextInt();
            int index = scan.nextInt();
            int value = scan.nextInt();

            if (check == 0) {
                for (int j = 0; j < 5; j++) {
                    arr[index][j] += value;
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    arr[j][index] += value;
                }
            }
        }

        int sum = 0;
        int min  = 1001;
        int max = -100;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum += arr[i][j];
                if (arr[i][j] < min) min = arr[i][j];
                if (arr[i][j] > max) max = arr[i][j];
            }
        }
        System.out.print(sum);
        System.out.print(" ");
        System.out.print(min);
        System.out.print(" ");
        System.out.println(max);
    }
}
