package Controller;

import Model.CanBo;
import Model.CanBoHC;
import Model.GiaoVien;

import java.util.*;

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
    public ArrayList suaGiaoVien(String macanbo,String ten,String dvct,double hsl,double pc,int std) {
        for (int i=0;i< dscb.size();i++) {
            if (macanbo.equalsIgnoreCase(dscb.get(i).getMaCanBo())) {
              dscb.set(i,new GiaoVien(macanbo,ten,dvct,hsl,pc,std));
            }
        }
        return dscb;
    }
    public ArrayList suaCanBoHC(String macanbo,String ten,String dvct,double hsl,double pc,int snc) {
        for (int i=0;i< dscb.size();i++) {
            if (macanbo.equalsIgnoreCase(dscb.get(i).getMaCanBo())) {
                dscb.set(i,new CanBoHC(macanbo,ten,dvct,hsl,pc,snc));
            }
        }
        return dscb;
    }
    public void timKiem(String macb,String ten, String dvct, double hsl) {
        for (int i=0;i< dscb.size();i++) {
            if (macb.equalsIgnoreCase(dscb.get(i).getMaCanBo()) && ten.equalsIgnoreCase(dscb.get(i).getHoten()) &&
                    dvct.equalsIgnoreCase(dscb.get(i).getDonViCongTac()) &&
                    hsl == dscb.get(i).getHeSoLuong())
            {
                System.out.println(dscb.get(i).inTTin());
            }
            else {
                System.out.println("cán bộ muốn tìm không tồn tại");
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
        double tong_dau = DATA.get(monthyearOld);
        double tong_sau = DATA.get(monthyearNew);
        double tong = tong_dau + tong_sau;
        System.out.println("Tong luong can bo tu " + monthyearOld + " den " + monthyearNew + ":");
        System.out.println(Long.valueOf((long) tong));
    }
    public void inDanhSach() {
        for (CanBo i : dscb) {
            System.out.println(i.inTTin());
        }
    }
}