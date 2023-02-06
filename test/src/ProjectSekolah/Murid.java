package ProjectSekolah;
import java.util.*;
public class Murid extends User {
    private final String nim;
    private final ArrayList<Pelajaran> pelajarans;
    public Murid(String name, String email, int age, String password, String nim) {
        super(name, email, age, password);
        this.nim = nim;
        ArrayList<Pelajaran> pelajarans = new ArrayList<>();
        Pelajaran p1 = new Pelajaran("Science", 0, 0, 0);
        Pelajaran p2 = new Pelajaran("Math", 0, 0, 0);
        Pelajaran p3 = new Pelajaran("English", 0, 0, 0);
        Pelajaran p4 = new Pelajaran("Indonesia", 0, 0, 0);
        pelajarans.add(p1);
        pelajarans.add(p2);
        pelajarans.add(p3);
        pelajarans.add(p4);
        this.pelajarans = pelajarans;
    }
    public String getNim() {
        return nim;
    }
    public ArrayList<Pelajaran> getPelajarans() {
        return pelajarans;
    }

}
