package Calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Rectangle
        System.out.println("Nhập chiều dài hình chữ nhật:");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều cao hình chữ nhật:");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Điện tích hình chữ nhật là: " + rectangle.getArea());

        //Square
        System.out.println("Nhập cạnh hình vuông: ");
        double side = sc.nextDouble();
        Sqare sqare = new Sqare(side);
        System.out.println("Diện tích hình vuông là: " + sqare.getArea());

        //Circle
        System.out.println("Nhập bán kính hình tròn: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Diện tích hình tròn là: " + circle.getArea());
        System.out.println("Chu vi hình tròn là:" + circle.getPerimeter());
    }
}
