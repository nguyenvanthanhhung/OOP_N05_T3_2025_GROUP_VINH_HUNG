import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NhanVienManager nhanVienManager = new NhanVienManager();
        KhachHangManager khachHangManager = new KhachHangManager();
        Scanner scanner = new Scanner(System.in);
        int chonChucNang;

        do {
            System.out.println("\n=== QUAN LY QUAN COFFEE ===");
            System.out.println("1. Quan ly nhan vien");
            System.out.println("2. Quan ly khach hang");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chonChucNang = Integer.parseInt(scanner.nextLine());

            switch (chonChucNang) {
                case 1:
                    menuNhanVien(nhanVienManager);
                    break;
                case 2:
                    menuKhachHang(khachHangManager);
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai.");
            }
        } while (chonChucNang != 0);

        scanner.close();
    }

    public static void menuNhanVien(NhanVienManager manager) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n--- QUAN LY NHAN VIEN ---");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Hien thi danh sach nhan vien");
            System.out.println("3. Sua nhan vien");
            System.out.println("4. Xoa nhan vien");
            System.out.println("0. Tro ve menu chinh");
            System.out.print("Chon chuc nang: ");
            luaChon = Integer.parseInt(scanner.nextLine());

            switch (luaChon) {
                case 1:
                    manager.themNhanVien();
                    break;
                case 2:
                    manager.hienThiTatCa();
                    break;
                case 3:
                    manager.suaNhanVien();
                    break;
                case 4:
                    manager.xoaNhanVien();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai.");
            }
        } while (luaChon != 0);
    }

    public static void menuKhachHang(KhachHangManager manager) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n--- QUAN LY KHACH HANG ---");
            System.out.println("1. Them khach hang");
            System.out.println("2. Hien thi danh sach khach hang");
            System.out.println("3. Sua khach hang");
            System.out.println("4. Xoa khach hang");
            System.out.println("0. Tro ve menu chinh");
            System.out.print("Chon chuc nang: ");
            luaChon = Integer.parseInt(scanner.nextLine());

            switch (luaChon) {
                case 1:
                    manager.themKhachHang();
                    break;
                case 2:
                    manager.hienThiTatCa();
                    break;
                case 3:
                    manager.suaKhachHang();
                    break;
                case 4:
                    manager.xoaKhachHang();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai.");
            }
        } while (luaChon != 0);
    }
}
