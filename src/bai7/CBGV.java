package bai7;

import java.util.ArrayList;
import java.util.List;

public class CBGV {
    private List<Nguoi> danhSachCBGV = new ArrayList<>();

    public void themCBGV(Nguoi nguoi) {
        danhSachCBGV.add(nguoi);
    }

    public void xoaCBGV(String maSoGV) {
        for (Nguoi nguoi : danhSachCBGV) {
            if (nguoi.getMaSoGV().equals(maSoGV)) {
                danhSachCBGV.remove(nguoi);
                break;
            }
        }
    }
}
