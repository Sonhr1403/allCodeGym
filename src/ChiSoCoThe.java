import java.util.Scanner;

public class ChiSoCoThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chỉ số cân nặng của bạn theo kg:");
        double weight = sc.nextDouble();
        System.out.println("Nhập chỉ số chiều cao của bạn theo mét:");
        double height = sc.nextDouble();
        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("Bạn quá gầy");
        } else if (bmi < 25) {
            System.out.println("Bạn bình thường");
        } else if (bmi < 30) {
            System.out.println("Bạn hơi thừa cân");
        } else {
            System.out.println("Giảm cân đi! Bạn mập quá rồi");
        }
    }
}
