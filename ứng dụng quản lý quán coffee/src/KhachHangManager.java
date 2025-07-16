import java.util.*;

public class KhachHangManager {
    List<KhachHang> ds = new ArrayList<>();

    public void them(int id, String ten, String sdt) {
        ds.add(new KhachHang(id, ten, sdt));
    }

    public void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach khach hang rong.");
            return;
        }
        for (KhachHang kh : ds) {
            kh.hienThi();
        }
    }

    public boolean sua(int id, String tenMoi, String sdtMoi) {
        for (KhachHang kh : ds) {
            if (kh.id == id) {
                kh.ten = tenMoi;
                kh.soDienThoai = sdtMoi;
                return true;
            }
        }
        System.out.println("Khong tim thay khach hang id: " + id);
        return false;
    }

    public boolean xoa(int id) {
        boolean xoa = ds.removeIf(kh -> kh.id == id);
        if (!xoa) {
            System.out.println("Khong tim thay khach hang id: " + id);
        }
        return xoa;
    }
}
