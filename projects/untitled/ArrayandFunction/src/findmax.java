public class findmax {
    public static void main(String[] args) {
        double[] arr = {3,9,7,6,4,22,-13};
        System.out.println(timmax(arr));
    }

    public static double timmax (double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
