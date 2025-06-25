public class NhanVien {
    String id;
    String ten;
    String vaiTro;
    String caLam;

    public NhanVien(String id, String ten, String vaiTro, String caLam) {
        this.id = id;
        this.ten = ten;
        this.vaiTro = vaiTro;
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
