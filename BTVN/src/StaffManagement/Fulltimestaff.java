package StaffManagement;

public class Fulltimestaff extends Staff {
    private int salary = 0;

    public Fulltimestaff(int id, String name, int age, String address, int salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public Fulltimestaff() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void Show() {
        System.out.println("Lương nhân viên " + getName() + " là: " + getSalary());
    }

}
