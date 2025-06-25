public class QuanLyCoffee {
    public static void main(String[] args) {
        KhachHang kh = new KhachHang("KH01", "Vinh", "0987654321");
        NhanVien nv = new NhanVien("NV01", "Hung", "Thu ngan", "Ca sang");
        SanPham sp1 = new SanPham("SP01", "Ca phe sua", 25000, "Do uong", 20);
        SanPham sp2 = new SanPham("SP02", "Tra dao", 30000, "Do uong", 15);

        DonHang dh = new DonHang("DH01", kh);
        dh.themSanPham(sp1);
        dh.themSanPham(sp2);

        // Hien thi thong tin
        kh.hienThi();
        nv.hienThi();
        sp1.hienThi();
        sp2.hienThi();
        dh.hienThi();

        // Thanh toan va hien thi lai
        ThanhToan tt = new ThanhToan();
        tt.thucHienThanhToan(dh);
        dh.hienThi();
    }
}
