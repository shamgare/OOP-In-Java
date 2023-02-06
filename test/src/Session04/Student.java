package Session04;
// alt j = ctrl d
public class Student {
    // attributes
    private String id;
    private String name;
    private String className;
    public void setName(String name) {
        if(name.length() > 20) {
            throw new IllegalArgumentException("Kepanjangan namanya");
        }
        this.name = name;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    private int score;

    // method (functions)
    public Student(String name, String className) {
        id = "" + (long) (Math.random() * 4000000000L);
        // string ditambah apapun jadi string
        setName(name);
        this.className = className;
        // atau name = nama;
    }
    void study() {
        if (score + 10 < 100) {
            score += 10;
        } else {
            score = 100;
        }
        System.out.println("Studying..");
    }

    void show() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Score : " + score);
        System.out.println("Class : " + className);
    }

    int getScore() {
        return score;
    }

    void setScore(int score) {
        if (score > 100 || score < 0) {
            throw new IllegalArgumentException("Score must be in range 0 to 100");
        }
        this.score = score;
    }

    /* access modifier -> encapsulation (memprotect)
     *                     class | package | turunan | public
     * public              x     | x       | x       | x
     * protected           x     | x       | x       |
     * package/default     x     | x       |         |
     * private             x     |         |         |
     *
     * setter / getter
     */
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Stephennnnnnnnnnnnnnn", "PPTI 16");
        student1.show();
        student1.study();
        student1.study();
        student1.setScore(1000);
        student1.show();
    }
}
