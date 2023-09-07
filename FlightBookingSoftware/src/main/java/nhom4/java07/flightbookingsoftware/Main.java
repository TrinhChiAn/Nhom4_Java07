/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("3. Quay ve");
    }
//==============================================================================================

    static void manu5() {
        System.out.println("Moi bạn nhap lua chon: ");
        System.out.println("1. Theo ngay di");
        System.out.println("2. Theo ngay den");
        System.out.println("3. Quay ve");
    }

    static void manu6() {
        System.out.println("Moi ban nhap lua chon: ");
        System.out.println("1. Cac chuyen bay tu");
        System.out.println("2. Cac chuyen bay ha canh tai");
        System.out.println("3. Cac chuyen bay cat canh tu va ha canh tai");
        System.out.println("4. Quay ve");
    }

    static void manu7() {
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
                                            break;
                                        }
//                                        case 4 -> {
//
//                                            // thêm 1 chiếc máy bay
//                                            break;
//                                        }
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
                                    manu1x1();
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
//                                        case 3 -> {
//
//                                            // Xóa 1 chiếc máy bay
//                                            break;
//                                        }
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
                                // lọc tất cả các chuyến bay còn trống
                                boolean n2 = true;
                                while (n2) {
                                    manu2xx();
                                    int luaChon2 = sc.nextInt();
                                    switch (luaChon2) {
                                        case 1 -> {
                                            //ArrayList<Flight> list = FMS.filterFlightsByTime();
                                            // theo giờ
                                            break;
                                        }
                                        case 2 -> {
                                            // Theo ngày
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
                            case 2 -> {
                                // lọc danh sách các chuyến bay con trống của 1 hãng
                                boolean n2 = true;
                                while (n2) {
                                    manu2xx();
                                    int luaChon2 = sc.nextInt();
                                    switch (luaChon2) {
                                        case 1 -> {
                                            //Theo gio
                                            break;
                                        }
                                        case 2 -> {
                                            // Theo ngày
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
                    // số vé còn lại ở mỗi hạng của tất cả các chuyến bay theo ngày
                    break;
                }
                case 4 -> {

                    // Danh sách hành khách của một chuyến bay
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
                                break;
                            }
                            case 2 -> {
                                // theo ngày đến 
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
                                break;
                            }
                            case 2 -> {
                                // các chuyến bay hạ cánh tại
                                break;
                            }
                            case 3 -> {
                                // các chuyến bay từ và hạ cánh tại
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
        }
    }
}
