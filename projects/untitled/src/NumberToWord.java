import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số của bạn:");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("Mời bạn nhập lại!");
        } else if (a < 10) {
            switch (a) {
                case 0: System.out.println("Không");
                break;
                case 1: System.out.println("Không");
                    break;
                case 2: System.out.println("Không");
                    break;
                case 3: System.out.println("Không");
                    break;
                case 4: System.out.println("Không");
                    break;
                case 5: System.out.println("Không");
                    break;
                case 6: System.out.println("Không");
                    break;


            }
        }
    }
}
