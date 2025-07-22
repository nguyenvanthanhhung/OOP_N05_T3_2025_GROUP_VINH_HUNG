package src;

import java.util.ArrayList;

public class ThemBenhNhan {
    public void them(ArrayList<BenhNhan> danhSach, BenhNhan bn) {
        danhSach.add(bn);
        System.out.println("Da them benh nhan: " + bn.getTen());
    }
}
