import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class QuanLy {

    private static ArrayList<CanBo> dscb = new ArrayList<>();


    public QuanLy() {

    }
    public static ArrayList<CanBo> getDscb() {
        return dscb;
    }
    public static boolean themCanBo(CanBo cb) {
        dscb.add(cb);
        return true;
    }

    public static ArrayList<CanBo> xoaCanbo(String ten) {
        for (int i=0;i< dscb.size();i++) {
            if (ten.equalsIgnoreCase(dscb.get(i).getHoten())) {
                dscb.remove(dscb.get(i));
                break;
            }
        }
        return dscb;
    }
    public static ArrayList suaGiaoVien(int macanbo,String ten,String dvct,double hsl,double pc,int std) {
        for (int i=0;i< dscb.size();i++) {
            if (macanbo == dscb.get(i).getMaCanBo()) {
              dscb.set(i,new GiaoVien(macanbo,ten,dvct,hsl,pc,std));
            }
        }
        return dscb;
    }
    public static ArrayList suaCanBoHC(int macanbo,String ten,String dvct,double hsl,double pc,int snc) {
        for (int i=0;i< dscb.size();i++) {
            if (macanbo == dscb.get(i).getMaCanBo()) {
                dscb.set(i,new CanBoHC(macanbo,ten,dvct,hsl,pc,snc));
            }
        }
        return dscb;
    }
    public static void timKiem(String ten, String dvct, double hsl) {
        for (int i=0;i< dscb.size();i++) {
            if (ten.equalsIgnoreCase(dscb.get(i).getHoten()) ||
                    dvct.equalsIgnoreCase(dscb.get(i).getDonViCongTac()) ||
                    hsl == dscb.get(i).getHeSoLuong())
            {
                System.out.println(dscb.get(i).getHoten());
            }
        }
    }
    public void inDanhSach() {
        for (CanBo i : dscb) {
            System.out.println(i.inTTin());
        }
    }
}