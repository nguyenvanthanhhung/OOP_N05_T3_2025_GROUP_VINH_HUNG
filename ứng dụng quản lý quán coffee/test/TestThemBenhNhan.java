package test;

import src.*;

import java.util.ArrayList;
import java.time.LocalDate;

public class TestThemBenhNhan {
    public static void main(String[] args) {
        ArrayList<BenhNhan> danhSach = new ArrayList<>();

        BenhNhan bnMoi = new BenhNhan("Nguyen Van A", LocalDate.now(), true);

        ThemBenhNhan them = new ThemBenhNhan();
        them.them(danhSach, bnMoi);

        System.out.println("So benh nhan hien co: " + danhSach.size());
    }
}
