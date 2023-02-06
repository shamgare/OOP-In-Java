package Session02;
//sout
//main
// shift + f10 RUN
public class Main {
    public static void main(String[] args) {
        /* System.out.println(Math.abs(-23)); */
        Integer a = 7;
        int b = Integer.MAX_VALUE;
        String str = new String("hello world");

        System.out.println(Math.abs(a));

        System.out.println(Math.floor(500 + Math.random() * 501));
        System.out.println(str == "hello world");
        System.out.println(str.equals("Hello World"));

        String c[] = str.split(" ");
        System.out.println(c[1]);

        System.out.println(str.contains("Wo"));

        System.out.println(str.substring(0,3));

        char kata[] = str.toCharArray();
//        kata[6] = 'B';
        System.out.println(kata);

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 1) {
                kata[i] = Character.toUpperCase(kata[i]);
            }
        }
        System.out.println(kata);
    }
}
