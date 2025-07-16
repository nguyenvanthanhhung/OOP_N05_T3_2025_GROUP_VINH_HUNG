import java.util.*;

public class TestDonHangManager {
    public static void main(String[] args) {
        DonHangManager ql = new DonHangManager();

        DonHang d1 = ql.tao("An", Arrays.asList("Sach", "But"), 100);
        System.out.println(d1.khach.equals("An") && d1.ma == 1 ? "Tao OK" : "Tao FAIL");

        DonHang d2 = ql.tao("Binh", Arrays.asList("Vo"), 50);
        DonHang t = ql.tim(d2.ma);
        System.out.println(t != null && t.khach.equals("Binh") ? "Tim OK" : "Tim FAIL");

        boolean sua = ql.sua(d2.ma, "Binh Moi", null, 80.0);
        DonHang s = ql.tim(d2.ma);
        System.out.println(sua && s.khach.equals("Binh Moi") && s.tong == 80.0 ? "Sua OK" : "Sua FAIL");

        boolean xoa = ql.xoa(d1.ma);
        System.out.println(xoa && ql.tim(d1.ma) == null ? "Xoa OK" : "Xoa FAIL");

        ql.tao("Em", Arrays.asList("Quan"), 120);
        ql.tao("Hoa", Arrays.asList("Giay"), 150);
        System.out.println(ql.danhSach().size() == 3 ? "List OK" : "List FAIL");
    }
}
