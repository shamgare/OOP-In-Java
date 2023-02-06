package Session05;

public class Main {
    public static void main(String[] args) {
        Staff budi = new Staff("Budi", "Budi123", "budi@gmail.com", RoleStaff.Manager);
        budi.salary = 20000000;
        boolean result = budi.login("budi@gmail.com", "Budi123");
        if (result) {
            System.out.println("Successfully Logged In");
        } else {
            System.out.println("Login Failed");
        }
    }
}

class User {
    // nama, password, email
    protected String name;
    protected String password;
    protected String email;
    protected String DoB;
    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}

class Customer extends User {
    private String membership;
    private Integer point;
    public Customer(String name, String password, String email) {
        super(name, password, email);
    }
}