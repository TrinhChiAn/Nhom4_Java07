/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.util.Scanner;

/**
 *
 * @author Tuan Anh
 */
public class Main {

    static void manu() {
        System.out.println("Moi ban nhap lua chon:");
        System.out.println("1. Them sua xoa");// thêm sửa xóa 1 vé máy bay, chuyến bay, hãng hàng không 
        System.out.println("2. Loc danh sach các chuyen bay con trong theo ngay gio"); // lọc danh sách tất cả các chuyến bay còn trống hoặc tất các các chuyến bay của 1 hãng còn trống
        System.out.println("3. So ve con lai cua moi hang theo ngay"); // số vé còn lại của mỗi hạng của tất cả các chuyến bay theo ngày 
        System.out.println("4. Loc danh khach hanh khach 1 chuyen bay");
        System.out.println("5. Loc cac chuyen bay theo ngay di hoac ngay den");// 1. theo ngay đi, 2. theo ngay đến 
        System.out.println("6. Loc danh sach cac chuyen bay theo diem di và diem den"); //1. máy bay xuất phat từ... , 2. máy bay hạ cánh tại... ,3. máy bay xuất phát từ ... và hạ cánh tại ...
        System.out.println("7. Thong ke doanh thu 1 hang hang khong"); // 1. doanh thu theo tháng, 2. doanh thu theo nam
        System.out.println("8. Ket thuc chuong trinh");
    }
// Manu 1 =======================================================================================

    static void manu1() {
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Them");
        System.out.println("2. Sua");
        System.out.println("3. Xoa");
        System.out.println("4. Quay ve");
    }

    static void manu1x1() {
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Them 1 ve may bay");
        System.out.println("2. Them 1 chuyen bay");
        System.out.println("3. Them 1 hang hang khong");
        System.out.println("4. Them 1 chiec may bay");
        System.out.println("5. Quay ve");
    }

    static void manu1x2() {
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Sua thong tin 1 ve may bay"); // chỉ cho phép sửa hạng vé
        System.out.println("2. Sua thông tin 1 chuyen bay"); //
        System.out.println("3. Sua thong tin 1 hang hang khong");
        System.out.println("4. Quay ve");
    }

    static void manu1x3() {
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Xoa 1 ve may bay");
        System.out.println("2. Xoa 1 chuyen bay");
        System.out.println("3. Xoa 1 chiec may bay");
        System.out.println("4. Xoa 1 hang hang khong");
        System.out.println("5. Quay ve");
    }
//==============================================================================================

    static void manu2() {
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Loc danh sach tat ca cac chuyen bay con trong");
        System.out.println("2. loc danh sach cac chuyen bay con trong cua 1 hang");
        System.out.println("3. Quay ve");
    }

    static void manu2xx() {
        System.out.println("Moi bạn nhap lua chon: ");
        System.out.println("1. Theo ngay");
        System.out.println("2. Theo gio");
    }
//==============================================================================================

    static void manu3() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightManagementSystem FMS = new FlightManagementSystem();

    }
}
