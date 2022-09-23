public class findmin {
    public static void main(String[] args) {
        double[] arr = {3, 9, 7, 6, 4, 22, 11, -13};
        System.out.println(timmin(arr));
    }

    public static double timmin(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}