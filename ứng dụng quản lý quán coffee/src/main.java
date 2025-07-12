import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        KhachHang kh1 = new KhachHang("KH01", "Nguyen Van A", "0123456789");
        SanPham sp1 = new SanPham("SP01", "Ca phe den", 25000, "Do uong", 100);
        SanPham sp2 = new SanPham("SP02", "Banh mi", 15000, "Do an", 50);

        DonHang don1 = new DonHang("DH01", kh1);
        don1.themSanPham(sp1);
        don1.themSanPham(sp2);

        System.out.println();
        don1.hienThi();

        System.out.println();

        NhanVien nv1 = new NhanVien("NV01", "Le Thi B", "Phuc vu", "Sang");
        nv1.hienThi();

        System.out.println();

        System.out.println("Thong tin san pham:");
        sp1.hienThi();
        System.out.println();
        sp2.hienThi();

        scanner.close();
    }
}

