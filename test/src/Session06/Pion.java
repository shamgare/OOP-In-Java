package Session06;

import java.util.ArrayList;

public class Pion extends Perwira {

    public Pion(char col, int row, WarnaEnum warna) {
        super(col, row, warna);
    }

    @Override
    public ArrayList<Sel> kemungkinanJalan() {
//        return super.kemungkinanJalan();
        ArrayList<Sel> jalan =  new ArrayList<>();
        if(getWarna() == WarnaEnum.PUTIH) {
            jalan.add(new Sel(posisi.col, posisi.row + 1));
        } else {
            jalan.add(new Sel(posisi.col, posisi.row - 1));
        }
        return jalan;
    }
}
