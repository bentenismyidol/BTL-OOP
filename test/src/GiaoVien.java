import java.util.Scanner;

public class GiaoVien extends CanBo{
    private int soTietDay;

    private static double tienTietDay = 45000;

    public GiaoVien() {

    }
    public GiaoVien(String hoTen, String donViCongTac, double heSoLuong, double phuCap,int soTietDay) {
        super(hoTen, donViCongTac, heSoLuong, phuCap);
        this.soTietDay = soTietDay;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public static double getTienTietDay() {
        return tienTietDay;
    }

    public static void setTienTietDay(double tienTietDay) {
        GiaoVien.tienTietDay = tienTietDay;
    }

    public double tinhLuong() {
        return super.getHeSoLuong() * getLuongCoBan() + super.getPhuCap() + soTietDay*getTienTietDay();
    }

    public String inTTin() {
        return "Tên giáo viên là: " + this.gethoTen() + "\nTrực thuộc đơn vị công tác: " + this.getDonViCongTac() + "\nLương của giáo viên là: " + this.tinhLuong();
    }
}