import java.util.Scanner;

public class NumberToWord {
    public static String numberToWordBasic(int a) {
        switch (a) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                System.out.println("Out of ability!");
        }
        return "Some thing is wrong!!!";
    }

    public static String numberToWord1(int a) {
        return switch (a - 10) {
            case 0 -> "Ten";
            case 1 -> "Eleven";
            case 2 -> "Twelve";
            case 3 -> "Thirteen";
            case 4 -> "Fourteen";
            case 5 -> "Fifteen";
            case 6 -> "Sixteen";
            case 7 -> "Seventeen";
            case 8 -> "Eighteen";
            case 9 -> "Nineteen";
            default -> "Wrong!!!";
        };
    }

    public static String numberToWord2(int a) {
        switch (a) {
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 4:
                return "Fourty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            case 9:
                return "Ninety";
            default:
                System.out.println("Out of ability!");
        }
        return "Some thing is wrong!!!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập số của bạn:");
            int a = sc.nextInt();
            if (a < 0) {
                System.out.println("Mời bạn nhập lại!");
            } else if (a < 10) {
                System.out.println(numberToWordBasic(a));
            } else if (a < 20) {
                System.out.println(numberToWord1(a));
            } else if (a < 100) {
                System.out.println(numberToWord2(a / 10) + " " + numberToWordBasic(a % 10));
            } else if (a < 1000) {
                System.out.println(numberToWordBasic(a/100) + " Hundred And " + numberToWord2((a%100) / 10) + " " + numberToWordBasic((a%100) % 10));
            } else if (a == 1000) {
                break;
            }
        }
    }
}
