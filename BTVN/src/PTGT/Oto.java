package PTGT;

import java.util.Scanner;

public class Oto extends PTGT{
    private int soChoNgoi;
    private String kieuDongCo;

    public Oto(int id, String hangSX, int namSX, int gia, String mau, int soChoNgoi, String kieuDongCo) {
        super(id, hangSX, namSX, gia, mau);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public Oto() {
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Mời bạn nhập số chỗ ngồi: ");
        this.soChoNgoi = Integer.parseInt(sc.nextLine());
        System.out.print("Mời bạn nhập kiểu động cơ: ");
        this.kieuDongCo = sc.nextLine();
    }

    public void hienthi() {
        super.hienthi();
        System.out.println(
                ", soChoNgoi = " + soChoNgoi +
                ", kieuDongCo = " + kieuDongCo +
                '}' + " Oto");
    }
}
