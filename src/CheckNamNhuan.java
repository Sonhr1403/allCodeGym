import java.util.Scanner;

public class CheckNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm cần check:");
        int nam = sc.nextInt();
        boolean x = nam % 100 == 0 ? (nam % 400 == 0) : (nam % 4 == 0);

        if (x) {
            System.out.println(nam + " là năm nhuận");
        } else {
            System.out.println(nam + " là năm không nhuận");
        }
    }
}
