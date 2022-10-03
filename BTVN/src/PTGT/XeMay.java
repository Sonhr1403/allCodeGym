package PTGT;

import java.util.Scanner;

public class XeMay extends PTGT{
    private double congXuat;

    public XeMay(int id, String hangSX, int namSX, int gia, String mau, double congXuat) {
        super(id, hangSX, namSX, gia, mau);
        congXuat = congXuat;
    }

    public XeMay() {
    }

    public double getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(double congXuat) {
        congXuat = congXuat;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Mời bạn nhập số công xuất: ");
        this.congXuat = Double.parseDouble(sc.nextLine());
    }

    public void hienthi() {
        super.hienthi();
        System.out.println(", công xuất = " + congXuat + '}' + " Xe Máy");
    }
}
