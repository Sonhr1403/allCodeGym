package StaffManagement;

public class ParttimeStaff extends Staff {
    private int salary;
    private int workday;

    public ParttimeStaff() {
    }

    public ParttimeStaff(int id, String name, int age, String address, int workday) {
        super(id, name, age, address);
        this.workday = workday;
    }

    public int getSalary() {
        return workday * 120000;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public void Show() {
        System.out.println("Lương nhân viên " + getName() + " là: " + getSalary());
    }
}
