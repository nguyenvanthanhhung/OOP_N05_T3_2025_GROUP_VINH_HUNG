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

    public void themSanPham(SanPham sp) {
        danhSachSanPham.add(sp);
        tongTien += sp.getGia();
    }

    public void xoaSanPham(String maSP) {
        SanPham spXoa = null;
        for (SanPham sp : danhSachSanPham) {
            if (sp.getId().equals(maSP)) {
                spXoa = sp;
                break;
            }
        }
        if (spXoa != null) {
            danhSachSanPham.remove(spXoa);
            tongTien -= spXoa.getGia();
        }
    }

    public void setTrangThai(String trangThaiMoi) {
        this.trangThai = trangThaiMoi;
    }

    public void hienThi() {
        System.out.println("=== THONG TIN DON HANG ===");
        System.out.println("Ma don hang : " + id);
        System.out.println("Khach hang  : " + khachHang.getTen());
        System.out.println("SDT         : " + khachHang.getSoDienThoai());
        System.out.println("Danh sach san pham:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println("- " + sp.getTen() + " (" + sp.getGia() + " VND)");
        }
        System.out.printf("Tong tien   : %.2f VND%n", tongTien);
        System.out.println("Trang thai  : " + trangThai);
        System.out.println("===========================");
    }

    public String getId() {
        return id;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public List<SanPham> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public double getTongTien() {
        return tongTien;
    }
}

    
