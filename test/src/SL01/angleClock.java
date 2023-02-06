package SL01;
import java.util.Scanner;
public class angleClock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String waktu = scan.next();

        String sub1 = waktu.substring(0,2);
        String sub2 = waktu.substring(3);

        float jam = Float.parseFloat(sub1);
        float menit = Float.parseFloat(sub2);

        float m = (menit / 60) * 360;
        float j = (jam / 12) * 360 + (menit / 60) * (360 / 12);

        float hasil1 = Math.abs(m - j);
        float hasil2 = Math.abs(360 - hasil1);

        System.out.println(Math.min(hasil1, hasil2));
    }
}
