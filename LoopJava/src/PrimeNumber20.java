public class PrimeNumber20 {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int N = 2;
        System.out.println(N);
        while (count < number - 1) {
            boolean check = true;
            N++;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(N);
                count++;
            }
        }
    }
}
