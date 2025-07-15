public class NhanVien {
    String id, ten, vaiTro, ca;

    public NhanVien(String id, String ten, String vaiTro, String ca) {
        this.id = id;
        this.ten = ten;
        this.vaiTro = vaiTro;
        this.ca = ca;
    }

    void hienThi() {
        System.out.println(id + " | " + ten + " | " + vaiTro + " | " + ca);
    }
}
