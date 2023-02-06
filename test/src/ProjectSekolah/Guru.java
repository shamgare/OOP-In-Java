package ProjectSekolah;
import java.util.*;
public class Guru extends User {
    private final String subject;
    private final String accessCode;
    public Guru(String name, String email, int age, String password, String accessCode, String subject) {
        super(name, email, age, password);
        this.accessCode = accessCode;
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public String getAccessCode() {
        return accessCode;
    }
}
