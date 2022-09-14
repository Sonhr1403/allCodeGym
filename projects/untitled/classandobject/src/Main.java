import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Rectangle
//        System.out.print("Enter the width:");
//        double width = sc.nextDouble();
//        System.out.print("Enter the height:");
//        double height = sc.nextDouble();
//        Rectangle rectangle = new Rectangle(width, height);
//        System.out.println("Your Rectangle \n"+ rectangle.display());
//        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
//        System.out.println("Area of the Rectangle: "+ rectangle.getArea());

        //QuadraticEquation
//        QuadraticEquation qe = new QuadraticEquation();
//
//        System.out.println("Let find x from a*x*x + b*x +c = 0!");
//        System.out.println("Enter a:");
//        double i = sc.nextDouble();
//        qe.setA(i);
//        System.out.println("Enter b:");
//        double j = sc.nextDouble();
//        qe.setB(j);
//        System.out.println("Enter c:");
//        double k = sc.nextDouble();
//        qe.setC(k);
//
//        System.out.println("With a = " + qe.getA());
//        System.out.println("With b = " + qe.getB());
//        System.out.println("With c = " + qe.getC());
//
//        if (qe.getDiscriminant() > 0) {
//            System.out.println("Equation has 2 roots!");
//            System.out.println("Root1 = " + qe.getRoot1());
//            System.out.println("Root2 = " + qe.getRoot2());
//        } else if (qe.getDiscriminant() == 0) {
//            System.out.println("Equation has 1 root!");
//            System.out.println("Root = " + qe.getRoot1());
//        } else {
//            System.out.println("Equation has no root");
//        }

        //StopWatch
        StopWatch sw = new StopWatch();
        sw.start();
        System.out.println(sw.getStartTime());
        System.out.println("Nhập v: ");
        int v = sc.nextInt();
        System.out.println(v);
        sw.stop();
        System.out.println(sw.getEndTime());
        System.out.println(sw.getElapsedTime());

        // Fan
//        Fan fan1 = new Fan(3, true, 10, "yellow");
//        Fan fan2 = new Fan();
//        fan2.setSpeed(2);
//
//        System.out.println("Fan 1: " + fan1);
//        System.out.println("Fan 2: " + fan2);
    }
}
