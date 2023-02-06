package Session03;

import java.util.Vector;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        Scanner sc = new Scanner(System.in);
        vec.add("A");
        vec.add("B");
        vec.add("C");
        vec.add("D");
        vec.add("E");
        for (int i = 0; i < 6; i++) {
            vec.add(0, vec.get(5 - 1));
            vec.remove(5 );
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(vec.get(i) + " ");
        }
//        System.out.println(fibo(5));
    }
    // method
    static int fibo (int n) {
        if (n <= 1) return 1;
        return fibo (n - 1) + fibo(n - 2);
    }
}
