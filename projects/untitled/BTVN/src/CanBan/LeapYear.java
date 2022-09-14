package CanBan;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập năm cần kiểm tra ở đây:");
        int a = sc.nextInt();
        boolean x = (a % 100 == 0) ? (a % 400 == 0) : (a % 4 == 0);

        if (x) {
            System.out.println(a + " là năm nhuận");
        } else {
            System.out.println(a + " là năm không nhuận");
        }
    }
}
