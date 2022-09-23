import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {1,4,3,9,99,7,46,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập phần tử cần xóa: ");
        int x = sc.nextInt();
        if (findX(x, arr) == -1) {
            System.out.println("Không có phần tử cần tìm trong mảng!");
        } else {
            System.out.println("Vị trí phần tử " + x + " là: " + findX(x,arr));
        }
    }
    public static int findX(int x, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;

    }
}