package ProjectSekolah;
import java.util.*;
public class Pelajaran {
    private final String subjectName;
    private int nilaiAsg;
    private int nilaiQuiz;
    private int nilaiFinal;
    public Pelajaran(String subjectName, int nilaiAsg, int nilaiQuiz, int nilaiFinal) {
        this.subjectName = subjectName;
        this.nilaiAsg = nilaiAsg;
        this.nilaiQuiz = nilaiQuiz;
        this.nilaiFinal = nilaiFinal;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public int getNilaiAsg() {
        return nilaiAsg;
    }
    public int getNilaiQuiz() {
        return nilaiQuiz;
    }
    public int getNilaiFinal() {
        return nilaiFinal;
    }
    public void setNilaiAsg(int nilaiAsg) {
        this.nilaiAsg = nilaiAsg;
    }
    public void setNilaiQuiz(int nilaiQuiz) {
        this.nilaiQuiz = nilaiQuiz;
    }
    public void setNilaiFinal(int nilaiFinal) {
        this.nilaiFinal = nilaiFinal;
    }

}
