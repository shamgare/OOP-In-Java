package SL01;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class gpaRank {
    static int part(float[] arr, int low, int high)
    {
        int i = low - 1;
        int j = low;
        float pivot = arr[high];

        while (j < high) {
            if (arr[j] >= pivot) {
                i++;
                float temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j++;
        }

        arr[high] = arr[i+1];
        arr[i+1] = pivot;

        return i + 1;
    }
    static void qsort(float[] arr, int low, int high)
    {
        if (low < high) {
            int pos = part(arr, low, high);

            qsort(arr, low, pos - 1);
            qsort(arr, pos + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        float arr[] = new float[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scan.nextFloat();
        }

        qsort(arr, 0, t-1);

        int index = 1;
        int flag = 0;

        for (int i = 0; i < t; i++) {
            if (i == 0) {
                System.out.print(index);
            }
            else if (arr[i] == arr[i-1]) {
                flag++;
                System.out.print(index - flag);
            }
            else {
                System.out.print(index);
                flag = 0;
            }
            System.out.print(" ");
            System.out.printf("%.2f\n", arr[i]);
            index++;
        }
    }
}
