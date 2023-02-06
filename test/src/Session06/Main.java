package Session06;

import java.util.ArrayList;

public class Main {
/*
        overloading dan overriding
        overloading :
        - nama func harus sama
        - jumlah parameter beda
        - tipe data parameter beda
        - biasanya dalam satu class

        overriding  :
        - nama func sama
        - beda antar class

        abstract class -> class yg memiliki abstract method / func
        abstract method -> method yg belum di deskripsikan

        interface:
        - semua funcnya abstract
        - semua atributnya konstanta
 */
    public static void main(String[] args) {
//        Perwira p = new Perwira('A', 1, WarnaEnum.PUTIH);
        Pion pion = new Pion('A', 2, WarnaEnum.PUTIH);

        ArrayList<Sel> jalan = pion.kemungkinanJalan();
        for (Sel sel: jalan) {
            System.out.println("" + sel.col + sel.row);
        }

    }
}
/*

 */
