package nhom4.java07.flightbookingsoftware;

import java.lang.reflect.Modifier;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightManagementSystem {

    ArrayList<Airline> Airlines;
    ArrayList<Ticket> Tickets;
    ArrayList<Flight> Flights;

    public FlightManagementSystem(ArrayList<Airline> Airlines, ArrayList<Ticket> Passengers, ArrayList<Flight> Flights) {
        this.Airlines = Airlines;
        this.Tickets = Passengers;
        this.Flights = Flights;
    }

    public FlightManagementSystem() {
        Airlines = new ArrayList<>();
        Tickets = new ArrayList<>();
        Flights = new ArrayList<>();
    }
    // lọc các chuyến bay con trong theo ngay
    public ArrayList<Flight> filterFlightsByDate(LocalDateTime A) {
        ArrayList flightsbyDate = new ArrayList<>();
        for (Flight flight : Flights) {
            if (flight.isConTrong() && A.getYear() == flight.getDeparturetime().getYear() && A.getDayOfMonth() == flight.getDeparturetime().getDayOfMonth() && A.getMonth() == flight.getDeparturetime().getMonth()) {
                flightsbyDate.add(flight);
            }
        }
        return flightsbyDate;
    }

    //Lọc các chuyến ocn trong bay theo giờ 
    public ArrayList<Flight> filterFlightsByTime(LocalDateTime A) {
        ArrayList flightsbyTime = new ArrayList<>();
        for (Flight flight : Flights) {
            if (flight.isConTrong() && A.getYear() == flight.getDeparturetime().getYear() && A.getDayOfMonth() == flight.getDeparturetime().getDayOfMonth() && A.getMonth() == flight.getDeparturetime().getMonth() && A.getHour() == flight.getDeparturetime().getHour()) {
                flightsbyTime.add(flight);
            }
        }
        return flightsbyTime;
    }

    public void xoa1VeMayBay(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhap vao ma ve: ");
        String maVe = sc.nextLine();
        for (int k = Tickets.size() - 1; k >= 0; k--) {
            if (Tickets.get(k).getTicketCode().equals(maVe)) {
                for (int i = 0; i <= Airlines.size() - 1; i++) {
                    if (Airlines.get(i).getAirlineCode().equals(Tickets.get(k).getAirlineCode())) {
                        for (int j = Airlines.get(i).getFlightslist().size() - 1; j >= 0; j--) {
                            if (Airlines.get(i).getFlightslist().get(j).getFlightNumber().equals(Tickets.get(k).getFlightNumber())) {
                                Airlines.get(i).getFlightslist().get(j).getListTicktet().remove(Tickets.get(k));
                                Tickets.get(k).setTicketCode("0");
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
        System.out.println("Khong tim thay ma ve");
    }

    public void them1VeMayBay(Scanner sc) {
        try {
            sc.nextLine();
            System.out.println("Nhap vao ma hang: ");
            String maHang = sc.nextLine();
            for (int i = 0; i < Airlines.size(); i++) {
                if (Airlines.get(i).getAirlineCode().equals(maHang)) {
                    System.out.print("Nhap vao ma may bay: ");
                    String maMayBay = sc.nextLine();
                    for (int j = 0; j < Airlines.get(i).getAircraftNumbers().size(); j++) {
                        if (Airlines.get(i).getAircraftNumbers().get(j).equals(maMayBay)) {
                            System.out.println("Nhap vao ma chuyen bay:");
                            String maChuyenBay = sc.nextLine();
                            for (int k = Airlines.get(i).getFlightslist().size() - 1; k >= 0; k--) {
                                if (maChuyenBay.equals(Airlines.get(i).getFlightslist().get(k).getFlightNumber())) {
                                    int loaiVe;
                                    do {
                                        System.out.print("Nhap loai ve muon mua(thuong gia: 1 | pho thong: 2): ");
                                        loaiVe = sc.nextInt();
                                    } while (loaiVe == 1 || loaiVe == 2);
                                    sc.nextLine();
                                    Airlines.get(i).getFlightslist().get(k).getListTicktet().add(new Ticket(Tickets.size() + 1, maChuyenBay, Airlines.get(i).getFlightslist().get(k).getDeparture(), Airlines.get(i).getFlightslist().get(k).getDestination(), Airlines.get(i).getFlightslist().get(k).getDeparturetime(), Airlines.get(i).getFlightslist().get(k).getArrivalTime(), loaiVe, maHang));
                                    System.out.print("Nhap vao ho va ten hanh khach: ");
                                    Airlines.get(i).getFlightslist().get(k).getListPassenger().add(new Passenger(Tickets.size() + 1, sc.nextLine(), Airlines.get(i).getFlightslist().get(k).getListTicktet().get(Airlines.get(i).getFlightslist().get(k).getListTicktet().size() - 1).getTicketCode()));
                                    Tickets.add(new Ticket(Tickets.size() + 1, maChuyenBay, Airlines.get(i).getFlightslist().get(k).getDeparture(), Airlines.get(i).getFlightslist().get(k).getDestination(), Airlines.get(i).getFlightslist().get(k).getDeparturetime(), Airlines.get(i).getFlightslist().get(k).getArrivalTime(), loaiVe, maHang));
                                    if (loaiVe == 1) {
                                        Airlines.get(i).getFlightslist().get(k).setBusinessSeats(Airlines.get(i).getFlightslist().get(k).getBusinessSeats() + 1);
                                    } else {
                                        Airlines.get(i).getFlightslist().get(k).setEconomySeats(Airlines.get(i).getFlightslist().get(k).getEconomySeats() + 1);
                                    }
                                    return;
                                }
                            }
                            System.out.println("Khong tim thay ma chuyn bay");
                            break;
                        }
                    }
                    System.out.println("Khong tim thay ma may bay");
                    break;
                }
            }
            System.out.println("Khong tim thay ma hang");
        } catch (Exception e) {
            System.out.println(e);
        }
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
                            for (int k = Airlines.get(i).getFlightslist().size() - 1; k >= 0; k++) {
                                if (Airlines.get(i).getFlightslist().get(i).getAircraftNumber().equals(maMayBay) && Airlines.get(i).getFlightslist().get(k).getArrivalTime().isAfter(departuretime)) {
                                    System.out.println("May bay nay chua ha canh");
                                    return;
                                }
                            }
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
                    Flights.get(i).setFlightNumber("0");
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
            sc.nextLine();
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
        sc.nextLine();
        System.out.print("Nhap vao ma hang muon xoa");
        String maHang = sc.nextLine();
        for (int i = 0; i < Airlines.size(); i++) {
            if (Airlines.get(i).getAirlineCode().equals(maHang)) {
                Airlines.get(i).setAirlineCode("0");
                return;
            }
        }
        System.out.println("Khong tim thay hang hang khong nao co ma: " + maHang);
    }
}
