package bai12;

public class PTGT {
    private int ID;
    private String hangSanXuat;
    private int namSanXuat;
    private double giaBan;
    private String mauXe;

    public PTGT(int ID, String hangSanXuat, int namSanXuat, double giaBan, String mauXe) {
        this.ID = ID;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public int getID() {
        return ID;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }
}
