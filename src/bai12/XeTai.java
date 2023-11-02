package bai12;

class XeTai extends PTGT {
    private double trongTai;

    public XeTai(int ID, String hangSanXuat, int namSanXuat, double giaBan, String mauXe, double trongTai) {
        super(ID, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }
}

