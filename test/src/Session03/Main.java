package Session03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int twoD[][] = new int[30][30];
        ArrayList<Integer> score = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            score.add((int) (Math.random() * 1000));
        }
//        score.set(5,5);
//        score.sort((a,b) -> a.compareTo(b));
//        score.sort((a,b) -> a > b ? 1 : a < b ? -1 : 0);
//        score.sort((a,b) -> Integer.compare(a,b));
        score.remove(0);
        score.remove(score.size() - 1);

        System.out.println("size : " + score.size());

        for (int i = 0; i < 100; i++) {
            System.out.println(score.get(i));
        }
    }
}
