
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        QuanLy ql = new QuanLy();
             do {
                System.out.println("1-thêm cán bộ");
                System.out.println("2-in thông tin danh sách");
                System.out.println("3-xóa cán bộ");
                System.out.println("4-sửa thông tin cán bộ");
                System.out.println("5-sửa thông tin lương");
                 System.out.println("Tìm kiếm cán bộ");
                 System.out.println("Thống kê nhân viên lương hơn 10 triệu: ");
                int chon = sc.nextInt();
                switch (chon) {
                    case 1:

                        System.out.println("1-giao vien");
                        System.out.println("2-can bo hanh chinh");
                        int chonloai = sc.nextInt();
                        if (chonloai == 1) {
                            System.out.println("Nhap ma giao vien:");
                            int magv = sc.nextInt();
                            System.out.println("-------------------");
                            String wtf1 = sc.nextLine();
                            System.out.println("Nhap ten giao vien:");
                            String tengv = sc.nextLine();
                            System.out.println("Nhap don vi cong tac:");
                            String dvctgv = sc.nextLine();
                            System.out.println("Nhap he so luong:");
                            double hslgv = sc.nextDouble();
                            System.out.println("Nhap phu cap:");
                            double phucapgv = sc.nextDouble();
                            System.out.println("Nhap so tiet day:");
                            int sotietday = sc.nextInt();
                            CanBo gv = new GiaoVien(magv, tengv, dvctgv, hslgv, phucapgv, sotietday);
                            ql.themCanBo(gv);

                        } else if (chonloai == 2) {
                            System.out.println("Nhap ma can bo hanh chinh:");
                            int macbhc = sc.nextInt();
                            System.out.println("-------------------");
                            String wtf2 = sc.nextLine();
                            System.out.println("Nhap ten can bo hanh chinh:");
                            String tencbhc = sc.nextLine();
                            System.out.println("Nhap don vi cong tac:");
                            String dvctcbhc = sc.nextLine();
                            System.out.println("Nhap he so luong:");
                            double hslcbhc = sc.nextDouble();
                            System.out.println("Nhap phu cap:");
                            double phucapcbhc = sc.nextDouble();
                            System.out.println("Nhap so ngay cong:");
                            int songaycong = sc.nextInt();
                            CanBo cbhc = new CanBoHC(macbhc, tencbhc, dvctcbhc, hslcbhc, phucapcbhc, songaycong);
                            ql.themCanBo(cbhc);
                        }
                        break;
                    case 2:

                        ql.inDanhSach();
                        break;
                    case 3:
                        System.out.println("-------------------");
                        String wtf3 = sc.nextLine();
                        System.out.println("Nhap vao ten can bo muon xoa:");
                        String ten_de_xoa = sc.nextLine();
                        ql.xoaCanbo(ten_de_xoa);
                        break;
                    case 4:
                        System.out.println("-------------------");
                        String wtf4 = sc.nextLine();
                        System.out.println("1-giao vien");
                        System.out.println("2-can bo hanh chinh");
                        int chonloai2 = sc.nextInt();
                        if (chonloai2 == 1) {
                            System.out.println("Nhap ma giao vien muon sua:");
                            int magv = sc.nextInt();
                            System.out.println("-------------------");
                            String wtf5 = sc.nextLine();
                            System.out.println("sua ten:");
                            String sua_tengv = sc.nextLine();
                            System.out.println("sua don vi cong tac:");
                            String sua_dvct = sc.nextLine();
                            System.out.println("sua he so luong:");
                            double sua_hsl = sc.nextDouble();
                            System.out.println("sua phu cap:");
                            double sua_phucap = sc.nextDouble();
                            System.out.println("Sua so tiet day");
                            int sua_sotietday = sc.nextInt();
                            ql.suaGiaoVien(magv, sua_tengv, sua_dvct, sua_hsl, sua_phucap, sua_sotietday);
                        } else if (chonloai2 == 2) {
                            System.out.println("Nhap ma can bo hanh chinh muon sua:");
                            int magv = sc.nextInt();
                            System.out.println("-------------------");
                            String wtf5 = sc.nextLine();
                            System.out.println("sua ten:");
                            String sua_tengv = sc.nextLine();
                            System.out.println("sua don vi cong tac:");
                            String sua_dvct = sc.nextLine();
                            System.out.println("sua he so luong:");
                            double sua_hsl = sc.nextDouble();
                            System.out.println("sua phu cap:");
                            double sua_phucap = sc.nextDouble();
                            System.out.println("Sua so ngay cong");
                            int sua_songaycong = sc.nextInt();
                            ql.suaCanBoHC(magv, sua_tengv, sua_dvct, sua_hsl, sua_phucap, sua_songaycong);
                        }
                    case 5:
                        System.out.println("-------------------");
                        String wtf5 = sc.nextLine();
                        System.out.println("Sua luong co ban:");
                        System.out.println("Sua tien tiet day:");
                        System.out.println("Sua tien ngay cong:");
                        int chon5 = sc.nextInt();
                        if (chon5 == 1) {
                            System.out.println("luong co ban cu:");
                            System.out.println(CanBo.getLuongCoBan());
                            System.out.println("Nhap luong co ban cu:");
                            double lcb_moi = sc.nextDouble();
                            CanBo.setLuongCoBan(lcb_moi);
                        } else if (chon5 == 2) {
                            System.out.println("Tien tiet day cu:");
                            System.out.println(GiaoVien.getTienTietDay());
                            System.out.println("Nhap tien tiet day moi:");
                            double ttd_moi = sc.nextDouble();
                            GiaoVien.setTienTietDay(ttd_moi);
                        } else if (chon5 == 3) {
                            System.out.println("Tien ngay cong:");
                            System.out.println(CanBoHC.getTienNgayCong());
                            System.out.println("Nhap tien ngay cong moi:");
                            double tnc_moi = sc.nextDouble();
                            CanBoHC.setTienNgayCong(tnc_moi);
                        }
                    case 6:
                        System.out.println("-------------------");
                        String wtf6 = sc.nextLine();
                        System.out.println("Tìm kiếm: ");
                        System.out.println("Nhập tên cán bộ:");
                        String ten = sc.nextLine();
                        System.out.println("Nhập đơn vị công tác");
                        String dvct = sc.nextLine();
                        System.out.println("Nhập hệ số lương");
                        double hsl = sc.nextDouble();
                        ql.timKiem(ten,dvct,hsl);
                        break;
                    case 7:
                        System.out.println("-------------------");
                        String wtf7 = sc.nextLine();
                        for (int i=0;i< ql.getDscb().size();i++) {
                            if (ql.getDscb().get(i).tinhLuong() > 10000000) {
                                System.out.println("Cán bộ có lương trên 10 triệu là:");
                                System.out.println(ql.getDscb().get(i).inTTin()+"\n");
                            }
                        }
                        break;
                }
            } while (isRunning);
    }
}
