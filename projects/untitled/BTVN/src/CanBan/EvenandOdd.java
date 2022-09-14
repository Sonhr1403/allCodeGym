package CanBan;

import java.util.Scanner;

public class EvenandOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số cần kiểm tra xuống dưới đây:");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " là số chẵn");
        } else {
            System.out.println(x + " là số lẻ");
        }
    }
}
