import java.util.Scanner;
public class Draw {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the bottom-left triangle");
            System.out.println("3. Draw the top-left triangle");
            System.out.println("4. Draw the bottom-right triangle");
            System.out.println("5.Draw the top-right triangle");
            System.out.println("6.Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 6 -> {
                    System.out.println("Draw the isosceles triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j >= 0; j--) {
                            if (j > i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                }
                case 5 -> {
                    System.out.println("Draw the top-right triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j >= 0; j--) {
                            if (j > i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                }
                case 4 -> {
                    System.out.println("Draw the bottom-right triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j >= 0; j--) {
                            if (j > i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    System.out.println("Draw the top-left triangle");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.println("Draw the bottom-left triangle");
                    for (int i = 1; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                case 1 -> {
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                }
                case 0 -> System.exit(0);
                default -> System.out.println("No choice!");
            }
        }
    }
}
