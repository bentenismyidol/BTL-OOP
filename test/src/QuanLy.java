import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLy {

    private static ArrayList<CanBo> dscb = new ArrayList<>();
    private String tenTruong;
    private static int soCanBo;

    public QuanLy() {}

    public QuanLy(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public static boolean themCanBo(CanBo cb) {
        soCanBo++;
        dscb.add(cb);
        return true;
    }

    public static ArrayList<CanBo> xoaCanbo(String ten) {
        for (int i=0;i< dscb.size();i++) {
            if (ten.equalsIgnoreCase(dscb.get(i).gethoTen())) {
                dscb.remove(dscb.get(i));
                break;
            }
        }
        return dscb;
    }
    public static ArrayList suaGiaoVien(String ten,String dvct,double hsl,double pc,int std) {
        for (int i=0;i< dscb.size();i++) {
            if (ten.equalsIgnoreCase(dscb.get(i).gethoTen())) {
                dscb.set(i,new GiaoVien(ten,dvct,hsl,pc,std));
            }
        }
        return dscb;
    }
    public static ArrayList suaCanBoHC(String ten,String dvct,double hsl,double pc,int snc) {
        for (int i=0;i< dscb.size();i++) {
            if (ten.equalsIgnoreCase(dscb.get(i).gethoTen())) {
                dscb.set(i,new CanBoHC(ten,dvct,hsl,pc,snc));
            }
        }
        return dscb;
    }

    public void inDanhSach() {
        for (CanBo i : dscb) {
            System.out.println(i.inTTin());
        }
    }

    public void timKiem(String ten, String dvct, double hsl) {
        for (int i=0;i< dscb.size();i++) {
            if (ten.equalsIgnoreCase(dscb.get(i).gethoTen()) ||
                    dvct.equalsIgnoreCase(dscb.get(i).getDonViCongTac()) ||
                    hsl == dscb.get(i).getHeSoLuong())
            {
                System.out.println(dscb.get(i).gethoTen());
            }
        }

    }
    



}





