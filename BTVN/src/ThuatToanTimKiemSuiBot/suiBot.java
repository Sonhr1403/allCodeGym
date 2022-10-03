package ThuatToanTimKiemSuiBot;
import java.util.Arrays;

public class suiBot {
    public static void bubbleSort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {3,4,7,9,1,67,43,22};
        bubbleSort1(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = {9,3,7,2,17,99,74,55};
        bubbleSort2(array2);
        System.out.println(Arrays.toString(array2));
    }

    public static void bubbleSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}