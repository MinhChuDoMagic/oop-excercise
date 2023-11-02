package bai10;

public class VanBan {
    private String noiDung;

    public VanBan() {
        noiDung = "";
    }

    public VanBan(String st) {
        noiDung = st;
    }

    public int demSoTu() {
        String[] tu = noiDung.split("\\s+");
        return tu.length;
    }

    public int demSoLuongKyTuA() {
        String noiDungChuHoa = noiDung.toUpperCase();
        return noiDungChuHoa.length() - noiDungChuHoa.replace("A", "").length();
    }

    public void chuanHoaVanBan() {
        noiDung = noiDung.trim();
        noiDung = noiDung.replaceAll("\\s+", " ");
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String st) {
        noiDung = st;
    }
}
