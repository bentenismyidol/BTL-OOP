import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class QuanLy {

    private ArrayList<CanBo> dscb = new ArrayList<>();

    Map<String,ArrayList<CanBo>> DATA = new HashMap<>();
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
    public Map luuDATA(String monthyear) {
            DATA.put(monthyear, new ArrayList<>());
        return DATA;
    }
    public void xemDATA(String monthyear) {
        for (Map.Entry<String,ArrayList<CanBo>> m : DATA.entrySet()) {
            if (monthyear.equalsIgnoreCase(m.getKey())) {
                System.out.println("Giu lieu thang:" + m.getKey());
                System.out.println(m.getValue());
            }
        }
    }
    public void inDanhSach() {
        for (CanBo i : dscb) {
            System.out.println(i.inTTin());
        }
    }
}