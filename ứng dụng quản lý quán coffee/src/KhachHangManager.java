import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KhachHangManager manager = new KhachHangManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- QUAN LY KHACH HANG ---");
            System.out.println("1. Them khach hang");
            System.out.println("2. Hien thi tat ca khach hang");
            System.out.println("3. Sua khach hang");
            System.out.println("4. Xoa khach hang");
            System.out.println("5. Tim khach hang");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhap ID (so nguyen): ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap ten: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap so dien thoai: ");
                    String sdt = sc.nextLine();

                    KhachHang kh = new KhachHang(id, ten, sdt);
                    manager.taoKhachHang(kh);
                    break;

                case 2:
                    manager.hienThiTatCa();
                    break;

                case 3:
                    System.out.print("Nhap ID khach hang can sua: ");
                    int idSua = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap ten moi: ");
                    String tenMoi = sc.nextLine();
                    System.out.print("Nhap so dien thoai moi: ");
                    String sdtMoi = sc.nextLine();

                    boolean suaThanhCong = manager.suaKhachHang(idSua, tenMoi, sdtMoi);
                    if (suaThanhCong) {
                        System.out.println("Sua thanh cong!");
                    } else {
                        System.out.println("Khong tim thay khach hang.");
                    }
                    break;

                case 4:
                    System.out.print("Nhap ID khach hang can xoa: ");
                    int idXoa = Integer.parseInt(sc.nextLine());
                    boolean xoaThanhCong = manager.xoaKhachHang(idXoa);
                    if (xoaThanhCong) {
                        System.out.println("Xoa thanh cong!");
                    } else {
                        System.out.println("Khong tim thay khach hang.");
                    }
                    break;

                case 5:
                    System.out.print("Nhap ID khach hang can tim: ");
                    int idTim = Integer.parseInt(sc.nextLine());
                    KhachHang khTim = manager.timKhachHang(idTim);
                    if (khTim != null) {
                        khTim.hienThi();
                    } else {
                        System.out.println("Khong tim thay khach hang.");
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);

        sc.close();
    }
}

