import java.util.*;

public class NhanVienManager {
    List<NhanVien> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void them() {
        System.out.print("ID: "); String id = sc.nextLine();
        System.out.print("Ten: "); String ten = sc.nextLine();
        System.out.print("Vai tro: "); String vt = sc.nextLine();
        System.out.print("Ca: "); String ca = sc.nextLine();
        ds.add(new NhanVien(id, ten, vt, ca));
    }

    void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }
        for (NhanVien nv : ds) nv.hienThi();
    }

    void sua() {
        System.out.print("Nhap ID can sua: ");
        String id = sc.nextLine();
        for (NhanVien nv : ds) {
            if (nv.id.equals(id)) {
                System.out.print("Ten moi: "); nv.ten = sc.nextLine();
                System.out.print("Vai tro moi: "); nv.vaiTro = sc.nextLine();
                System.out.print("Ca moi: "); nv.ca = sc.nextLine();
                return;
            }
        }
        System.out.println("Khong tim thay.");
    }

    void xoa() {
        System.out.print("Nhap ID can xoa: ");
        String id = sc.nextLine();
        ds.removeIf(nv -> nv.id.equals(id));
    }

    void test() {
        ds.add(new NhanVien("NV01", "An", "Bao ve", "Sang"));
        ds.add(new NhanVien("NV02", "Binh", "Thu ngan", "Toi"));
        ds.add(new NhanVien("NV03", "Chi", "Ke toan", "Chieu"));
        System.out.println("== DANH SACH TEST ==");
        hienThi();
        System.out.println("== SUA NV02 ==");
        suaTest("NV02", "Binh (up)", "Quan ly", "Dem");
        hienThi();
        System.out.println("== XOA NV01 ==");
        xoaTest("NV01");
        hienThi();
    }

    void suaTest(String id, String ten, String vaiTro, String ca) {
        for (NhanVien nv : ds)
            if (nv.id.equals(id)) {
                nv.ten = ten;
                nv.vaiTro = vaiTro;
                nv.ca = ca;
                return;
            }
    }

    void xoaTest(String id) {
        ds.removeIf(nv -> nv.id.equals(id));
    }
}
