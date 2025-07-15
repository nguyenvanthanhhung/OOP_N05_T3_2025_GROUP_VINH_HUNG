public class TestNhanVienManager {
    public static void main(String[] args) {
        NhanVienManager ql = new NhanVienManager();

        System.out.println("== TEST THEM ==");
        ql.them("NV01", "An", "Bao ve", "Sang");
        ql.them("NV02", "Binh", "Thu ngan", "Toi");
        ql.them("NV03", "Chi", "Ke toan", "Chieu");
        ql.hienThi();

        System.out.println("\n== TEST SUA (NV02) ==");
        ql.sua("NV02", "Binh (cap nhat)", "Quan ly", "Dem");
        ql.hienThi();

        System.out.println("\n== TEST XOA (NV01) ==");
        ql.xoa("NV01");
        ql.hienThi();

        System.out.println("\n== TEST SUA KHONG TON TAI (NV99) ==");
        ql.sua("NV99", "Khong co", "Khong co", "Sang");

        System.out.println("\n== TEST XOA KHONG TON TAI (NV99) ==");
        ql.xoa("NV99");
    }
}
