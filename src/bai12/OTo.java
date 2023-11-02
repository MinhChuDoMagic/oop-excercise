package bai12;

public class OTo extends PTGT {
    private int soChoNgoi;
    private String kieuDongCo;

    public OTo(int ID, String hangSanXuat, int namSanXuat, double giaBan, String mauXe, int soChoNgoi, String kieuDongCo) {
        super(ID, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }
}
