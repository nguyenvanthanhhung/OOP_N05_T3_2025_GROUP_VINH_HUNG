import java.util.*;

public class DonHangManager {
    public static class DonHang {
        public int ma;
        public String khach;
        public List<String> hang;
        public double tong;

        public DonHang(int ma, String khach, List<String> hang, double tong) {
            this.ma = ma;
            this.khach = khach;
            this.hang = hang;
            this.tong = tong;
        }
    }

    private List<DonHang> ds = new ArrayList<>();
    private int maTiep = 1;

    public DonHang tao(String khach, List<String> hang, double tong) {
        DonHang d = new DonHang(maTiep++, khach, hang, tong);
        ds.add(d);
        return d;
    }

    public DonHang tim(int ma) {
        for (DonHang d : ds)
            if (d.ma == ma) return d;
        return null;
    }

    public boolean xoa(int ma) {
        DonHang d = tim(ma);
        if (d != null) {
            ds.remove(d);
            return true;
        }
        return false;
    }

    public boolean sua(int ma, String khach, List<String> hang, Double tong) {
        DonHang d = tim(ma);
        if (d == null) return false;
        if (khach != null) d.khach = khach;
        if (hang != null) d.hang = hang;
        if (tong != null) d.tong = tong;
        return true;
    }

    public List<DonHang> danhSach() {
        return ds;
    }

    public void inDanhSach() {
        for (DonHang d : ds) {
            System.out.println("Ma: " + d.ma + ", Khach: " + d.khach +
                               ", Hang: " + d.hang + ", Tong: " + d.tong);
        }
    }
}
