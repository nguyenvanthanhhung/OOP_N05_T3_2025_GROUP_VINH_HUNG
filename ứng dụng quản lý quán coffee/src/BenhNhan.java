package src;

import java.time.LocalDate;

public class BenhNhan {
    private String ten;
    private LocalDate ngayNhapVien;
    private boolean duDieuKienXuatVien;

    public BenhNhan(String ten, LocalDate ngayNhapVien, boolean duDieuKienXuatVien) {
        this.ten = ten;
        this.ngayNhapVien = ngayNhapVien;
        this.duDieuKienXuatVien = duDieuKienXuatVien;
    }

    public String getTen() {
        return ten;
    }
}
