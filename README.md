# OOP_N05_T3_2025_GROUP_VINH_HUNG

ứng dụng quản lý quán coffee

# Đối Tượng:

khachhang
nhanvien
sanpham
donhang
thanhtoan
ban
danhgia
baocao

# Miêu tả đối tượng

khachhang:

-thongtin:
+id
+ten
+sodienthoai
+hangthanhvien
-phuongthuc:
+dathang
+thanhtoan
+tichdiem

nhanvien:

-thongtin:
+id
+ten
+vaitro
+calam
-chucnang:
+nhanorder
+phucvu
+baocao

sanpham

-thongtin:
+id
+ten
+gia
+loai
+tonkho
-chucnang:
+capnhatgia
+kiemtrasoluong

donhang

-thongtin:
+id
+khachhang
+sanpham
+trangthai
+tongtien
-chucnang:
+themmom
+tinhtien
+capnhattrangthai

thanhtoan


