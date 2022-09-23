package StaffManagement;

import java.util.Scanner;

public class Manage {
    public void AddStaff(Staff[] staff) {
        Scanner sc = new Scanner(System.in);
        Staff[] staff1 = new Staff[staff.length + 1];
        for (int i = 0; i < staff.length; i++) {
            staff1[i] = staff[i];
        }
        System.out.println("Nhập id nhân viên:");
        int id = sc.nextInt();
        System.out.println("Nhập name nhân viên:");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên:");
        int age = sc.nextInt();
        System.out.println("Nhập địa chỉ nhân viên:");
        String address = sc.nextLine();

        System.out.println("Bạn muốn thêm nhân viên nào:");
        System.out.println("1. Thêm nhân viên Fulltime");
        System.out.println("2. Thêm nhân viên Parttime");
        System.out.println("3. Trở lại");

        int choice2 = sc.nextInt();

        switch (choice2) {
            case 1:
                System.out.println("Nhập lương nhân viên Full-time:");
                int salary = sc.nextInt();
                staff1[staff1.length - 1] = new Fulltimestaff(id, name, age, address, salary);
                break;
            case 2:
                System.out.println("Nhập số ngày làm việc của nhân viên Part-time");
                int workday = sc.nextInt();
                staff1[staff1.length - 1] = new ParttimeStaff(id, name, age, address, workday);
                break;
            default:
                break;
        }


    }
}
