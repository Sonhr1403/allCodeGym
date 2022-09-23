import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 9, 99, 7, 46, 2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập phần tử cần xóa: ");
        int x = sc.nextInt();
        int index_del = findX(x, arr);
        if (index_del == -1) {
            System.out.println("Không có phần tử cần tìm trong mảng!");
        } else {
            System.out.println("Vị trí phần tử " + x + " là: " + index_del);
        }
        System.out.println(Arrays.toString(delx(index_del, arr)));
    }

    public static int findX(int x, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int[] delx(int index_del, int[] arr) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index_del) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        return newArr;
    }
}
