public class TestKhachHangManager {
    public static void main(String[] args) {
        KhachHangManager ql = new KhachHangManager();

        System.out.println("== TEST THEM ==");
        ql.them(1, "An", "0123456789");
        ql.them(2, "Binh", "0987654321");
        ql.them(3, "Chi", "0112233445");
        ql.hienThi();

        System.out.println("\n== TEST DOC (HIEN THI DANH SACH) ==");
        ql.hienThi();

        System.out.println("\n== TEST SUA ID=2 ==");
        boolean suaOk = ql.sua(2, "Binh (cap nhat)", "0999888777");
        System.out.println("Sua ID=2 thanh cong? " + suaOk);
        ql.hienThi();

        System.out.println("\n== TEST SUA KHONG TON TAI ID=99 ==");
        boolean suaFail = ql.sua(99, "Khong co", "0000000000");
        System.out.println("Sua ID=99 thanh cong? " + suaFail);

        System.out.println("\n== TEST XOA ID=1 ==");
        boolean xoaOk = ql.xoa(1);
        System.out.println("Xoa ID=1 thanh cong? " + xoaOk);
        ql.hienThi();

        System.out.println("\n== TEST XOA KHONG TON TAI ID=99 ==");
        boolean xoaFail = ql.xoa(99);
        System.out.println("Xoa ID=99 thanh cong? " + xoaFail);
    }
}
