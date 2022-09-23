
//import java.util.Arrays;

import static java.lang.Math.sqrt;

public class baitap {
    public static void main(String[] args) {
        double[] arr = {3,9,7,6,4,22,11,-13};
//        System.out.println(timmax(arr));
//        System.out.println(timmin(arr));
//        System.out.println(dao(arr));
//        System.out.println(them(arr,16,2));
//        System.out.println(xoa(arr, 2));
        System.out.println(prime(arr));
    }
//    public static double timmax (double[] array1) {
//        double max = array1[0];
//        for (int i = 1; i < array1.length; i++) {
//            if (max < array1[i]) {
//                max = array1[i];
//            }
//        }
//        return max;
//    }
//    public static double timmin (double[] array2) {
//        double min = array2[0];
//        for (int i = 1; i < array2.length; i++) {
//            if (min > array2[i]) {
//                min = array2[i];
//            }
//        }
//        return min;
//    }
//
//    public static String dao (double[] array3) {
//        double[] newArr = new double[array3.length];
//        for (int i = 0; i < array3.length; i++) {
//            newArr[i] = array3[array3.length-1-i];
//        }
//return Arrays.toString(newArr);
//    }
//
//    public static String them (double[] array3,int x,int index) {
//        double[] newArr = new double[array3.length+1];
//        for (int i = 0; i < array3.length+1; i++) {
//            if (i < index) {
//                newArr[i] = array3[i];
//            } else if (i > index) {
//                newArr[i] = array3[i-1];
//            } else {
//                newArr[i] = x;
//            }
//        }
//        return Arrays.toString(newArr);
//    }
//
//    public static String xoa (double[] array4, int index) {
//        double[] newArr = new double[array4.length-1];
//        for (int i = 0; i < array4.length; i++) {
//            if (i < index) {
//                newArr[i] = array4[i];
//            } else if (i > index) {
//                newArr[i-1] = array4[i];
//            }
//        }
//        return Arrays.toString(newArr);
//    }

    public static String prime (double[] array5) {
        for (double v : array5) {
            if (v == 2) {
                System.out.println("Số nguyên tố trong mảng là: " + v);
            } else if (v > 0) {
                boolean check = true;
                for (int j = 2; j <= sqrt(v); j++) {
                    if (v % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println("Số nguyên tố trong mảng là: " + v);
                }
            }
        }
        return "";
    }
}
