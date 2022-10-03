package QuanLyHocVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class QuanLy {
    Scanner sc = new Scanner(System.in);
    ArrayList<HocVien> listHocVien = new ArrayList<>();
    ArrayList<Lop> listLop = new ArrayList<>();

    public QuanLy() {
        listLop.add(new Lop(1, "C0722G1"));
        listLop.add(new Lop(2, "C0922G1"));
    }

    void menu() {
        while (true) {
            System.out.println();
            System.out.println("----------MENU----------");
            System.out.println("1. Thêm học viên");
            System.out.println("2. Hiển thị học viên");
            System.out.println("3. Hiển thị học viên theo lớp");
            System.out.println("4. Thoát chương trình");
            System.out.print("Bạn hãy chọn số: ");

            int choice1 = checkLoiNhap();
            System.out.println();

            switch (choice1) {
                case 1 -> //Thêm
                        them();
                case 2 -> //Hiển thị
                        hienthi();
                case 3 -> //Hiển thị theo lớp
                        hienthitheolop();
                case 4 -> //Thoát
                        System.exit(0);
            }
        }
    }

    void them() {
        System.out.print("Hãy nhập tên học viên: ");
        String ten = sc.nextLine();
        System.out.print("Hãy nhập tuổi học viên: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Hãy nhập giới tính: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Hãy nhập số điện thoại: ");
        String soDT = sc.nextLine();
        Date dateTime;

        while (true) {
            System.out.print("Hãy nhập ngày sinh theo định dạng dd/MM/yyyy: ");
            String ngaySinh = sc.nextLine();
            try {
                dateTime = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
                break;
            } catch (ParseException e) {
                System.out.println("Bạn đã nhập sai định dạng");
            }
        }

        for (int i = 0; i < listLop.size(); i++) {
            System.out.println(i + 1 + " : " + listLop.get(i).getTenLop());
        }
        System.out.print("Hãy chọn lớp theo số: ");
        int choice2 = Integer.parseInt(sc.nextLine());
        Lop lop = listLop.get(choice2 - 1);

        HocVien hocVien = new HocVien(ten, tuoi, gioiTinh, soDT, dateTime, lop);
        listHocVien.add(hocVien);
        System.out.println();
    }

    void hienthi() {
        for (HocVien x: listHocVien) {
            System.out.println(x.toString());
        }
    }

    void hienthitheolop() {
        System.out.println("----------MENU----------");
        System.out.println("Bạn muốn hiển thị lớp theo: ");
        System.out.println("1. ID");
        System.out.println("2. Tên lớp");
        System.out.print("Hãy lựa chọn: ");
        int choice3 = checkLoiNhap();
        if (choice3 == 1) {
            System.out.print("Hãy nhập ID lớp: ");
            int id = checkLoiNhap();
            for (HocVien x: listHocVien) {
                if (id == x.getlop().getId()) {
                    System.out.println(x);
                }
            }
        } else if (choice3 == 2) {
            System.out.print("Hãy nhập tên lớp: ");
            String tenLop = sc.nextLine();
            for (HocVien x: listHocVien) {
                if (Objects.equals(tenLop, x.getlop().getTenLop())) {
                    System.out.println(x);
                }
            }
        }
    }

    int checkLoiNhap() {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if(choice < 0 || choice > 4){
                    System.out.print("Không có lựa chọn này! Mời bạn nhập lại: ");
                }
                else break;
            } catch (Exception e) {
                System.out.print("Không có lựa chọn này! Mời bạn nhập lại: ");
            }
        }
        return choice;
    }
}
