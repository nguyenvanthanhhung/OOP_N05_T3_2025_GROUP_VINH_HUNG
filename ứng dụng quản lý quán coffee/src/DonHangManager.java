import java.util.*;

public class DonHangManager {
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
}
