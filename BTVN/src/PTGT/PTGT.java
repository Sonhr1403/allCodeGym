package PTGT;

import java.util.Scanner;

public class PTGT {
    private int id;
    private String hangSX;
    private int namSX;
    private int gia;
    private String mau;

    public PTGT(int id, String hangSX, int namSX, int gia, String mau) {
        this.id = id;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.gia = gia;
        this.mau = mau;
    }

    public PTGT() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void hienthi() {
        System.out.print('{' +
                "id = " + id +
                ", hangSX = " + hangSX +
                ", namSX = " + namSX +
                ", gia = " + gia +
                ", mau = " + mau);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập ID: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Mời bạn nhập hãng sản xuất: ");
        this.hangSX = sc.nextLine();
        System.out.print("Mời bạn nhập năm sản xuất: ");
        this.namSX = Integer.parseInt(sc.nextLine());
        System.out.print("Mời bạn nhập giá tiền: ");
        this.gia = Integer.parseInt(sc.nextLine());
        System.out.print("Mời bạn nhập màu sắc: ");
        this.mau = sc.nextLine();
    }
}
