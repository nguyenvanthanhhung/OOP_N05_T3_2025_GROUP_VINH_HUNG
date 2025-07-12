import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanVienManager {
    private List<NhanVien> danhSachNhanVien = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void themNhanVien() {
        System.out.print("Nhap ID: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap vai tro: ");
        String vaiTro = scanner.nextLine();
        System.out.print("Nhap ca lam: ");
        String caLam = scanner.nextLine();

        NhanVien nv = new NhanVien(id, ten, vaiTro, caLam);
        danhSachNhanVien.add(nv);
        System.out.println("Them nhan vien thanh cong!");
    }

    public void hienThiTatCa() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sach nhan vien rong.");
            return;
        }
        for (NhanVien nv : danhSachNhanVien) {
            nv.hienThi();
        }
    }

    public void suaNhanVien() {
        System.out.print("Nhap ID nhan vien can sua: ");
        String id = scanner.nextLine();
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                System.out.print("Nhap ten moi: ");
                nv.setTen(scanner.nextLine());
                System.out.print("Nhap vai tro moi: ");
                nv.setVaiTro(scanner.nextLine());
                System.out.print("Nhap ca lam moi: ");
                nv.setCaLam(scanner.nextLine());
                System.out.println("Sua nhan vien thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien voi ID nay.");
    }

    public void xoaNhanVien() {
        System.out.print("Nhap ID nhan vien can xoa: ");
        String id = scanner.nextLine();
        NhanVien nvXoa = null;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                nvXoa = nv;
                break;
            }
        }
        if (nvXoa != null) {
            danhSachNhanVien.remove(nvXoa);
            System.out.println("Xoa nhan vien thanh cong!");
        } else {
            System.out.println("Khong tim thay nhan vien voi ID nay.");
        }
    }
}

