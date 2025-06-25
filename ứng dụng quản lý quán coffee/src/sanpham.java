public class SanPham {
    String id;
    String ten;
    double gia;
    String loai;
    int tonKho;

    public SanPham(String id, String ten, double gia, String loai, int tonKho) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.loai = loai;
        this.tonKho = tonKho;
    }

    // Phuong thuc hien thi thong tin san pham
    public void hienThi() {
        System.out.println("=== THONG TIN SAN PHAM ===");
        System.out.println("ID       : " + id);
        System.out.println("Ten      : " + ten);
        System.out.println("Gia      : " + gia + " VND");
        System.out.println("Loai     : " + loai);
        System.out.println("Ton kho  : " + tonKho);
    }
}
