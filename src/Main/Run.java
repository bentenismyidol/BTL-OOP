package Main;

import Controller.QuanLy;
import Model.CanBo;
import Model.CanBoHC;
import Model.GiaoVien;

import java.util.Scanner;

import static java.lang.System.exit;
////Nguyễn Viết Thành thiết kế Run

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        QuanLy ql = new QuanLy();
        openmenu:
        do {
            System.out.println("-------------------");
            String tn1 = sc.nextLine();
            System.out.println("Nhap thang/nam:");
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
                System.out.println("8-lưu tổng lương các cán bộ của tháng");
                System.out.println("9-Xem tổng lương các cán bộ của tháng");
                System.out.println("10-Tính tổng lương trong khoảng thời gian nhập vào:");
                System.out.println("11-Chuyển tiếp qua tháng/năm mới");
                System.out.println("12-Thoát chương trình");
                int chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        System.out.println("1-giáo viên");
                        System.out.println("2-cán bộ hành chính");
                        System.out.println("3-Back");
                        int chonloai = sc.nextInt();
                        if (chonloai == 1) {
                            System.out.println("-------------------");
                            String wtf1 = sc.nextLine();
                            System.out.println("Nhập mã giáo viên:");
                            String magv = sc.nextLine();
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
                            System.out.println("Thêm giáo viên [" + magv + " - " + tengv + "] thành công!\n");

                        } else if (chonloai == 2) {
                            System.out.println("-------------------");
                            String wtf2 = sc.nextLine();
                            System.out.println("Nhập mã cán bộ hành chinh:");
                            String macbhc = sc.nextLine();
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
                            System.out.println("Thêm cán bộ hành chính [" + macbhc + " - " + tencbhc + "] thành công!\n");
                        }
                        else if (chonloai == 3) {
                            break;
                        }
                        break;
                    case 2:
                        ql.inDanhSach();
                        break;
                    case 3:
                        System.out.println("-------------------");
                        String wtf3 = sc.nextLine();
                        System.out.println("Nhập vào cán bộ muốn xóa:");
                        String macb_de_xoa = sc.nextLine();
                        ql.xoaCanbo(macb_de_xoa);
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("-------------------");
                        String wtf4 = sc.nextLine();
                        System.out.println("1-giáo viên");
                        System.out.println("2-cán bộ hành chính");
                        System.out.println("3-back");
                        int chonloai2 = sc.nextInt();
                        if (chonloai2 == 1) {
                            System.out.println("-------------------");
                            String wtf5 = sc.nextLine();
                            System.out.println("Nhập mã giáo viên muôn sửa:");
                            String magv = sc.nextLine();
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
                            System.out.println("Sửa thành công\n");
                        } else if (chonloai2 == 2) {
                            System.out.println("-------------------");
                            String wtf5 = sc.nextLine();
                            System.out.println("Nhập vào mã cán bộ hành chính muốn sửa:");
                            String magv = sc.nextLine();
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
                            System.out.println("Sửa thành công\n");
                        }
                        else if (chonloai2 == 3) {
                            break;
                        }
                        break;
                    case 5:
                        System.out.println("-------------------");
                        String wtf5 = sc.nextLine();
                        System.out.println("1-sửa lương cơ bản:");
                        System.out.println("2-sửa tiền tiết dạy:");
                        System.out.println("3-sửa tiền ngày công:");
                        System.out.println("4-back");
                        int chon5 = sc.nextInt();
                        if (chon5 == 1) {
                            System.out.println("Lương cơ bản cũ:");
                            System.out.println(CanBo.getLuongCoBan());
                            System.out.println("Nhập lương cơ bản mới:");
                            double lcb_moi = sc.nextDouble();
                            CanBo.setLuongCoBan(lcb_moi);
                            System.out.println("Sửa thành công\n");
                        } else if (chon5 == 2) {
                            System.out.println("Tiền tiết dạy cũ:");
                            System.out.println(GiaoVien.getTienTietDay());
                            System.out.println("Nhập tiền tiết dạy mới:");
                            double ttd_moi = sc.nextDouble();
                            GiaoVien.setTienTietDay(ttd_moi);
                            System.out.println("Sửa thành công\n");
                        } else if (chon5 == 3) {
                            System.out.println("Tiền ngày công cũ:");
                            System.out.println(CanBoHC.getTienNgayCong());
                            System.out.println("Nhập tiền ngày công mới:");
                            double tnc_moi = sc.nextDouble();
                            CanBoHC.setTienNgayCong(tnc_moi);
                            System.out.println("Sửa thành công\n");
                        } else if (chon5 == 4) {
                            break;
                        }
                        break;
                    case 6:
                        System.out.println("-------------------");
                        String wtf6 = sc.nextLine();
                        System.out.println("Tìm kiếm");
                        System.out.println("Nhập mã cán bộ:");
                        String ma = sc.nextLine();
                        System.out.println("Nhập tên cán bộ:");
                        String ten = sc.nextLine();
                        System.out.println("Nhập đơn vị công tác");
                        String dvct = sc.nextLine();
                        System.out.println("Nhập hệ số lương");
                        double hsl = sc.nextDouble();
                        ql.timKiem(ma,ten,dvct,hsl);
                        System.out.println("");
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
                        System.out.println("Tổng lương của các cán bộ tháng :" + thangNam +" là: " + ql.tongLuong());
                        ql.luuDATATongLuong(thangNam,ql.tongLuong());
                        System.out.println("");
                        break;
                    case 9:
                        System.out.println("-------------------");
                        String wtf9 = sc.nextLine();
                        System.out.println("xem dữ liệu tổng lương từ tháng:");
                        String thang = sc.nextLine();
                        ql.xemDATATongLuong(thang);
                        System.out.println("");
                        break;
                    case 10:
                        System.out.println("-------------------");
                        String wtf10 = sc.nextLine();
                        System.out.println("Nhập vào tháng năm đầu:");
                        String thang_dau = sc.nextLine();
                        System.out.println("Nhập vào tháng năm cuối:");
                        String thang_cuoi = sc.nextLine();
                        ql.tinhTongLuongTheoThangNam(thang_dau,thang_cuoi);
                        System.out.println("");
                    case 11:
                        break menu;
                    case 12:
                        System.exit(0);
                }
            } while (isRunning);
        }while (isRunning);
    }
}
