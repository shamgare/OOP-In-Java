package Session05;

public class Staff extends User {
    //    private String role;
    //    private int Role = 0;
    protected RoleStaff role = RoleStaff.Supervisor;
    protected Integer salary;

    public Staff(String name, String password, String email, RoleStaff role) {
        super(name, password, email);
        this.role = role;
    }

    // return string = string.format ("P%04d") (sprintf)
}
