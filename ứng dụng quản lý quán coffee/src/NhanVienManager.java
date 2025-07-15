import java.util.*;

public class NhanVienManager {
    List<NhanVien> ds = new ArrayList<>();

    void them(String id, String ten, String vaiTro, String ca) {
        ds.add(new NhanVien(id, ten, vaiTro, ca));
    }

    void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Khong co nhan vien.");
            return;
        }
        for (NhanVien nv : ds) nv.hienThi();
    }

    void sua(String id, String ten, String vaiTro, String ca) {
        for (NhanVien nv : ds)
            if (nv.id.equals(id)) {
                nv.ten = ten;
                nv.vaiTro = vaiTro;
                nv.ca = ca;
                return;
            }
        System.out.println("Khong tim thay nhan vien: " + id);
    }

    void xoa(String id) {
        boolean xoa = ds.removeIf(nv -> nv.id.equals(id));
        if (!xoa) System.out.println("Khong tim thay nhan vien: " + id);
    }
}
