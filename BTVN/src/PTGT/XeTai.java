package PTGT;

import java.util.Scanner;

public class XeTai extends PTGT{
    private double trongTai;

    public XeTai(int id, String hangSX, int namSX, int gia, String mau, double trongTai) {
        super(id, hangSX, namSX, gia, mau);
        this.trongTai = trongTai;
    }

    public XeTai() {
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println(
                ", trongTai = " + trongTai +
                '}' + " Xe Tải");
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Mời bạn nhập số chỗ ngồi: ");
        this.trongTai = Double.parseDouble(sc.nextLine());
    }
}
