package QuanLyHocVien;

import java.util.Date;

public class HocVien {
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String soDT;
    private Date ngaySinh;
    private Lop lop;

    public HocVien(String ten, int tuoi, String gioiTinh, String soDT, Date ngaySinh, Lop lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public HocVien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Lop getlop() {
        return lop;
    }

    public void setlop(Lop lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDT='" + soDT + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", lop=" + lop.toString() +
                '}';
    }
}
