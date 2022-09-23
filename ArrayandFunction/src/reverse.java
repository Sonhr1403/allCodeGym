import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        double[] arr = {3, 9, 7, 6, 4, 22, -13};
        System.out.println(dao(arr));
    }

    public static String dao(double[] array3) {
        double[] newArr = new double[array3.length];
        for (int i = 0; i < array3.length; i++) {
            newArr[i] = array3[array3.length - 1 - i];
        }
        return Arrays.toString(newArr);
    }
}
