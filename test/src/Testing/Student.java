package Testing;
import java.util.*;

public class Student {
    String name; Integer age; String nim;
    static Scanner sc = new Scanner(System.in);
    public Student(String name, String nim, Integer age) {
        this.name = name;
        this.age = age;
        this.nim = nim;
    }
    public void print() {
        System.out.println(name);
        System.out.println(nim);
        System.out.println(age);
    }
}

