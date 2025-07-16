import java.util.*;

public class DonHangManagerTest {
    public static void main(String[] args) {
        DonHangManager ql = new DonHangManager();

        DonHang d1 = ql.tao("An", Arrays.asList("Sach", "But"), 100);
        if (!d1.khach.equals("An") || d1.ma != 1) {
            System.out.println("Test tao don hang: that bai");
        } else {
            System.out.println("Test tao don hang: thanh cong");
        }

        DonHang d2 = ql.tao("Binh", Arrays.asList("Vo"), 50);
        DonHang kqTim = ql.tim(d2.ma);
        if (kqTim == null || !kqTim.khach.equals("Binh")) {
            System.out.println("Test tim don hang: that bai");
        } else {
            System.out.println("Test tim don hang: thanh cong");
        }

        boolean suaOk = ql.sua(d2.ma, "Binh Moi", null, 80.0);
        DonHang dSua = ql.tim(d2.ma);
        if (suaOk && dSua.khach.equals("Binh Moi") && dSua.tong == 80.0) {
            System.out.println("Test sua don hang: thanh cong");
        } else {
            System.out.println("Test sua don hang: that bai");
        }

        boolean xoaOk = ql.xoa(d1.ma);
        if (xoaOk && ql.tim(d1.ma) == null) {
            System.out.println("Test xoa don hang: thanh cong");
        } else {
            System.out.println("Test xoa don hang: that bai");
        }

        ql.tao("Em", Arrays.asList("Quan"), 120);
        ql.tao("Hoa", Arrays.asList("Giay"), 150);
        if (ql.danhSach().size() == 3) { // còn 3 đơn vì xóa 1 đơn trước đó
            System.out.println("Test danh sach don hang: thanh cong");
        } else {
            System.out.println("Test danh sach don hang: that bai");
        }
    }
}
