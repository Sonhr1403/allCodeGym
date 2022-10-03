package PTGT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy{
    ArrayList<PTGT> listPTGT = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("-----------Menu-----------");
            System.out.println("1. Cập nhật các phương tiện");
            System.out.println("2. Tìm phương tiện theo hãng sản xuất hoặc màu");
            System.out.println("3. Sắp xếp phương tiện theo ID");
            System.out.println("4. Hiện thị danh sách các phương tiên");
            System.out.println("5. Thoát chương trình");
            System.out.println("Mời bạn chọn phương án:");

            int choice1 = checkLoiNhap();

            switch (choice1) {
                case 1 -> { //Thêm, sửa, xóa
                    System.out.println();
                    System.out.println("-----------Menu-----------");
                    System.out.println("1. Thêm phương tiện");
                    System.out.println("2. Sửa phương tiện (theo ID)");
                    System.out.println("3. Xóa phương tiện (theo ID)");
                    System.out.println("Mời bạn chọn phương án:");
                    int choice2 = checkLoiNhap();
                    System.out.println();
                    switch (choice2) {
                        case 1 -> { //Thêm
                            this.them();
                            System.out.println();
                        }
                        case 2 -> { //Sửa
                            this.sua();
                            System.out.println();
                        }
                        case 3 -> { //Xóa
                            this.xoa();
                            System.out.println();
                        }
                        default -> {
                            System.out.println("Không có lựa chọn này!");
                            System.out.println();
                        }
                    }
                }
                case 2 -> { //Tìm theo hãng hoặc theo màu
                    System.out.println("-----------Menu-----------");
                    System.out.println("1. Tìm phương tiện theo hãng");
                    System.out.println("2. Tìm phương tiện theo màu");
                    System.out.println("Mời bạn chọn phương án:");
                    int choice3 = checkLoiNhap();
                    switch (choice3) {
                        case 1 -> //Theo hãng
                                System.out.println();
                        case 2 -> //Theo màu
                                System.out.println();
                        default -> {
                            System.out.println("Không có lựa chọn này!Mời bạn nhập lại: ");
                            System.out.println();
                        }
                    }
                }
                case 3 -> { //Sắp xếp theo ID
                    sapXep();
                    System.out.println();
                }
                case 4 -> {//Hiển thị
                    hienthi();
                    System.out.println();
                }
                case 5 -> System.exit(0);
                default -> System.out.println("Không có lựa chọn này! Mời bạn nhập lại:");
            }
        }
    }

    public void them() {
        System.out.println("-----------Menu-----------");
        System.out.println("Hãy chọn phương tiện:");
        System.out.println("1. Xe máy");
        System.out.println("2. Ô tô");
        System.out.println("3. Xe tải");
        System.out.println("Mời bạn chọn phương án:");
        int choice4 = checkLoiNhap();
        System.out.println();
        switch (choice4) {
            case 1 -> { //xe máy
                XeMay xeMay = new XeMay();
                xeMay.nhap();
                listPTGT.add(xeMay);
            }
            case 2 -> { //oto
                Oto oto = new Oto();
                oto.nhap();
                listPTGT.add(oto);
            }
            case 3 -> { //xe tải
                XeTai xeTai = new XeTai();
                xeTai.nhap();
                listPTGT.add(xeTai);
            }
            default -> System.out.println("Không có lựa chọn này!");
        }
        System.out.println();
        hienthi();
    }

    public void hienthi() {
        for (PTGT x : listPTGT) {
            x.hienthi();
        }
    }

    public void sua() {
        System.out.print("Mời bạn nhập ID: ");
        int idnhap = checkLoiNhap();
        int i = 0;

        while (i < listPTGT.size()) {
            if (listPTGT.get(i).getId() == idnhap) {
                if (listPTGT.get(i) instanceof XeMay) {
                    listPTGT.get(i).nhap();
                } else if (listPTGT.get(i) instanceof Oto) {
                    listPTGT.get(i).nhap();
                } else if (listPTGT.get(i) instanceof XeTai) {
                    listPTGT.get(i).nhap();
                } else {
                    System.out.println("Không có!");
                }
            }
            i++;
        }
        hienthi();
    }

    void xoa() {
        System.out.print("Mời bạn nhập ID: ");
        int index = checkLoiNhap();
        int i = 0;

        while (i <= listPTGT.size()) {
            if (i == index) {
                listPTGT.remove(index);
            }
            i++;
        }
        hienthi();
    }

    public void sapXep() {
        Comparator<PTGT> com1 = new Comparator<>() {
            public int compare(PTGT o1, PTGT o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        };
        listPTGT.sort(com1);
        hienthi();
    }

    int checkLoiNhap() {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if(choice < 0 || choice > 5){
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
