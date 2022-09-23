import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("Hãy nhập tên của bạn:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Xin chào " + name);
    }
}
