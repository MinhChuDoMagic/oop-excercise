package bai12;

class XeMay extends PTGT {
    private int congXuat;

    public XeMay(int ID, String hangSanXuat, int namSanXuat, double giaBan, String mauXe, int congXuat) {
        super(ID, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.congXuat = congXuat;
    }

    public int getCongXuat() {
        return congXuat;
    }
}
