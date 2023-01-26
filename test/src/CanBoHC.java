import java.util.Scanner;

public class CanBoHC extends CanBo{
    private int soNgayCong;

    private static double tienNgayCong = 200000;

    public CanBoHC() {
        super();
    }

    public CanBoHC(String hoTen, String donViCongTac, double heSoLuong, double phuCap,int soNgayCong) {
        super(hoTen, donViCongTac, heSoLuong, phuCap);
        this.soNgayCong = soNgayCong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public static double getTienNgayCong() {
        return tienNgayCong;
    }

    public static void setTienNgayCong(double tienNgayCong) {
        CanBoHC.tienNgayCong = tienNgayCong;
    }

    public double tinhLuong() {
        return super.getHeSoLuong()*getLuongCoBan() + super.getPhuCap() + soNgayCong*getTienNgayCong();
    }

    public String inTTin() {
        return "Tên nhân viên hành chính là:" + this.gethoTen() + "\nTrực thuộc đơn vị công tác: " + this.getDonViCongTac() + "\nLương của nhân viên hành chính là: " + this.tinhLuong();
    }
}