public class KhachHang {
    int id;
    string ten;
    string soDienThoai;


    public KhachHang(int id, String ten, String soDienThoai) {
        this.id = id;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

     public void hienThi() {
        System.out.println("Khach hang: " + ten + " - SDT: " + soDienThoai);
     }
}
