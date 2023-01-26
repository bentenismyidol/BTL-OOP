public abstract class CanBo {
    private String hoTen;
    private String donViCongTac;
    private double heSoLuong;
    private double phuCap;

    private static double luongCoBan = 1750000;

    public CanBo() {}

    public CanBo(String hoTen, String donViCongTac, double heSoLuong, double phuCap) {
        this.hoTen = hoTen;
        this.donViCongTac = donViCongTac;
        this.heSoLuong = heSoLuong;
        this.phuCap = phuCap;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void setHoten(String hoTen) {
        hoTen = hoTen;
    }

    public String getDonViCongTac() {
        return donViCongTac;
    }

    public void setDonViCongTac(String donViCongTac) {
        this.donViCongTac = donViCongTac;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public static double getLuongCoBan() {
        return luongCoBan;
    }

    public static void setLuongCoBan(double luongCoBan) {
        CanBo.luongCoBan = luongCoBan;
    }

    public double tinhLuong() {
        return 0.0;
    }

    public String inTTin() {
        return null;
    }
}