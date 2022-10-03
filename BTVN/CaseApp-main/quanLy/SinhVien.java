package quanLy;

import java.util.Scanner;

public class SinhVien {
    private String MaSV;
    private String HoTen;
    private String Date;
    private String Lop;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String date, String lop) {
        MaSV = maSV;
        HoTen = hoTen;
        Date = date;
        Lop = lop;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }
    Scanner scanner = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma sinh vien: ");
        this.MaSV = scanner.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        this.HoTen = scanner.nextLine();
        System.out.println("Nhap ngay sinh sinh vien: ");
        this.Date = scanner.nextLine();
        System.out.println("Nhap lop sinh vien: ");
        this.Lop = scanner.nextLine();

    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "MaSV='" + MaSV + '\'' +
                ", HoTen='" + HoTen + '\'' +
                ", Date='" + Date + '\'' +
                ", Lop='" + Lop + '\'' +
                '}';
    }

    public void xuat(){
        System.out.println("SinhVien{" +
                "MaSV='" + MaSV + '\'' +
                ", HoTen='" + HoTen + '\'' +
                ", Date='" + Date + '\'' +
                ", Lop='" + Lop + '\'' +
                '}');
    }
}
