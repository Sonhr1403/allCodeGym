package menu;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[0];

        while (true) {
            System.out.println("Bạn muốn làm gì:");
            System.out.println("1. Quản lý mảng");
            System.out.println("2. Credits");
            System.out.println("3. Thoát chương trình");
            int choice1 = sc.nextInt();
            System.out.println();
            switch (choice1) {
                case 1 -> {
                    System.out.println("Bạn muốn làm gì tiếp:");
                    System.out.println("1. Thêm 1 phần tử vào mảng");
                    System.out.println("2. Sửa 1 phần tử trong mảng");
                    System.out.println("3. Xóa 1 phần tử trong mảng");
                    System.out.println("4. Hiển thị mảng");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1 -> {
                            int[] newArr = new int[arr.length + 1];
                            System.out.println("Bạn muốn thêm số mấy:");
                            int num = sc.nextInt();
                            System.out.println("Bạn muốn thêm vào vị trí nào:");
                            int index = sc.nextInt();
                            for (int i = 0; i <= arr.length; i++) {
                                if (i < index) {
                                    newArr[i] = arr[i];
                                } else {
                                    if (i > index) {
                                        newArr[i] = arr[i - 1];
                                    } else {
                                        newArr[i] = num;
                                    }
                                }
                            }
                            arr = newArr;
                            System.out.println(Arrays.toString(arr));
                            System.out.println();
                        }
                        case 2 -> {
                            int[] newArr1 = new int[arr.length];
                            System.out.println("1. Bạn muốn sửa theo số");
                            System.out.println("2. Bạn muốn sửa vị trí");
                            int choice3 = sc.nextInt();
                            System.out.println("Hãy nhập số bạn muốn sửa thành:");
                            int num1 = sc.nextInt();
                            if (choice3 == 1) {
                                System.out.println("Hãy nhập số cần sửa:");
                                int num2 = sc.nextInt();
                                for (int i = 0; i < arr.length; i++) {
                                    if (arr[i] == num2) {
                                        newArr1[i] = num1;
                                    } else {
                                        newArr1[i] = arr[i];
                                    }
                                }
                            } else if (choice3 == 2) {
                                System.out.println("Hãy nhập vị trí bạn muốn sửa");
                                int index1 = sc.nextInt();
                                for (int i = 0; i < arr.length; i++) {
                                    if (i == index1) {
                                        newArr1[i] = num1;
                                    } else {
                                        newArr1[i] = arr[i];
                                    }
                                }
                            }
                            arr = newArr1;
                            System.out.println(Arrays.toString(arr));
                            System.out.println();
                        }
                        case 3 -> {
                            int[] newArr3 = new int[arr.length - 1];
                            System.out.println("Bạn muốn xóa vị trí nào:");
                            int index3 = sc.nextInt();
                            int vitri = 0;
                            for (int i = 0; i < arr.length; i++) {
                                if (i != index3) {
                                    newArr3[vitri] = arr[i];
                                    vitri++;
                                }
                            }
                            arr = newArr3;
                            System.out.println(Arrays.toString(arr));
                            System.out.println();
                        }
                        case 4 -> {
                            System.out.println(Arrays.toString(arr));
                            System.out.println();
                        }
                        default -> {
                            System.out.println("Bạn đã nhập sai!");
                            System.out.println("Mời bạn nhập lại");
                            System.out.println();
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Ứng dụng được làm bởi Nguyễn Bảo Sơn");
                    System.out.println("Ý tưởng Coach Toàn");
                    System.out.println("Sửa chữa Sỹ");
                    System.out.println();
                }
                case 3 -> System.exit(0);
                default -> {
                    System.out.println("Bạn đã nhập sai!");
                    System.out.println("Mời bạn nhập lại");
                    System.out.println();
                }
            }
        }
    }
}
