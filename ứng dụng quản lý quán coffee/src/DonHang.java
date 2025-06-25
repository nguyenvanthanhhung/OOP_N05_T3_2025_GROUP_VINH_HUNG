import java.util.ArrayList;
import java.util.List;

public class DonHang {
    private String id;
    private KhachHang khachHang;
    private List<SanPham> danhSachSanPham;
    private String trangThai;
    private double tongTien;

    public DonHang(String id, KhachHang khachHang) {
        this.id = id;
        this.khachHang = khachHang;
        this.danhSachSanPham = new ArrayList<>();
        this.trangThai = "Cho xu ly";
        this.tongTien = 0.0;
    }

    // Thêm sản phẩm vào đơn hàng
    public void themSanPham(SanPham sp) {
        danhSachSanPham.add(sp);
        tongTien += sp.getGia();
    }

    // Hiển thị thông tin đơn hàng
    public void hienThi() {
        System.out.println("=== THÔNG TIN ĐƠN HÀNG ===");
        System.out.println("Mã đơn hàng : " + id);
        System.out.println("Khách hàng  : " + khachHang.getTen());
        System.out.println("SĐT         : " + khachHang.getSoDienThoai());
        System.out.println("Danh sách sản phẩm:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println("- " + sp.getTen() + " (" + sp.getGia() + " VND)");
        }
        System.out.printf("Tổng tiền   : %.2f VND%n", tongTien);
        System.out.println("Trạng thái  : " + trangThai);
    }

    