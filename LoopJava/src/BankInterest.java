import java.util.Scanner;
public class BankInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số tiền bạn muốn gửi tiết kiệm:");
        double tien = sc.nextDouble();

        System.out.println("Nhập số tháng bạn muốn gửi:");
        int thang = sc.nextInt();

        System.out.println("Nhập số lãi suất:");
        double laiSuat = sc.nextDouble();

        double tongLaiSuat = 0;
        for(int i = 0; i < thang; i++){
            tongLaiSuat += tien * (laiSuat/100)/12 * thang;
        }
        System.out.println("Tổng lãi suất bạn nhận được là: " + tongLaiSuat);
    }
}
