package quanLy;

import java.util.Scanner;

public class TheMuon {
    private int soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieuSach; // ten sach
    private SinhVien sinhVien;

    public TheMuon() {
    }

    public TheMuon(int soPhieuMuon, String ngayMuon, String hanTra, String soHieuSach, SinhVien sinhVien) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
        this.sinhVien = sinhVien;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }
    Scanner scanner = new Scanner(System.in);
    public void nhapds(){

        SinhVien sinhVien1 = new SinhVien();

        System.out.println("Nhap so phieu muon: ");
        this.soPhieuMuon = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ngay muon: ");
        this.ngayMuon = scanner.nextLine();
        System.out.println("Nhap ngay tra: ");
        this.hanTra = scanner.nextLine();
        System.out.println("Nhap so hieu sach: ");
        this.soHieuSach = scanner.nextLine();

        this.sinhVien = sinhVien1;

        sinhVien1.nhap();
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "soPhieuMuon=" + soPhieuMuon +
                ", ngayMuon='" + ngayMuon + '\'' +
                ", hanTra='" + hanTra + '\'' +
                ", soHieuSach='" + soHieuSach + '\'' +
                ", sinhVien=" + sinhVien +
                '}';
    }

    public void xuatds(){
        System.out.println("TheMuon{" +
                "soPhieuMuon=" + soPhieuMuon +
                ", ngayMuon='" + ngayMuon + '\'' +
                ", hanTra='" + hanTra + '\'' +
                ", soHieuSach='" + soHieuSach + '\'' +
                ", sinhVien=" + sinhVien +
                '}');
    }
}
