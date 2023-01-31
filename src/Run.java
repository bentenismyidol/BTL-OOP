
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
            System.out.println("-------------------");
            String tn1 = sc.nextLine();
            System.out.println("Nhap thang:");
            String thangNam = sc.nextLine();
            menu:
            do {
                System.out.println("--Du lieu thang:" + thangNam);
                System.out.println("1-thêm cán bộ");
                System.out.println("2-in thông tin danh sách");
                System.out.println("3-xóa cán bộ");
                System.out.println("4-sửa thông tin cán bộ");
                System.out.println("5-sửa thông tin lương");
                System.out.println("6-Tìm kiếm cán bộ");
                System.out.println("7-Thống kê nhân viên lương hơn 10 triệu:");
                System.out.println("8-luu data");
                System.out.println("9-xem data");
                System.out.println("10-Tinh tong luong tu khoang thoi gian nhap:");
                int chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        System.out.println("1-giáo viên");
                        System.out.println("2-cán bộ hành chính\n");
                        int chonloai = sc.nextInt();
                        if (chonloai == 1) {
                            System.out.println("Nhập mã giáo viên:");
                            int magv = sc.nextInt();
                            System.out.println("-------------------");
                            String wtf1 = sc.nextLine();
                            System.out.println("Nhập tên giáo viên:");
                            String tengv = sc.nextLine();
                            System.out.println("Nhập đơn vị công tác:");
                            String dvctgv = sc.nextLine();
                            System.out.println("Nhập hệ số lương:");
                            double hslgv = sc.nextDouble();
                            System.out.println("Nhập phụ cấp:");
                            double phucapgv = sc.nextDouble();
                            System.out.println("Nhập số tiết dạy:");
                            int sotietday = sc.nextInt();
                            CanBo gv = new GiaoVien(magv, tengv, dvctgv, hslgv, phucapgv, sotietday);
                            ql.themCanBo(gv);

                        } else if (chonloai == 2) {
                            System.out.println("Nhập mã cán bộ hành chinh:");
                            int macbhc = sc.nextInt();
                            System.out.println("-------------------");
                            String wtf2 = sc.nextLine();
                            System.out.println("Nhập tên cán bộ hành chính");
                            String tencbhc = sc.nextLine();
                            System.out.println("Nhập đơn vị công tác:");
                            String dvctcbhc = sc.nextLine();
                            System.out.println("Nhập hệ số lương:");
                            double hslcbhc = sc.nextDouble();
                            System.out.println("Nhập phụ cấp:");
                            double phucapcbhc = sc.nextDouble();
                            System.out.println("Nhập số ngày công:");
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
                        System.out.println("Nhập vào cán bộ muốn xóa:");
                        String ten_de_xoa = sc.nextLine();
                        ql.xoaCanbo(ten_de_xoa);
                        break;
                    case 4:
                        System.out.println("-------------------");
                        String wtf4 = sc.nextLine();
                        System.out.println("1-giáo viên");
                        System.out.println("2-cán bộ hành chính");
                        int chonloai2 = sc.nextInt();
                        if (chonloai2 == 1) {
                            System.out.println("Nhập mã giáo viên muôn sửa:");
                            int magv = sc.nextInt();
                            System.out.println("-------------------");
                            String wtf5 = sc.nextLine();
                            System.out.println("sửa tên:");
                            String sua_tengv = sc.nextLine();
                            System.out.println("sửa đơn vị công tác:");
                            String sua_dvct = sc.nextLine();
                            System.out.println("sửa hệ số lương:");
                            double sua_hsl = sc.nextDouble();
                            System.out.println("sửa phụ cấp:");
                            double sua_phucap = sc.nextDouble();
                            System.out.println("sửa số tiết dạy");
                            int sua_sotietday = sc.nextInt();
                            ql.suaGiaoVien(magv, sua_tengv, sua_dvct, sua_hsl, sua_phucap, sua_sotietday);
                        } else if (chonloai2 == 2) {
                            System.out.println("Nhập vào mã cán bộ hành chính muốn sửa:");
                            int magv = sc.nextInt();
                            System.out.println("-------------------");
                            String wtf5 = sc.nextLine();
                            System.out.println("sửa tên:");
                            String sua_tengv = sc.nextLine();
                            System.out.println("sửa đơn vị công tác:");
                            String sua_dvct = sc.nextLine();
                            System.out.println("sửa hệ số lương");
                            double sua_hsl = sc.nextDouble();
                            System.out.println("sửa phụ cấp");
                            double sua_phucap = sc.nextDouble();
                            System.out.println("sửa số ngày công");
                            int sua_songaycong = sc.nextInt();
                            ql.suaCanBoHC(magv, sua_tengv, sua_dvct, sua_hsl, sua_phucap, sua_songaycong);
                        }
                        break;
                    case 5:
                        System.out.println("-------------------");
                        String wtf5 = sc.nextLine();
                        System.out.println("sửa lương cơ bản:");
                        System.out.println("sửa tiền tiết dạy:");
                        System.out.println("sửa tiền ngày công:");
                        int chon5 = sc.nextInt();
                        if (chon5 == 1) {
                            System.out.println("Lương cơ bản cũ:");
                            System.out.println(CanBo.getLuongCoBan());
                            System.out.println("Nhập lương cơ bản cũ:");
                            double lcb_moi = sc.nextDouble();
                            CanBo.setLuongCoBan(lcb_moi);
                        } else if (chon5 == 2) {
                            System.out.println("Tiền tiết dạy cũ:");
                            System.out.println(GiaoVien.getTienTietDay());
                            System.out.println("Nhập tiền tiết dạy mới:");
                            double ttd_moi = sc.nextDouble();
                            GiaoVien.setTienTietDay(ttd_moi);
                        } else if (chon5 == 3) {
                            System.out.println("Tiền ngày công cũ:");
                            System.out.println(CanBoHC.getTienNgayCong());
                            System.out.println("Nhập tiền ngày công mới:");
                            double tnc_moi = sc.nextDouble();
                            CanBoHC.setTienNgayCong(tnc_moi);
                        }
                        break;
                    case 6:
                        System.out.println("-------------------");
                        String wtf6 = sc.nextLine();
                        System.out.println("Tìm kiếm");
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
                    case 8:
                        System.out.println("Tong luong cua cac can bo thang :" + thangNam +" la: " + ql.tongLuong());
                        ql.luuDATATongLuong(thangNam,ql.tongLuong());
                        break menu;
                    case 9:
                        System.out.println("-------------------");
                        String wtf9 = sc.nextLine();
                        System.out.println("xem du lieu tong luong tu thang:");
                        String thang = sc.nextLine();
                        ql.xemDATATongLuong(thang);
                        break;
                    case 10:
                        System.out.println("-------------------");
                        String wtf10 = sc.nextLine();
                        System.out.println("Nhap vao thang nam dau:");
                        String thang_dau = sc.nextLine();
                        System.out.println("Nhap vao thang nam cuoi:");
                        String thang_cuoi = sc.nextLine();
                        System.out.println("Tong luong can bo tu:" + thang_dau + " den " + thang_cuoi + ":");
                        ql.tinhTongLuongTheoThangNam(thang_dau,thang_cuoi);
                }
            } while (isRunning);
        }while (isRunning);
    }
}
