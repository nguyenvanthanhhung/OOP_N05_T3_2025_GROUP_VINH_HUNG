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

    public void hienThi() {
        System.out.println("=== THONG TIN SAN PHAM ===");
        System.out.println("ID       : " + id);
        System.out.println("Ten      : " + ten);
        System.out.println("Gia      : " + gia + " VND");
        System.out.println("Loai     : " + loai);
        System.out.println("Ton kho  : " + tonKho);
        System.out.println("===========================");
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    public String getLoai() {
        return loai;
    }

    public int getTonKho() {
        return tonKho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setTonKho(int tonKho) {
        this.tonKho = tonKho;
    }
}
