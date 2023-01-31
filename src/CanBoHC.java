import java.math.BigDecimal;
import java.util.Scanner;

public class CanBoHC extends CanBo{
    private int soNgayCong;

    private static double tienNgayCong = 200000;

    public CanBoHC(int maCanBo,String hoten, String donViCongTac, double heSoLuong, double phuCap,int soNgayCong) {
        super(maCanBo,hoten, donViCongTac, heSoLuong, phuCap);
        this.soNgayCong = soNgayCong;
        //this.tienNgayCong = tienNgayCong;
    }

    public CanBoHC() {
        super();
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
        return  super.getHeSoLuong()*getLuongCoBan() + super.getPhuCap() + soNgayCong*getTienNgayCong();
    }

    public String inTTin() {
        return "Mã cán bộ:" + this.getMaCanBo() + "\nTên nhân viên hành chính là:" + this.getHoten() + "\nTrực thuộc đơn vị công tác: " + this.getDonViCongTac() + "\nLương của nhân viên hành chính là: " + Long.valueOf((long)this.tinhLuong())+"";
    }
}
