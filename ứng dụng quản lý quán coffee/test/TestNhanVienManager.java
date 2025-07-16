public class TestNhanVienManager {
    public static void main(String[] args) {
        NhanVienManager ql = new NhanVienManager();

        System.out.println("== THEM NHAN VIEN ==");
        ql.them("NV01", "An", "Bao ve", "Sang");
        ql.them("NV02", "Binh", "Thu ngan", "Toi");
        ql.them("NV03", "Chi", "Ke toan", "Chieu");
        ql.hienThi();

        System.out.println("\n== SUA NHAN VIEN NV02 ==");
        boolean suaOk = ql.sua("NV02", "Binh (cap nhat)", "Quan ly", "Dem");
        System.out.println("Sua thanh cong? " + suaOk);
        ql.hienThi();

        System.out.println("\n== XOA NHAN VIEN NV01 ==");
        boolean xoaOk = ql.xoa("NV01");
        System.out.println("Xoa thanh cong? " + xoaOk);
        ql.hienThi();

        System.out.println("\n== SUA NHAN VIEN KHONG TON TAI NV99 ==");
        boolean suaFail = ql.sua("NV99", "Khong co", "Khong co", "Sang");
        System.out.println("Sua thanh cong? " + suaFail);

        System.out.println("\n== XOA NHAN VIEN KHONG TON TAI NV99 ==");
        boolean xoaFail = ql.xoa("NV99");
        System.out.println("Xoa thanh cong? " + xoaFail);
    }
}
