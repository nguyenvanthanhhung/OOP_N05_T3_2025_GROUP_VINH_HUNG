public class KhachHang {
    int id;
    String ten;
    String soDienThoai;

    public KhachHang(int id, String ten, String soDienThoai) {
        this.id = id;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

    public void hienThi() {
        System.out.println("Khách hàng: " + ten + " - SDT: " + soDienThoai);
    }
}
