public class NhanVien {
    public String id;
    public String ten;
    public String vaiTro;
    public String ca;

    public NhanVien(String id, String ten, String vaiTro, String ca) {
        this.id = id;
        this.ten = ten;
        this.vaiTro = vaiTro;
        this.ca = ca;
    }

    public void hienThi() {
        System.out.println("ID: " + id + ", Ten: " + ten + ", Vai tro: " + vaiTro + ", Ca: " + ca);
    }
}
