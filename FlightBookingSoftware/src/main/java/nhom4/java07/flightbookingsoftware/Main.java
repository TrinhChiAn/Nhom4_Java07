/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tuan Anh
 */
public class Main {

    static void manu() {
        System.out.println("=====================");
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
        System.out.println("=====================");
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Them");
        System.out.println("2. Sua");
        System.out.println("3. Xoa");
        System.out.println("4. Quay ve");
    }

    static void manu1x1() {
        System.out.println("====================");
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Them 1 ve may bay");
        System.out.println("2. Them 1 chuyen bay");
        System.out.println("3. Them 1 hang hang khong");
        System.out.println("4. Them 1 chiec may bay");
        System.out.println("5. Quay ve");
    }

    static void manu1x2() {
        System.out.println("====================");
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Sua thong tin 1 ve may bay"); // chỉ cho phép sửa hạng vé
        System.out.println("2. Sua thông tin 1 chuyen bay"); //
        System.out.println("3. Sua thong tin 1 hang hang khong");
        System.out.println("4. Quay ve");
    }

    static void manu1x3() {
        System.out.println("====================");
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Xoa 1 ve may bay");
        System.out.println("2. Xoa 1 chuyen bay");
        System.out.println("3. Xoa 1 chiec may bay");
        System.out.println("4. Xoa 1 hang hang khong");
        System.out.println("5. Quay ve");
    }
//==============================================================================================

    static void manu2() {
        System.out.println("====================");
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Loc danh sach tat ca cac chuyen bay con trong");
        System.out.println("2. loc danh sach cac chuyen bay con trong cua 1 hang");
        System.out.println("3. Quay ve");
    }

    static void manu2xx() {
        System.out.println("====================");
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Theo ngay");
        System.out.println("2. Theo gio");
        System.out.println("3. Quay ve");
    }
//==============================================================================================

    static void manu5() {
        System.out.println("====================");
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Theo ngay di");
        System.out.println("2. Theo ngay den");
        System.out.println("3. Quay ve");
    }

    static void manu6() {
        System.out.println("====================");
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Cac chuyen bay tu");
        System.out.println("2. Cac chuyen bay ha canh tai");
        System.out.println("3. Cac chuyen bay cat canh tu va ha canh tai");
        System.out.println("4. Quay ve");
    }

    static void manu7() {
        System.out.println("====================");
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Doanh thu theo thang");
        System.out.println("2. Doanh thu theo nam");
    }

    static <E> void show(List<E> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightManagementSystem FMS = new FlightManagementSystem();
        boolean n = true;
        while (n) {
            manu();
            try {
                int luaChon = sc.nextInt();

                switch (luaChon) {
                    case 1 -> {
                        boolean n1 = true;
                        while (n1) {
                            manu1();
                            int luaChon1 = sc.nextInt();
                            switch (luaChon1) {
                                case 1 -> {
                                    boolean n2 = true;
                                    while (n2) {
                                        manu1x1();
                                        int luaChon2 = sc.nextInt();
                                        switch (luaChon2) {
                                            case 1 -> {
                                                FMS.them1VeMayBay(sc);
                                                break;
                                            }
                                            case 2 -> { // Them 1 chuyến bay

                                                FMS.them1ChuyenBay(sc);
                                                break;
                                            }
                                            case 3 -> { // thêm 1 hãng hàng không

                                                FMS.addAirline(sc);
                                                System.out.println(FMS.Airlines.get(FMS.Airlines.size() - 1));
                                                break;
                                            }
                                            case 4 -> {

                                                // thêm 1 chiếc máy bay
                                                System.out.print("Nhap vao ma hang hang khong: ");
                                                sc.nextLine();
                                                String maHang = sc.nextLine();
                                                int x = 0;
                                                for (Airline item : FMS.Airlines) {
                                                    if (item != null && item.getAirlineCode().equals(maHang)) {
                                                        item.Them1ChiecMayBay(sc, FMS.Airlines.size() - 1);
                                                        x = 1;
                                                        break;
                                                    }
                                                }
                                                if (x == 0) {
                                                    System.out.println("khong tim thay ma hang");
                                                }
                                                break;
                                            }
                                            case 5 -> {  // quay về

                                                n2 = false;
                                                break;
                                            }
                                            default -> {
                                                System.out.println("Vui long nhap lai");
                                            }
                                        }
                                    }
                                    break;
                                }
//                            case 2 -> {
//                                boolean n2 = true;
//                                while (n2) {
//                                    manu1x2();
//                                    int luaChon2 = sc.nextInt();
//                                    switch (luaChon2) {
//                                        case 1 -> {
//                                            // Sua thông tin 1 vé máy bay
//
//                                            break;
//                                        }
//                                        case 2 -> {
//                                            // // Sua thông tin 1 chuyến bay
//
//                                            break;
//                                        }
//                                        case 3 -> {
//                                            // Sua thông tin 1 hãng hàng không
//
//                                            break;
//                                        }
//                                        case 4 -> {
//                                            //Quay về
//                                            n2 = false;
//                                            break;
//                                        }
//
//                                        default -> {
//                                            System.out.println("Vui long nhap lai");
//                                        }
//                                    }
//                                }
//                                break;
//                            }
                                case 3 -> {
                                    boolean n2 = true;
                                    while (n2) {
                                        manu1x3();
                                        int luaChon2 = sc.nextInt();
                                        switch (luaChon2) {
                                            case 1 -> {
                                                // Xoa 1 vé máy bay
                                                FMS.xoa1VeMayBay(sc);
                                                break;
                                            }
                                            case 2 -> {
                                                // Xóa 1 chuyến bay
                                                FMS.xoa1ChuyenBay(sc);
                                                break;
                                            }
                                            case 3 -> {

                                                // Xóa 1 chiếc máy bay
                                                System.out.print("Nhap vao ma hang hang khong");
                                                sc.nextLine();
                                                String maHang = sc.nextLine();
                                                int x = 0;
                                                for (Airline item : FMS.Airlines) {
                                                    if (item != null && item.getAirlineCode().equals(maHang)) {
                                                        item.xoa1ChiecMayBay(sc);
                                                        x = 1;
                                                        break;
                                                    }
                                                }
                                                if (x == 0) {
                                                    System.out.println("Khong tim thay ma hang hang khong");
                                                }
                                                break;
                                            }
                                            case 4 -> {
                                                // Xóa 1 hãng hàng khồng
                                                FMS.removeAirline(sc);
                                                break;
                                            }
                                            case 5 -> {
                                                // quay về
                                                n2 = false;
                                                break;
                                            }
                                            default -> {
                                                System.out.println("Vui long nhap lai");
                                            }
                                        }
                                    }
                                }
                                case 4 -> {
                                    n1 = false;
                                }
                                default -> {
                                    System.out.println("Vui long nhap lai");
                                }

                            }
                        }
                        break;
                    }
                    case 2 -> {
                        boolean n1 = true;
                        while (n1) {
                            manu2();
                            int luaChon1 = sc.nextInt();
                            switch (luaChon1) {
                                case 1 -> {
                                    try {
                                        // lọc tất cả các chuyến bay còn trống
                                        boolean n2 = true;
                                        while (n2) {
                                            manu2xx();
                                            int luaChon2 = sc.nextInt();
                                            switch (luaChon2) {
                                                case 1 -> {
                                                    // theo giờ
                                                    System.out.println("Nhap vao ngay gio: ");
                                                    System.out.print("Ngay :");
                                                    int ngay = sc.nextInt();
                                                    System.out.println("");
                                                    System.out.print("Thang: ");
                                                    int thang = sc.nextInt();
                                                    System.out.println("");
                                                    System.out.print("Nam: ");
                                                    int nam = sc.nextInt();
                                                    System.out.println("");
                                                    System.out.print("Gio: ");
                                                    int gio = sc.nextInt();
                                                    ArrayList<Flight> list = FMS.filterFlightsByTime(LocalDateTime.of(nam, thang, ngay, gio, 0, 0));
                                                    show(list);
                                                    break;
                                                }
                                                case 2 -> {
                                                    // Theo ngày
                                                    System.out.println("Nhap vao ngay : ");
                                                    System.out.print("Ngay :");
                                                    int ngay = sc.nextInt();
                                                    System.out.println("");
                                                    System.out.print("Thang: ");
                                                    int thang = sc.nextInt();
                                                    System.out.println("");
                                                    System.out.print("Nam: ");
                                                    int nam = sc.nextInt();
                                                    ArrayList<Flight> list = FMS.filterFlightsByDate(LocalDateTime.of(nam, thang, ngay, 0, 0, 0));
                                                    show(list);
                                                    break;
                                                }
                                                case 3 -> {
                                                    n2 = false;
                                                    //Quay về
                                                    break;
                                                }

                                                default -> {
                                                    System.out.println("Vui long nhap lai");
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Ban da nhap sai gia tri");
                                        System.out.println(e);
                                    }
                                    break;
                                }
                                case 2 -> {
                                    // lọc danh sách các chuyến bay con trống của 1 hãng
                                    try {
                                        sc.nextLine();
                                        System.out.println("Nhap vao ma hang");
                                        String maHang = sc.nextLine();
                                        int x = 0;
                                        for (Airline item : FMS.Airlines) {
                                            if (item.getAirlineCode().equals(maHang)) {
                                                x = 1;
                                                boolean n2 = true;
                                                while (n2) {
                                                    manu2xx();
                                                    int luaChon2 = sc.nextInt();
                                                    switch (luaChon2) {
                                                        case 1 -> {
                                                            //Theo gio
                                                            System.out.println("Nhap vao ngay gio: ");
                                                            System.out.print("Ngay :");
                                                            int ngay = sc.nextInt();
                                                            System.out.println("");
                                                            System.out.print("Thang: ");
                                                            int thang = sc.nextInt();
                                                            System.out.println("");
                                                            System.out.print("Nam: ");
                                                            int nam = sc.nextInt();
                                                            System.out.println("");
                                                            System.out.print("Gio: ");
                                                            int gio = sc.nextInt();
                                                            ArrayList<Flight> list = item.kiemTraConTrongHangTheoGio(LocalDateTime.of(nam, thang, ngay, gio, 0, 0));
                                                            show(list);
                                                            break;
                                                        }
                                                        case 2 -> {
                                                            // Theo ngày
                                                            System.out.println("Nhap vao ngay : ");
                                                            System.out.print("Ngay :");
                                                            int ngay = sc.nextInt();
                                                            System.out.println("");
                                                            System.out.print("Thang: ");
                                                            int thang = sc.nextInt();
                                                            System.out.println("");
                                                            System.out.print("Nam: ");
                                                            int nam = sc.nextInt();
                                                            ArrayList<Flight> list = item.kiemTraConTrongHangTrongNgay(LocalDateTime.of(nam, thang, ngay, 0, 0, 0));
                                                            show(list);
                                                            break;
                                                        }
                                                        case 3 -> {
                                                            n2 = false;
                                                            //Quay về
                                                            break;
                                                        }

                                                        default -> {
                                                            System.out.println("Vui long nhap lai");
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        if (x == 0) {
                                            System.out.println("Khong tim thay ma hang");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("ban da nhap sai gia tri");
                                        System.out.println(e);
                                    }
                                }
                                case 3 -> {
                                    n1 = false;
                                    //Quay về
                                    break;
                                }

                                default -> {
                                    System.out.println("Vui long nhap lai");
                                }
                            }
                        }
                        break;
                    }
                    case 3 -> {
//                    // số vé còn lại ở mỗi hạng của tất cả các chuyến bay theo ngày
//                    try {
//                        System.out.println("Nhap vao ngay : ");
//                        System.out.print("Ngay :");
//                        int ngay = sc.nextInt();
//                        System.out.println("");
//                        System.out.print("Thang: ");
//                        int thang = sc.nextInt();
//                        System.out.println("");
//                        System.out.print("Nam: ");
//                        int nam = sc.nextInt();
//                    } catch (Exception e) {
//                        System.out.println("Ban da nhap sai gia tri");
//                        System.out.println(e);
//                    }
                        break;
                    }
                    case 4 -> {

                        // Danh sách hành khách của một chuyến bay
                        System.out.println("Nhap ma chuyen bay: ");
                        sc.nextLine();
                        String maChuyenBay = sc.nextLine();
                        int x = 0;
                        for (Flight item : FMS.Flights) {
                            if (item.getFlightNumber().equals(maChuyenBay)) {
                                ArrayList<Passenger> P = item.getListPassenger();
                                Collections.sort(P);
                                show(P);
                                x = 1;
                                break;
                            }
                        }
                        if (x == 0) {
                            System.out.println("Khong tim thay ma chuyen bay");
                        }
                        break;
                    }
                    case 5 -> {
                        boolean n1 = true;
                        while (n1) {
                            manu5();
                            int luaChon1 = sc.nextInt();
                            switch (luaChon1) {
                                case 1 -> {
                                    //  theo ngày đi
                                    try {
                                        System.out.println("Nhap vao ngay : ");
                                        System.out.print("Ngay :");
                                        int ngay = sc.nextInt();
                                        System.out.print("Thang: ");
                                        int thang = sc.nextInt();
                                        System.out.print("Nam: ");
                                        int nam = sc.nextInt();
                                        ArrayList<Flight> list = FMS.CacChuyenBayTheoNgay(LocalDateTime.of(nam, thang, ngay, 0, 0, 0));
                                        show(list);
                                        sc.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("Ban da nhap sai gia tri");
                                        System.out.println(e);
                                    }
                                    break;
                                }
                                case 2 -> {
                                    // theo ngày đến 
                                    try {
                                        System.out.println("Nhap vao ngay : ");
                                        System.out.print("Ngay :");
                                        int ngay = sc.nextInt();
                                        System.out.println("");
                                        System.out.print("Thang: ");
                                        int thang = sc.nextInt();
                                        System.out.println("");
                                        System.out.print("Nam: ");
                                        int nam = sc.nextInt();
                                        ArrayList<Flight> list = FMS.CacChuyenBayTheoNgayDen(LocalDateTime.of(nam, thang, ngay, 0, 0, 0));
                                        show(list);
                                        sc.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("Ban da nhap sai gia tri");
                                        System.out.println(e);
                                    }
                                    break;
                                }
                                case 3 -> {
                                    n1 = false;
                                    // quay về 
                                    break;
                                }
                                default -> {
                                    System.out.println("Vui long nhap lai");
                                }
                            }
                        }
                        break;
                    }
                    case 6 -> {
                        boolean n1 = true;
                        while (n1) {
                            manu6();
                            int luaChon1 = sc.nextInt();
                            switch (luaChon1) {
                                case 1 -> {
                                    //  các chuyến bay đi từ
                                    System.out.println("Nhap diem xuat phat");
                                    String diemXuatPhat = sc.nextLine();
                                    ArrayList<Flight> f = FMS.cacChuyenBayDiTu(diemXuatPhat);
                                    show(f);
                                    if (f == null) {
                                        System.out.println("Khong co chuyen bay nao di tu: " + diemXuatPhat);
                                    }
                                    break;
                                }
                                case 2 -> {
                                    // các chuyến bay hạ cánh tại
                                    System.out.println("Nhap diem xuat phat");
                                    String diemXuatPhat = sc.nextLine();
                                    ArrayList<Flight> f = FMS.cacChuyenBayDen(diemXuatPhat);
                                    show(f);
                                    if (f == null) {
                                        System.out.println("Khong co chuyen bay nao di tu: " + diemXuatPhat);
                                    }
                                    break;
                                }
                                case 3 -> {
                                    // các chuyến bay từ và hạ cánh tại
                                    sc.nextLine();
                                    System.out.println("Nhap diem xuat phat");
                                    String diemXuatPhat = sc.nextLine();
                                    System.out.println("Nhap diem ha canh");
                                    String diemHaCanh = sc.nextLine();
                                    ArrayList<Flight> f = FMS.cacChuyenBayDiTuVaHaCanhTai(diemXuatPhat, diemHaCanh);
                                    show(f);
                                    if (f == null) {
                                        System.out.println("Khong co chuyen bay nao di tu: " + diemXuatPhat);
                                    }
                                    break;
                                }
                                case 4 -> {
                                    n1 = false;
                                    // quay về
                                    break;
                                }
                                default -> {
                                    System.out.println("Vui long nhap lai");
                                }
                            }
                        }
                        break;
                    }
                    case 7 -> {
                        boolean n1 = true;
                        while (n1) {
                            manu7();
                            int luaChon1 = sc.nextInt();
                            switch (luaChon1) {
                                case 1 -> {
                                    //  Theo tháng
                                    break;
                                }
                                case 2 -> {
                                    // doanh thu theo năm 
                                    break;
                                }
                                case 3 -> {
                                    n1 = false;
                                    // quay về
                                    break;
                                }
                                default -> {
                                    System.out.println("Vui long nhap lai");
                                }
                            }
                        }
                        break;
                    }
                    case 8 -> {
                        n = false;
                        break;
                    }
                    default -> {
                        System.out.println("Ban da nhap sai gia tri");
                    }

                }
            } catch (Exception e) {
                System.out.println("Ban da nhap sai gia tri");
                System.out.println(e);
            }
        }
    }
}
