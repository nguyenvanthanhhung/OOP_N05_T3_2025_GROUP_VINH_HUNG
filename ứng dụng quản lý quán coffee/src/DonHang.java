import java.util.List;

public class DonHang {
    public int ma;
    public String khach;
    public List<String> dsMatHang;
    public double tong;

    public DonHang(int ma, String khach, List<String> dsMatHang, double tong) {
        this.ma = ma;
        this.khach = khach;
        this.dsMatHang = dsMatHang;
        this.tong = tong;
    }
}
