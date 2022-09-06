import java.util.Scanner;

public class Tinhsongay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập tháng cần check số ngày:");
        int a = sc.nextInt();

        switch (a) {
            case 2:
                System.out.println("Hãy nhập số năm:");
                int b = sc.nextInt();
                if (b % 400 == 0) {
                    System.out.println("Tháng " + a + " năm " + b + " có 29 ngày");
                } else {
                    if (b % 100 != 0 && b % 4 == 0) {
                        System.out.println("Tháng " + a + " năm " + b + " có 29 ngày");
                    } else {
                        System.out.println("Tháng " + a + " năm " + b + " có 28 ngày");
                    }
                }
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Tháng " + a + " có 31 ngày");
                break;
            case 4, 6, 9, 11:
                System.out.println("Tháng " + a + " có 30 ngày");
                break;
            default:
                System.out.println("Bạn đã nhập sai mời bạn nhập lại");
        }
    }
}
