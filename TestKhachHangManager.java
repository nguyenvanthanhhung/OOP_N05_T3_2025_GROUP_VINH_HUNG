public class TestKhachHangManager {
    public static void main(String[] args) {
        KhachHangManager ql = new KhachHangManager();

        System.out.println("== THEM KHACH HANG ==");
        ql.them(1, "An", "0123456789");
        ql.them(2, "Binh", "0987654321");
        ql.them(3, "Chi", "0112233445");
        ql.hienThi();

        System.out.println("\n== SUA KHACH HANG ID=2 ==");
        ql.sua(2, "Binh (cap nhat)", "0999888777");
        ql.hienThi();

        System.out.println("\n== XOA KHACH HANG ID=1 ==");
        ql.xoa(1);
        ql.hienThi();

        System.out.println("\n== SUA KHACH HANG KHONG TON TAI ID=99 ==");
        ql.sua(99, "Khong co", "0000000000");

        System.out.println("\n== XOA KHACH HANG KHONG TON TAI ID=99 ==");
        ql.xoa(99);
    }
}
