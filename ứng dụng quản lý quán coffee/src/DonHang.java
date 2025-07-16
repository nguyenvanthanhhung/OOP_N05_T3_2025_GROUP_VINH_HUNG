import java.util.List;

public class DonHang {
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
