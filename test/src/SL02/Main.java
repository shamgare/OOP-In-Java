package SL02;
import java.util.Vector;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vec = new Vector<>();

        int n = sc.nextInt();
        long r = sc.nextLong();
        long loop = r % n;

        for (int i = 0; i < n; i++) {
            vec.add(sc.nextInt());
        }

        for (int i = 0; i < loop; i++) {
            vec.add(0, vec.get(n-1));
            vec.remove(n);
        }

        for (int i = 0; i < n; i++) {
            if (i == n - 1) System.out.println(vec.get(i));
            else System.out.print(vec.get(i) + " ");
        }
    }
}
