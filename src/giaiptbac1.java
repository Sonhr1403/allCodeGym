import java.util.Scanner;

public class giaiptbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chúng ta sẽ đi giải phương trình bậc 1 dạng a.x + b = c");
        System.out.println("Mời bạn nhập số a");
        float a = sc.nextFloat();
        System.out.println("Mời bạn nhập số b");
        float b = sc.nextFloat();
        System.out.println("Mời bạn nhập số c");
        float c = sc.nextFloat();

//        if (a == 0 && b == c) {
//            System.out.println("Phương trình vô số nghiệm");
//        } else if (a == 0 && b != c) {
//            System.out.println("Phương trình vô nghiệm");
//        } else {
//            float ketQua = (c - b) / a;
//            System.out.println("Nghiệm của phương trình là:" + ketQua);
//        }

        if (a != 0) {
            float ketQua = (c - b) / a ;
            System.out.println("Nghiệm của phương trình là: " + ketQua);
        } else {
            if (b == c) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
