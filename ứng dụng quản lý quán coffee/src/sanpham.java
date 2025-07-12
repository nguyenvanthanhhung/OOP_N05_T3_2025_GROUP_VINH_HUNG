public class SanPham {
    private String id;
    private String ten;
    private double gia;
    private String loai;
    private int tonKho;

    public SanPham(String id, String ten, double gia, String loai, int tonKho) {
        this.id = id;
        this.ten = ten;
        this.setGia(gia);
        this.loai = loai;
        this.setTonKho(tonKho);
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
        if (gia >= 0) {
            this.gia = gia;
        } else {
            System.out.println("Loi: Gia phai lon hon hoac bang 0.");
        }
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setTonKho(int tonKho) {
        if (tonKho >= 0) {
            this.tonKho = tonKho;
        } else {
            System.out.println("Loi: Ton kho phai lon hon hoac bang 0.");
        }
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", loai='" + loai + '\'' +
                ", tonKho=" + tonKho +
                '}';
    }
}
