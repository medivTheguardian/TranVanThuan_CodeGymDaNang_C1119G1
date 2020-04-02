-- task 2
select * from nhan_vien
where (ho_ten like "K%" or ho_ten like "H%" or ho_ten like "T%") and length(ho_ten) <= 15;
-- task 3
select * 
from khach_hang
where (timestampdiff(YEAR, ngay_sinh, curdate()) between 18 and 50) and (dia_chi = "Quang Tri" or dia_chi = "Da Nang");
-- task 4
select hop_dong.id_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, count(hop_dong.id_khach_hang) as so_lan_dat_phong
from hop_dong
inner join khach_hang using(id_khach_hang)
inner join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
where loai_khach.ten_loai_khach = "Diamond"
group by hop_dong.id_khach_hang
order by so_lan_dat_phong;
-- task 5
select khach_hang.id_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach,
hop_dong.id_hop_dong, dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc,
sum(hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia + chi_phi_thue) as tong_tien
from khach_hang
left join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
inner join loai_khach using(id_loai_khach)
left join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by khach_hang.id_khach_hang;
-- task 6
select id_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, loai_dich_vu.ten_loai_dich_vu 
from dich_vu
inner join loai_dich_vu using(id_loai_dich_vu)
where id_dich_vu not in
(
	select id_dich_vu 
	from dich_vu
	inner join loai_dich_vu using(id_loai_dich_vu)
	inner join hop_dong using(id_dich_vu)
	where (ngay_lam_hop_dong >= CAST('2019-01-01' AS DATE))
);
-- task 7
select id_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
from dich_vu
inner join loai_dich_vu using(id_loai_dich_vu)
inner join hop_dong using(id_dich_vu)
where (year(ngay_lam_hop_dong) = 2018) and 
id_dich_vu not in
(
	select distinct id_dich_vu
	from dich_vu
	inner join loai_dich_vu using(id_loai_dich_vu)
	inner join hop_dong using(id_dich_vu)
	where (year(ngay_lam_hop_dong) = 2019)
);
-- task 8 
select distinct ho_ten from khach_hang;

select ho_ten from khach_hang
group by ho_ten;

select ho_ten from khach_hang
union select ho_ten from khach_hang;

-- task 9
select month(ngay_lam_hop_dong) as thang, count(id_hop_dong) so_luong_dat_phong
from hop_dong
where year(ngay_lam_hop_dong) = 2019
group by thang
order by thang;

-- task 10
select id_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, count(id_hop_dong) as so_luong_dvkt
from hop_dong
inner join hop_dong_chi_tiet using(id_hop_dong)
group by id_hop_dong;

-- task 11
select distinct ten_dich_vu_di_kem, gia
from dich_vu_di_kem
inner join hop_dong_chi_tiet using(id_dich_vu_di_kem)
inner join hop_dong on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
inner join khach_hang on khach_hang.id_khach_hang = hop_dong.id_khach_hang
inner join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
where (khach_hang.dia_chi = "Vinh" or khach_hang.dia_chi = "Quang Ngai")
		and loai_khach.ten_loai_khach = "Diamond";

-- task 12

select hop_dong.id_hop_dong, nhan_vien.ho_ten as ten_nhan_vien, khach_hang.ho_ten, khach_hang.so_dien_thoai,
dich_vu.ten_dich_vu, hop_dong.tien_dat_coc, count(id_hop_dong_chi_tiet) as so_luong_dich_vu_di_kem
from hop_dong
inner join nhan_vien using(id_nhan_vien)
inner join khach_hang using(id_khach_hang)
inner join dich_vu using(id_dich_vu)
inner join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
where ngay_lam_hop_dong between CAST('2019-10-01' AS DATE) and CAST('2019-12-30' AS DATE) and
dich_vu.id_dich_vu not in (
	select dich_vu.id_dich_vu
	from dich_vu
	inner join hop_dong on hop_dong.id_dich_vu = dich_vu.id_dich_vu
	where ngay_lam_hop_dong between CAST('2019-01-01' AS DATE) and CAST('2019-06-30' AS DATE)
)
group by id_hop_dong;

-- task 13
select ten_dich_vu_di_kem, count(ten_dich_vu_di_kem) as so_lan_duoc_dat
from dich_vu_di_kem
inner join hop_dong_chi_tiet using(id_dich_vu_di_kem)
inner join hop_dong on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
group by ten_dich_vu_di_kem
having so_lan_duoc_dat = (
	select count(id_dich_vu_di_kem) as so_lan_duoc_dat 
    from hop_dong_chi_tiet
    group by id_dich_vu_di_kem
    order by count(id_dich_vu_di_kem) desc
    limit 1
);


-- task 14
select dich_vu_di_kem.ten_dich_vu_di_kem, loai_dich_vu.ten_loai_dich_vu, count(ten_dich_vu_di_kem) as so_lan_duoc_dat
from hop_dong
inner join dich_vu using(id_dich_vu)
inner join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
inner join hop_dong_chi_tiet using(id_hop_dong)
inner join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
group by dich_vu_di_kem.ten_dich_vu_di_kem
having so_lan_duoc_dat = 1;
-- task 15
select nhan_vien.id_nhan_vien, ho_ten, trinh_do.trinh_do, bo_phan.ten_bo_phan, sdt, 
dia_chi, count(nhan_vien.id_nhan_vien) as so_hop_dong
from nhan_vien
inner join trinh_do using(id_trinh_do) 
inner join bo_phan using(id_bo_phan)
inner join hop_dong using(id_nhan_vien)
where year(ngay_lam_hop_dong) between 2018 and 2019
group by nhan_vien.id_nhan_vien
having so_hop_dong <= 3;

-- task 16
delete from nhan_vien 
where id_nhan_vien not in
(
	select id_nhan_vien
	from hop_dong
	where year(ngay_lam_hop_dong) between 2017 and 2020 
	group by id_nhan_vien
);

-- task 17
update khach_hang
inner join hop_dong using(id_khach_hang)
set id_loai_khach = 1
where hop_dong.tong_tien >= 10000000;
-- task 18
ALTER TABLE hop_dong_chi_tiet
DROP FOREIGN KEY fk_dichvukemtheo_hopdongchitiet;
ALTER TABLE hop_dong_chi_tiet ADD CONSTRAINT fk_dichvukemtheo_hopdongchitiet FOREIGN KEY(id_hop_dong)
REFERENCES hop_dong(id_hop_dong) ON DELETE CASCADE;
ALTER TABLE hop_dong
DROP FOREIGN KEY fk_khachhang_hopdong;
ALTER TABLE hop_dong ADD CONSTRAINT fk_khachhang_hopdong FOREIGN KEY(id_khach_hang)
REFERENCES khach_hang(id_khach_hang) ON DELETE CASCADE;
delete khach_hang from  khach_hang
left join hop_dong on  khach_hang.id_khach_hang = hop_dong.id_khach_hang
left join hop_dong_chi_tiet   on  hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
where year(ngay_lam_hop_dong) = 2016;
-- task 19
update dich_vu_di_kem
set gia = gia*2
where id_dich_vu_di_kem in (
	select id_dich_vu_di_kem
	from hop_dong_chi_tiet
	group by id_dich_vu_di_kem
	having count(id_dich_vu_di_kem) >= 10
);

-- task 20
select id_nhan_vien as ID, ho_ten as ho_ten, ngay_sinh, so_cmnd, sdt, email, dia_chi
from nhan_vien
union all
select id_khach_hang as ID, ho_ten as ho_ten, ngay_sinh, so_cmnd, sdt, email, dia_chi
from khach_hang;