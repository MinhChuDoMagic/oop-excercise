package bai10;

public class Main {
    public static void main(String[] args) {
        VanBan vanBan = new VanBan("Van ban ngau      Nhien");
        System.out.println(vanBan.demSoTu());
        System.out.println(vanBan.demSoLuongKyTuA());

        vanBan.chuanHoaVanBan();
        System.out.println(vanBan.getNoiDung());
    }
}
