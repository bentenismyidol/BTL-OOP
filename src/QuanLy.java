import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class QuanLy {

    private ArrayList<CanBo> dscb = new ArrayList<>();

    Map<String,Double> DATA = new HashMap<>();
    public QuanLy() {

    }
    public ArrayList<CanBo> getDscb() {
        return dscb;
    }
    public boolean themCanBo(CanBo cb) {
        dscb.add(cb);
        return true;
    }

    public ArrayList<CanBo> xoaCanbo(String ten) {
        for (int i=0;i< dscb.size();i++) {
            if (ten.equalsIgnoreCase(dscb.get(i).getHoten())) {
                dscb.remove(dscb.get(i));
                break;
            }
        }

    return dscb;
    }
    public ArrayList suaGiaoVien(int macanbo,String ten,String dvct,double hsl,double pc,int std) {
        for (int i=0;i< dscb.size();i++) {
            if (macanbo == dscb.get(i).getMaCanBo()) {
              dscb.set(i,new GiaoVien(macanbo,ten,dvct,hsl,pc,std));
            }
        }
        return dscb;
    }
    public ArrayList suaCanBoHC(int macanbo,String ten,String dvct,double hsl,double pc,int snc) {
        for (int i=0;i< dscb.size();i++) {
            if (macanbo == dscb.get(i).getMaCanBo()) {
                dscb.set(i,new CanBoHC(macanbo,ten,dvct,hsl,pc,snc));
            }
        }
        return dscb;
    }
    public void timKiem(String ten, String dvct, double hsl) {
        for (int i=0;i< dscb.size();i++) {
            if (ten.equalsIgnoreCase(dscb.get(i).getHoten()) &&
                    dvct.equalsIgnoreCase(dscb.get(i).getDonViCongTac()) &&
                    hsl == dscb.get(i).getHeSoLuong())
            {
                System.out.println(dscb.get(i).getHoten());
            }
        }
    }

    public long tongLuong() {
        long tongLuong = 0;
        for (CanBo i : dscb) {
            double luong = i.tinhLuong();
            tongLuong += luong;
        }
        return tongLuong;
    }

    public Map luuDATATongLuong(String monthyear,double tongLuong) {
            DATA.put(monthyear,tongLuong);
        return DATA;
    }
    public void xemDATATongLuong(String monthyear) {
        for (Map.Entry<String,Double> m : DATA.entrySet()) {
            if (m.getKey().equalsIgnoreCase(monthyear)) {
                System.out.println("tong luong can bo thang: " + monthyear + " la: " + m.getValue());
            }
        }
    }
    public void tinhTongLuongTheoThangNam(String monthyearOld,String monthyearNew) {
        for (Map.Entry<String,Double> m : DATA.entrySet()) {
            if (m.getKey().equalsIgnoreCase(monthyearOld) && m.getKey().equalsIgnoreCase(monthyearNew)){
//                long sum =0L;
//                for (double d : DATA.values()) {
//                    sum += d;
//                    System.out.println("Tong luong truong phai tra cho can bo tu " + monthyearOld +" den "+ monthyeaNew + " la :");
//                    System.out.println(sum);
//                }
//                double sum = 0;
//                sum = DATA.get(monthyearOld) + DATA.get(monthyearOld);
                double luongCu = DATA.get(monthyearOld);
                double luongMoi = DATA.get(monthyearNew);
                System.out.println("Tong luong truong phai tra cho can bo tu " + monthyearOld +" den "+ monthyearNew + " la :");
                System.out.println(luongCu);
            }
        }
    }
    public void inDanhSach() {
        for (CanBo i : dscb) {
            System.out.println(i.inTTin());
        }
    }
}