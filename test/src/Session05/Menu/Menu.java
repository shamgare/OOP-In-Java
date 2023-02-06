package Session05.Menu;

import Session05.RoleStaff;
import Session05.Staff;

public class Menu {
    public static void main(String[] args) {
        Staff ani = new Staff("Ani", "Ani123", "ani@gmail.com", RoleStaff.Outsource);
        ani.login("ani@gmail.com", "ani123");
    }
}
