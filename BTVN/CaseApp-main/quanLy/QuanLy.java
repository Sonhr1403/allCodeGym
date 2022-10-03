package quanLy;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<TheMuon> listTheMuon = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    void NhapPhieu() {
        do {
//            SinhVien sinhVien = new SinhVien();
//            sinhVien.nhap();
            TheMuon theMuon = new TheMuon();
            theMuon.nhapds();
            listTheMuon.add(theMuon);

            System.out.println("Ban co muon nhap tiep hay khong ? N/Y");
        }
            while (scanner.nextLine().equalsIgnoreCase("y")) ;

    }
    void inds(){
        for (TheMuon x: listTheMuon) {
            x.xuatds();
        }
    }

    void timSach(){
        int i=0;
        while (i<listTheMuon.size()){
            if (listTheMuon.get(i).getHanTra().equals("30")){
                listTheMuon.get(i).xuatds();
            }
            i++;
        }
    }


    void menu(){
        int choice;
        do {
            System.out.println("\n========================================");
            System.out.println("1: Nhap danh sach phieu muon ");
            System.out.println("2: Xuat danh sach ");
            System.out.println("3: Ten sach muon can tra vao cuoi thang va thong tin sinh vien do:   ");
            System.out.println("0: Exit ");
            System.out.println("\n========================================");
            System.out.println("Lua chon: ");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    NhapPhieu();
                    break;
                case 2:
                    inds();
                    break;
                case 3:
                    timSach();
                    break;
                case 0:
                    System.out.println("Cam on");
                    break;
            }
        }while (choice != 0);
    }
}
