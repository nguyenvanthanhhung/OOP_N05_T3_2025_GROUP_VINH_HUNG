public class NhanVien {
    private String id;
    private String ten;
    private String vaiTro;
    private String caLam;

    public NhanVien(String id, String ten, String vaiTro, String caLam) {
        this.id = id;
        this.ten = ten;
        this.vaiTro = vaiTro;
        this.caLam = caLam;
    }

    public String getId() {
        return id;
    }
    public String getTen() {
        return ten;
    }
    public String getVaiTro() {
        return vaiTro;
    }
    public String getCaLam() {
        return caLam;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }
    public void setCaLam(String caLam) {
        this.caLam = caLam;
    }

    public void hienThi() {
        System.out.println("=== THONG TIN NHAN VIEN ===");
        System.out.println("ID      : " + id);
        System.out.println("Ten     : " + ten);
        System.out.println("Vai tro : " + vaiTro);
        System.out.println("Ca lam  : " + caLam);
    }
}
