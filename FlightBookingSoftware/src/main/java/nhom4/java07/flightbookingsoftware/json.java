/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

import java.util.List;
import nhom4.java07.flightbookingsoftware.model.ChuyenBay;
import nhom4.java07.flightbookingsoftware.model.HangVe;
import nhom4.java07.flightbookingsoftware.model.ThongTinChuyenBay;
import nhom4.java07.flightbookingsoftware.model.ThongTinVe;
import nhom4.java07.flightbookingsoftware.model.VeMayBay;

/**
 *
 * @author Admin
 */
public class json {

    private static final String JSON_FILE_PATH = "I:\\Nhom4_Java07\\Thông tin vé.json";
    private static final String JSON_FILE_PATH2 = "I:\\Nhom4_Java07\\Chuyến bay vừa tạo.json";

    static <E> void show(List<E> list) {
        System.out.println("==================");
        for (E item : list) {
            System.out.println(item.toString());
        }
    }

    static void them1VeMayBay(String maHang, String MaMayBay, String MaChuyenBay, int a, String hoTen) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(JSON_FILE_PATH);
            Gson gson = new Gson();
            VeMayBay ve = new VeMayBay();
            ve.setMaHang(maHang);
            ve.setMaMayBay(MaMayBay);
            ve.setMaChuyenBay(MaChuyenBay);
            HangVe hangVe = new HangVe();

            if (a == 1) {
                hangVe.setMaHangVe("1");
                hangVe.setTenHangVe("Hang Thuong Gia");
            } else if (a == 2) {
                hangVe.setMaHangVe("2");
                hangVe.setTenHangVe("Hang Pho Thong");
            }

            ve.setHangVe(hangVe);
            ve.setTenKhachHang(hoTen);
            String data = gson.toJson(ve);
            fw.write(data);
        } catch (IOException e) {
        } finally {
            if (fw != null) {
            }
            try {
                fw.close();
            } catch (IOException e) {

            }
        }

    }

    static void them1ChuyenBay(String maHang, String MaMayBay, String DiemXuatPhat, String DiemDen, String ThoiGianXuatPhat, String ThoiGianHaCanh, int SoLuongVePhoThong, double GiaVePhoThong, int SoLuongVeThuongGia, double GiaVeThuongGia) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(JSON_FILE_PATH2);
            Gson gson = new Gson();

            ChuyenBay chuyenBay = new ChuyenBay();
            chuyenBay.setMaHang(maHang);
            chuyenBay.setMaMayBay(MaMayBay);

            ThongTinChuyenBay thongTin = new ThongTinChuyenBay();
            thongTin.setDiemXuatPhat(DiemXuatPhat);
            thongTin.setThoiGianHaCanh(ThoiGianHaCanh);
            thongTin.setThoiGianXuatPhat(ThoiGianXuatPhat);
            thongTin.setThoiGianHaCanh(ThoiGianHaCanh);

            ThongTinVe thongTinVe = new ThongTinVe();
            thongTinVe.setSoLuongVePhoThong(SoLuongVePhoThong);
            thongTinVe.setGiaVePhoThong(GiaVePhoThong);
            thongTinVe.setSoLuongVeThuongGia(SoLuongVeThuongGia);
            thongTinVe.setGiaVeThuongGia(GiaVeThuongGia);

            chuyenBay.setThongTinChuyenBay(thongTin);
            chuyenBay.setThongTinVe(thongTinVe);

            String data = gson.toJson(chuyenBay);
            fw.write(data);
        } catch (IOException e) {
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                }
            }
        }

    }

    
    
}
