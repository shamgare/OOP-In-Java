package ProjectSekolah;
import java.util.*;
public class User {
    private final String name;
    private final int age;
    private final String email;
    private final String password;

    public User(String name, String email, int age, String password) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
