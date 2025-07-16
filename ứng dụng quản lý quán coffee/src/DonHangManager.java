import java.util.*;

public class DonHangManager {
    private List<DonHang> ds = new ArrayList<>();
    private int maTuTang = 1;

    public DonHang tao(String khach, List<String> dsMatHang, double tong) {
        DonHang d = new DonHang(maTuTang++, khach, dsMatHang, tong);
        ds.add(d);
        return d;
    }

    public DonHang tim(int ma) {
        for (DonHang d : ds)
            if (d.ma == ma) return d;
        return null;
    }

    public boolean sua(int ma, String khach, List<String> dsMatHang, Double tong) {
        DonHang d = tim(ma);
        if (d == null) return false;
        if (khach != null) d.khach = khach;
        if (dsMatHang != null) d.dsMatHang = dsMatHang;
        if (tong != null) d.tong = tong;
        return true;
    }

    public boolean xoa(int ma) {
        return ds.removeIf(d -> d.ma == ma);
    }

    public List<DonHang> danhSach() {
        return new ArrayList<>(ds);
    }
}
