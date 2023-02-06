package ProjectSekolah;
import java.util.*;

public class Sekolah {
    // declare
    private final ArrayList<User> userList = new ArrayList<>();
    private final ArrayList<Guru> guruList = new ArrayList<>();
    private final ArrayList<Murid> muridList = new ArrayList<>();
    private final ArrayList<Pelajaran> pelajaranList = new ArrayList<>();

    // getter
    public ArrayList<User> getUserList() {
        return userList;
    }
    public ArrayList<Guru> getGuruList() {
        return guruList;
    }
    public ArrayList<Murid> getMuridList() {
        return muridList;
    }
    public ArrayList<Pelajaran> getPelajaranList() {
        return pelajaranList;
    }

    // add
    public void addUser(User user) {
        userList.add(user);
    }
    public void addGuru(Guru guru) {
        guruList.add(guru);
    }
    public void addMurid(Murid murid) {
        muridList.add(murid);
    }
    public void addPelajaran(Pelajaran pelajaran) {
        pelajaranList.add(pelajaran);
    }
}
