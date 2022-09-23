import static java.lang.Math.sqrt;

public class PrimeNumberto100 {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {
            boolean check = true;
            for (int i = 2; i <= sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number);
            }
        }
    }
}
