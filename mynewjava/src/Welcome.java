import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello World");
        int a = 10;
        System.out.println("a = " + a);
        double b = 22.0/7.0;
        System.out.printf("a + b = %.2f\n" , (a + b));

        String nama = scan.nextLine();
        System.out.println("Name = " + nama);
        scan.nextLine();
        for (int i = 0; i < 30; i++) {
            System.out.println("Hello");
        }
    }
}
