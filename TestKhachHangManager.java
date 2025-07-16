public class TestKhachHangManager {
    public static void main(String[] args) {
        KhachHangManager ql = new KhachHangManager();

        System.out.println("== THEM KHACH HANG ==");
        ql.them(1, "An", "0123456789");
        ql.them(2, "Binh", "0987654321");
        ql.them(3, "Chi", "0112233445");
        ql.hienThi();

        System.out.println("\n== SUA KHACH HANG ID=2 ==");
        boolean suaOk = ql.sua(2, "Binh (cap nhat)", "0999888777");
        System.out.println("Sua thanh cong? " + suaOk);
        ql.hienThi();

        System.out.println("\n== XOA KHACH HANG ID=1 ==");
        boolean xoaOk = ql.xoa(1);
        System.out.println("Xoa thanh cong? " + xoaOk);
        ql.hienThi();

        System.out.println("\n== SUA KHACH HANG KHONG TON TAI ID=99 ==");
        boolean suaFail = ql.sua(99, "Khong co", "0000000000");
        System.out.println("Sua thanh cong? " + suaFail);

        System.out.println("\n== XOA KHACH HANG KHONG TON TAI ID=99 ==");
        boolean xoaFail = ql.xoa(99);
        System.out.println("Xoa thanh cong? " + xoaFail);
    }
}
