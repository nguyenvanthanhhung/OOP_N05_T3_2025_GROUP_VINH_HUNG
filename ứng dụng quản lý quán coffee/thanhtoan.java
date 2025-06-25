public class ThanhToan {
    public void thucHienThanhToan(DonHang donHang) {
        System.out.println(">>> Dang thanh toan don hang: " + donHang.getId());
        System.out.println("Tong tien: " + donHang.getTongTien() + " VND");

        // Cap nhat trang thai don hang
        donHang.setTrangThai("Da thanh toan");

        System.out.println("Thanh toan thanh cong. Trang thai don hang da duoc cap nhat.");
    }
}
