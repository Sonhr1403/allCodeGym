import java.util.Scanner;

public class chuyendoinhietdo {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius*9/5 +32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9)*(fahrenheit - 32);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Hãy chọn cách đổi nhiệt độ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Hãy nhập số độ F: ");
                    double a = sc.nextDouble();
                    System.out.println(a + " độ F = " + fahrenheitToCelsius(a) + " độ C\n");
//                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Hãy nhập số độ C: ");
                    double b = sc.nextDouble();
                    System.out.println(b + " độ C = " + celsiusToFahrenheit(b) + " độ F \n");
//                    System.out.println();
                }
                case 0 -> System.exit(0);
            }
        }
        while (choice != 0);
    }
}
