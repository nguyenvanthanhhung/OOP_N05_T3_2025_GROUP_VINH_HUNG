public class KhachHang {
    public int id;
    public String ten;
    public String soDienThoai;

    public KhachHang(int id, String ten, String soDienThoai) {
        this.id = id;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

    public void hienThi() {
        System.out.println("ID: " + id + ", Ten: " + ten + ", SDT: " + soDienThoai);
    }
}
