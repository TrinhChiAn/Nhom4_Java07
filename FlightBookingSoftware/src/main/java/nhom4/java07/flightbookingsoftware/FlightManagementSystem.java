/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tuan Anh
 */
public class FlightManagementSystem {

    ArrayList<Airline> Airlines;
    ArrayList<Passenger> Passengers;
    ArrayList<Flight> Flights;

    public FlightManagementSystem(ArrayList<Airline> Airlines, ArrayList<Passenger> Passengers, ArrayList<Flight> Flights) {
        this.Airlines = Airlines;
        this.Passengers = Passengers;
        this.Flights = Flights;
    }

    public FlightManagementSystem() {
    }

    public void them1ChuyenBay(Scanner sc) {
        try {
            sc.nextLine();
            System.out.print("Nhap vao ma hang: ");
            String maHang = sc.nextLine();
            for (int i = 0; i < Airlines.size(); i++) {
                if (Airlines.get(i).getAirlineCode().equals(maHang)) {
                    System.out.print("Nhap vao ma may bay: ");
                    String maMayBay = sc.nextLine();
                    for (int j = 0; j < Airlines.get(i).getAircraftNumbers().size(); j++) {
                        if (Airlines.get(i).getAircraftNumbers().get(j).equals(maMayBay)) {
                            System.out.print("Diem xuat phat: ");
                            String departure = sc.nextLine();
                            System.out.print("diem den: ");
                            String destination = sc.nextLine();
                            LocalDateTime departuretime;
                            do {
                                System.out.print("Thoi gian xuat phat: ");
                                departuretime = LocalDateTime.parse(sc.nextLine());
                            } while (departuretime.isBefore(LocalDateTime.now()));
                            LocalDateTime arrivalTime;
                            do {
                                System.out.println("Thoi gian ha canh: ");
                                arrivalTime = LocalDateTime.parse(sc.nextLine());
                            } while (arrivalTime.isBefore(departuretime));
                            System.out.print("So luong ve pho thong: ");
                            int economySeats = sc.nextInt();
                            System.out.print("Gia ve pho thong: ");
                            double giaVePhoThong = sc.nextDouble();
                            System.out.print("So luong ve thuong gia: ");
                            int businessSeats = sc.nextInt();
                            System.out.print("Gia ve thuong gia: ");
                            double giaVeThuongGia = sc.nextDouble();
                            Airlines.get(i).getFlightslist().add(new Flight(this.Flights.size() + 1, maMayBay, departure, destination, departuretime, arrivalTime, businessSeats, economySeats, 0, 0, giaVePhoThong, giaVeThuongGia, new ArrayList(), new ArrayList()));
                            Flights.add(new Flight(this.Flights.size() + 1, maMayBay, departure, destination, departuretime, arrivalTime, businessSeats, economySeats, 0, 0, giaVePhoThong, giaVeThuongGia, new ArrayList(), new ArrayList()));
                            break;
                        }
                    }
                    System.out.println("Khong tim thay ma may bay");
                    break;
                }
            }
            System.out.println("Khong tim thay ma hang");

        } catch (Exception e) {
            System.out.println("=======================");
            System.out.println("Bạn da nhap sai gia tri");
            System.out.println("=======================");
        }
    }

    public void xoa1ChuyenBay(Scanner sc) {
        try {
            sc.nextLine();
            System.out.print("Nhap vao ma Chuyen bay: ");
            sc.nextLine();
            String maChuyenBay = sc.nextLine();
            for (int i = Flights.size() - 1; i >= 0; i--) {
                if (maChuyenBay.equals(Flights.get(i).getFlightNumber())) {
                    for (int j = 0; j < Airlines.size(); j++) {
                        for (int k = 0; k < Airlines.get(j).getAircraftNumbers().size(); k++) {
                            if (Airlines.get(j).getAircraftNumbers().get(k).equals(Flights.get(i).getAircraftNumber())) {
                                Airlines.get(j).getFlightslist().remove(Flights.get(i));
                                break;
                            }
                        }
                    }
                    Flights.remove(i);
                }
            }
        } catch (Exception e) {
            System.out.println("=======================");
            System.out.println("Bạn da nhap sai gia tri");
            System.out.println("=======================");
        }
    }

    public void addAirline(Scanner sc) {
        try {
            System.out.print("Nhap vao ten hang:");
            String tenHang = sc.nextLine();
            System.out.print("Nhap vao so luong may bay cua hang:");
            int soLuongMayBay = sc.nextInt();
            System.out.print("Nhap vao danh sach so hieu may bay:");
            ArrayList<String> maMayBay = new ArrayList<>();
            for (int i = 0; i < soLuongMayBay; i++) {
                IdGenerator generator = new IdGenerator();
                generator.init("TK", "", 1);
                maMayBay.add(generator.generate());
            }
            ArrayList<Flight> listFlight = new ArrayList<>();
            // làm việc với file;
            Airlines.add(new Airline(Airlines.size() + 1, tenHang, soLuongMayBay, maMayBay, listFlight));
        } catch (Exception e) {
            System.out.println("Ban da nhap sai gia tri.");
        }

    }

    public void removeAirline(Scanner sc) {
        System.out.print("Nhap vao ma hang muon xoa");
        String maHang = sc.nextLine();
        for (int i = 0; i < Airlines.size(); i++) {
            if (Airlines.get(i).getAirlineCode().equals(maHang)) {
                Airlines.remove(i);
                return;
            }
        }
        System.out.println("Khong tim thay hang hang khong nao co ma: " + maHang);
    }
}
