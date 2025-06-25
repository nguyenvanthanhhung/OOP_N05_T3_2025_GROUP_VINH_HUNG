# OOP_N05_T3_2025_GROUP_VINH_HUNG

ứng dụng quản lý quán coffee

# Đối Tượng:

khachhang
nhanvien
sanpham
donhang
thanhtoan
main

# Miêu tả đối tượng

khachhang:

-thongtin:
+id
+ten
+sodienthoai



nhanvien:

-thongtin:
+id
+ten
+vaitro
+calam

sanpham

-thongtin:
+id
+ten
+gia
+loai
+tonkho


donhang

-thongtin:
+id
+khachhang
+sanpham
+trangthai
+tongtien


thanhtoan
+donhang
+tongtien
+trangthaitahnhtoan

main
+khachhang
+nhanvien
+sanpham
+donhang

