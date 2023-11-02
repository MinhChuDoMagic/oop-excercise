package bai12;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLPTGT qlptgt = new QLPTGT();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm phương tiện");
            System.out.println("2. Xoá phương tiện theo ID");
            System.out.println("3. Tìm phương tiện theo hãng sản xuất và màu");
            System.out.println("4. Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại phương tiện:");
                    System.out.println("1. Ô tô");
                    System.out.println("2. Xe máy");
                    System.out.println("3. Xe tải");
                    System.out.print("Nhập loại phương tiện: ");
                    int vehicleType = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nhập ID: ");
                    int ID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập hãng sản xuất: ");
                    String hangSanXuat = scanner.nextLine();
                    System.out.print("Nhập năm sản xuất: ");
                    int namSanXuat = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập giá bán: ");
                    double giaBan = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nhập màu xe: ");
                    String mauXe = scanner.nextLine();

                    if (vehicleType == 1) {
                        System.out.print("Nhập số chỗ ngồi: ");
                        int soChoNgoi = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nhập kiểu động cơ: ");
                        String kieuDongCo = scanner.nextLine();
                        OTo oto = new OTo(ID, hangSanXuat, namSanXuat, giaBan, mauXe, soChoNgoi, kieuDongCo);
                        qlptgt.themPhuongTien(oto);
                    } else if (vehicleType == 2) {
                        System.out.print("Nhập công suất: ");
                        int congXuat = scanner.nextInt();
                        scanner.nextLine();
                        XeMay xeMay = new XeMay(ID, hangSanXuat, namSanXuat, giaBan, mauXe, congXuat);
                        qlptgt.themPhuongTien(xeMay);
                    } else if (vehicleType == 3) {
                        System.out.print("Nhập trọng tải: ");
                        double trongTai = scanner.nextDouble();
                        scanner.nextLine();
                        XeTai xeTai = new XeTai(ID, hangSanXuat, namSanXuat, giaBan, mauXe, trongTai);
                        qlptgt.themPhuongTien(xeTai);
                    } else {
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập ID phương tiện cần xoá: ");
                    int idCanXoa = scanner.nextInt();
                    scanner.nextLine();
                    qlptgt.xoaPhuongTien(idCanXoa);
                    break;
                case 3:
                    System.out.print("Nhập hãng sản xuất: ");
                    String hangSanXuatCanTim = scanner.nextLine();
                    System.out.print("Nhập màu xe: ");
                    String mauXeCanTim = scanner.nextLine();
                    List<PTGT> ketQuaTimKiem = qlptgt.timPhuongTien(hangSanXuatCanTim, mauXeCanTim);
                    System.out.println("Kết quả tìm kiếm:");
                    qlptgt.inDanhSachPhuongTien(ketQuaTimKiem);
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        }
    }
    }
