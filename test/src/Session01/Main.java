package Session01;

import java.util.Scanner;
public class Main {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int i = low - 1;
            int j = low;
            int pivot = arr[high];

            while (j < high) {
                if (arr[j] <= pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }

            arr[high] = arr[i+1];
            arr[i+1] = pivot;

            int pos = i+1;

            quickSort(arr, low, pos - 1);
            quickSort(arr, pos + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {

        }
    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int kasus = scan.nextInt();
//        for (int i = 0; i < kasus; i++) {
//            int size = scan.nextInt();
//
//            for (int j = 0; j < size; j++) {
//                for (int k = 0; k < size; k++) {
//                    if (j <= k) System.out.print("*");
//                }
//                System.out.println("");
//            }
//        }
//    }
}

