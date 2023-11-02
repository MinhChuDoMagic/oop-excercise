package bai12;

import java.util.ArrayList;
import java.util.List;

public class QLPTGT {
    private List<PTGT> danhSachPhuongTien = new ArrayList<>();

    public void themPhuongTien(PTGT ptgt) {
        danhSachPhuongTien.add(ptgt);
    }

    public void xoaPhuongTien(int ID) {
        for (PTGT ptgt : danhSachPhuongTien) {
            if (ptgt.getID() == ID) {
                danhSachPhuongTien.remove(ptgt);
                break;
            }
        }
    }

    public List<PTGT> timPhuongTien(String hangSanXuat, String mauXe) {
        return danhSachPhuongTien.stream()
                .filter(ptgt -> ptgt.getHangSanXuat().equalsIgnoreCase(hangSanXuat) && ptgt.getMauXe().equalsIgnoreCase(mauXe))
                .toList();
    }

    public void inDanhSachPhuongTien(List<PTGT> danhSach) {
        for (PTGT ptgt : danhSach) {
            System.out.println("ID: " + ptgt.getID());
            System.out.println("Hãng sản xuất: " + ptgt.getHangSanXuat());
            System.out.println("Năm sản xuất: " + ptgt.getNamSanXuat());
            System.out.println("Giá bán: " + ptgt.getGiaBan());
            System.out.println("Màu xe: " + ptgt.getMauXe());

            if (ptgt instanceof OTo) {
                OTo oto = (OTo) ptgt;
                System.out.println("Số chỗ ngồi: " + oto.getSoChoNgoi());
                System.out.println("Kiểu động cơ: " + oto.getKieuDongCo());
            } else if (ptgt instanceof XeMay) {
                XeMay xeMay = (XeMay) ptgt;
                System.out.println("Công suất: " + xeMay.getCongXuat());
            } else if (ptgt instanceof XeTai) {
                XeTai xeTai = (XeTai) ptgt;
                System.out.println("Trọng tải: " + xeTai.getTrongTai());
            }

            System.out.println("--------------------");
        }
    }

}
