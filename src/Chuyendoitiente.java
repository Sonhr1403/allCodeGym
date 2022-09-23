import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        int iRate = 23000;
        System.out.println("Hãy nhập số tiền bạn cần đổi:");
        Scanner sc = new Scanner(System.in);
        int dola = sc.nextInt();
        int dong = dola*iRate;
        System.out.println(dola + " $ = " + dong + " VND");
    }
}
