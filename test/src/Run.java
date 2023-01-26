import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        QuanLy ql = new QuanLy();

        do {
            System.out.println("Thêm cán bộ");
            System.out.println("In thông tin danh sách");
            System.out.println("Xoá cán bộ");
            System.out.println("Sửa thông tin của cán bộ");
            System.out.println("Sửa thông tin luơng");
            System.out.println("Tìm kiếm cán bộ");
            System.out.println("Thống kê nhân viên lương hơn 10 triệu: ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:

                    System.out.println("1-giáo viên");
                    System.out.println("2-cán bộ hành chính");
                    int chonloai = sc.nextInt();
                    if (chonloai == 1) {
                        System.out.println("-------------------");
                        String wtf1 = sc.nextLine();
                        System.out.println("Nhập tên giáo viên: ");
                        String tengv = sc.nextLine();
                        System.out.println("Nhập đơn vị công tác: ");
                        String dvctgv = sc.nextLine();
                        System.out.println("Nhập hệ số lương: ");
                        double hslgv = sc.nextDouble();
                        System.out.println("Nhập phụ cấp: ");
                        double phucapgv = sc.nextDouble();
                        System.out.println("Nhập số tiết dạy: ");
                        int sotietday = sc.nextInt();
                        CanBo gv = new GiaoVien(tengv, dvctgv, hslgv, phucapgv, sotietday);
                        ql.themCanBo(gv);

                    } else if (chonloai == 2) {
                        System.out.println("-------------------");
                        String wtf2 = sc.nextLine();
                        System.out.println("Nhập tên cán bộ hành chính: ");
                        String tencbhc = sc.nextLine();
                        System.out.println("Nhập đơn vị công tác: ");
                        String dvctcbhc = sc.nextLine();
                        System.out.println("Nhập hệ số lương: ");
                        double hslcbhc = sc.nextDouble();
                        System.out.println("Nhập phụ cấp: ");
                        double phucapcbhc = sc.nextDouble();
                        System.out.println("Nhập số ngày công: ");
                        int songaycong = sc.nextInt();
                        CanBo cbhc = new CanBoHC(tencbhc, dvctcbhc, hslcbhc, phucapcbhc, songaycong);
                        ql.themCanBo(cbhc);
                    } else {
                        System.out.println("Invalid");
                    }
                    break;
                case 2:
                    ql.inDanhSach();
                    break;
                case 3:
                    System.out.println("-------------------");
                    String wtf3 = sc.nextLine();
                    System.out.println("Nhập vào tên cán bộ muốn xoá: ");
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
                        System.out.println("Nhập tên giáo viên muốn sửa: ");
                        System.out.println("-------------------");
                        String wtf5 = sc.nextLine();
                        System.out.println("Sửa tên: ");
                        String sua_tengv = sc.nextLine();
                        System.out.println("Sửa đơn vị công tác: ");
                        String sua_dvct = sc.nextLine();
                        System.out.println("Sửa hệ số lương: ");
                        double sua_hsl = sc.nextDouble();
                        System.out.println("Sửa phụ cấp: ");
                        double sua_phucap = sc.nextDouble();
                        System.out.println("Sửa số tiết dạy: ");
                        int sua_sotietday = sc.nextInt();
                        ql.suaGiaoVien(sua_tengv, sua_dvct, sua_hsl, sua_phucap, sua_sotietday);
                    } else if (chonloai2 == 2) {
                        System.out.println("Nhập tên cán bộ hành chính muốn sửa: ");
                        System.out.println("-------------------");
                        String wtf5 = sc.nextLine();
                        System.out.println("Sửa tên: ");
                        String sua_tengv = sc.nextLine();
                        System.out.println("Sửa đơn vị công tác: ");
                        String sua_dvct = sc.nextLine();
                        System.out.println("Sửa hệ số lương: ");
                        double sua_hsl = sc.nextDouble();
                        System.out.println("Sửa phụ cấp: ");
                        double sua_phucap = sc.nextDouble();
                        System.out.println("Sửa số ngày công: ");
                        int sua_songaycong = sc.nextInt();
                        ql.suaCanBoHC(sua_tengv, sua_dvct, sua_hsl, sua_phucap, sua_songaycong);
                    }else {
                        System.out.println("Invalid");
                    }
                    break;
                case 5:
                    System.out.println("-------------------");
                    String wtf5 = sc.nextLine();
                    System.out.println("Sửa lương cơ bản: ");
                    System.out.println("Sửa tiền tiết dạy: ");
                    System.out.println("Sửa tiền ngày công: ");
                    int chon5 = sc.nextInt();
                    if (chon5 == 1) {
                        System.out.println("Lương cơ bản cũ: ");
                        System.out.println(CanBo.getLuongCoBan());
                        System.out.println("Nhập lương cơ bản cũ: ");
                        double lcb_moi = sc.nextDouble();
                        CanBo.setLuongCoBan(lcb_moi);
                    } else if (chon5 == 2) {
                        System.out.println("Tiền tiết dạy cũ: ");
                        System.out.println(GiaoVien.getTienTietDay());
                        System.out.println("Nhập tiền tiết dạy mới: ");
                        double ttd_moi = sc.nextDouble();
                        GiaoVien.setTienTietDay(ttd_moi);
                    } else if (chon5 == 3) {
                        System.out.println("Tiền ngày công: ");
                        System.out.println(CanBoHC.getTienNgayCong());
                        System.out.println("Nhập tiền ngày công mới: ");
                        double tnc_moi = sc.nextDouble();
                        CanBoHC.setTienNgayCong(tnc_moi);
                    }else {
                        System.out.println("Invalid");
                    }
                    break;
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
                case 8:

            }
        }
        while (isRunning);
    }
}
