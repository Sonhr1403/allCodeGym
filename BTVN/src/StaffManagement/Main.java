package StaffManagement;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff[] staff = new Staff[1];

        while (true) {
            System.out.println("Bạn muốn làm gì:");
            System.out.println("1. Hiển thị nhân viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Thoát");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(Arrays.toString(staff));
                    break;
                case 2:

                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Bạn đã chọn nhầm!");
                    break;
            }
        }
    }
}
