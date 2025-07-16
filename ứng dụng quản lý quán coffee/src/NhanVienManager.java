import java.util.*;

public class NhanVienManager {
    List<NhanVien> ds = new ArrayList<>();

    public void them(String id, String ten, String vaiTro, String ca) {
        ds.add(new NhanVien(id, ten, vaiTro, ca));
    }

    public void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Khong co nhan vien.");
            return;
        }
        for (NhanVien nv : ds) {
            nv.hienThi();
        }
    }

    public boolean sua(String id, String ten, String vaiTro, String ca) {
        for (NhanVien nv : ds) {
            if (nv.id.equals(id)) {
                nv.ten = ten;
                nv.vaiTro = vaiTro;
                nv.ca = ca;
                return true;
            }
        }
        System.out.println("Khong tim thay nhan vien: " + id);
        return false;
    }

    public boolean xoa(String id) {
        boolean xoa = ds.removeIf(nv -> nv.id.equals(id));
        if (!xoa) {
            System.out.println("Khong tim thay nhan vien: " + id);
        }
        return xoa;
    }
}
