public class TestNhanVienManager {
    public static void main(String[] args) {
        NhanVienManager ql = new NhanVienManager();

        System.out.println("== TEST THEM ==");
        ql.them("NV01", "An", "Bao ve", "Sang");
        ql.them("NV02", "Binh", "Thu ngan", "Toi");
        ql.them("NV03", "Chi", "Ke toan", "Chieu");
        ql.hienThi();

        System.out.println("\n== TEST DOC (HIEN THI DANH SACH) ==");
        ql.hienThi();

        System.out.println("\n== TEST SUA (NV02) ==");
        boolean suaOk = ql.sua("NV02", "Binh (cap nhat)", "Quan ly", "Dem");
        System.out.println("Sua NV02 thanh cong? " + suaOk);
        ql.hienThi();

        System.out.println("\n== TEST SUA KHONG TON TAI (NV99) ==");
        boolean suaFail = ql.sua("NV99", "Khong co", "Khong co", "Sang");
        System.out.println("Sua NV99 thanh cong? " + suaFail);

        System.out.println("\n== TEST XOA (NV01) ==");
        boolean xoaOk = ql.xoa("NV01");
        System.out.println("Xoa NV01 thanh cong? " + xoaOk);
        ql.hienThi();

        System.out.println("\n== TEST XOA KHONG TON TAI (NV99) ==");
        boolean xoaFail = ql.xoa("NV99");
        System.out.println("Xoa NV99 thanh cong? " + xoaFail);
    }
}
