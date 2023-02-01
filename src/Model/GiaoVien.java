package Model;
//Nguyễn Thành Công thiết kế class GiaoVien kế thừa từ Canbo
public class GiaoVien extends CanBo {
    private int soTietDay;

    private static double tienTietDay = 45000;

    public GiaoVien(String maCanBo,String hoten, String donViCongTac, double heSoLuong, double phuCap,int soTietDay) {
        super(maCanBo, hoten, donViCongTac, heSoLuong, phuCap);
        this.soTietDay = soTietDay;
    }
    public GiaoVien() {
      super();
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
        return "Mã cán bộ:" + this.getMaCanBo() + "\nTên giáo viên là: " + this.getHoten() + "\nTrực thuộc đơn vị công tác: " + this.getDonViCongTac() + "\nLương của giáo viên là: " + Long.valueOf((long)this.tinhLuong());
    }
}
