/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tuan Anh
 */
public class Airline implements Comparable<Airline> {

    private String airlineCode; // mã hãng
    private String airlineName;  // tên hãng
    private int aircraftCount; // số lượng máy bay
    private ArrayList<String> aircraftNumbers; //Danh sách máy bay theo số hiệu
    private ArrayList<Flight> flightslist; // Danh sách cách chuyến bay

    //=================================================================================
    public Airline() {
        aircraftNumbers = new ArrayList<>();
        flightslist = new ArrayList<>();
    }

    public Airline(int n, String airlineName, int aircraftCount, ArrayList<String> aircraftNumbers, ArrayList<Flight> flights) {
        IdGenerator generator = new IdGenerator();
        generator.init("AIR", "", n);
        this.airlineCode = generator.generate();
        this.airlineName = airlineName;
        this.aircraftCount = aircraftCount;
        this.aircraftNumbers = aircraftNumbers;
        this.flightslist = flights;

    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getAircraftCount() {
        return aircraftCount;
    }

    public void setAircraftCount(int aircraftCount) {
        this.aircraftCount = aircraftCount;
    }

    public ArrayList<String> getAircraftNumbers() {
        return aircraftNumbers;
    }

    public void setAircraftNumbers(ArrayList<String> aircraftNumbers) {
        this.aircraftNumbers = aircraftNumbers;
    }

    public ArrayList<Flight> getFlightslist() {
        return flightslist;
    }

    public void setFlightslist(ArrayList<Flight> flightslist) {
        this.flightslist = flightslist;
    }

    //==================================================================================
    //Lọc các chuyến bay theo ngày
    public ArrayList<Flight> filterFlightsByDate(LocalDateTime A) {
        ArrayList flightsbyDate = new ArrayList<>();
        for (Flight flight : flightslist) {
            if (A.getYear() == flight.getDeparturetime().getYear() && A.getDayOfMonth() == flight.getDeparturetime().getDayOfMonth() && A.getMonth() == flight.getDeparturetime().getMonth()) {
                flightsbyDate.add(flight);
            }
        }
        return flightsbyDate;
    }

    //Lọc các chuyến bay theo giờ 
    public ArrayList<Flight> filterFlightsByTime(LocalDateTime A) {
        ArrayList flightsbyTime = new ArrayList<>();
        for (Flight flight : flightslist) {
            if (A.getYear() == flight.getDeparturetime().getYear() && A.getDayOfMonth() == flight.getDeparturetime().getDayOfMonth() && A.getMonth() == flight.getDeparturetime().getMonth() && A.getHour() == flight.getDeparturetime().getHour()) {
                flightsbyTime.add(flight);
            }
        }
        return flightsbyTime;
    }

    //Lọc các chuyến bao theo điểm đi và điểm đến
    public ArrayList<Flight> cacChuyenBayDiTu(String str) { //Lọc các chuyến bay theo điểm đi
        ArrayList list = new ArrayList<>();
        for (Flight flight : flightslist) {
            if (flight.getDeparture().equalsIgnoreCase(str) && flight.getDeparturetime().isAfter(LocalDateTime.now())) {
                list.add(flight);
            }
        }
        return list;
    }

    public ArrayList<Flight> cacChuyenBayDen(String str) { //Lọc các chuyến bay theo điểm đến
        ArrayList list = new ArrayList<>();
        for (Flight flight : flightslist) {
            if (flight.getDestination().equalsIgnoreCase(str) && flight.getDeparturetime().isAfter(LocalDateTime.now())) {
                list.add(flight);
            }
        }
        return list;
    }

    //======================================================================================================
    //Lấy thông tin chuyến bay
    public void showInfoFlights(String maMayBay) {
        for (Flight flights : flightslist) {
            if (flights.getFlightNumber().equals(maMayBay)) {
                System.out.println("flightNumber: " + flights.getFlightNumber());
                System.out.println("Thời gian đến: " + flights.getArrivalTime());
                System.out.println("Thời gian đi: " + flights.getDeparturetime());
                System.out.println("Điểm đến: " + flights.getDestination());
                System.out.println("Điểm đi: " + flights.getDeparture());
                System.out.println("Cho ngồi: " + flights.getEconomySeats() + flights.getBusinessSeats());
                System.out.println("Cho ngồi thường: " + flights.getEconomySeats());
                System.out.println("Cho ngồi hạng thương gia: " + flights.getBusinessSeats());
                System.out.println("Cho ngoi thuong con lai: " + flights.getSoLuongVePhoThong());
                System.out.println("Cho ngoi thuong gia con lai: " + flights.getSoLuongVeThuongGia());
            }
        }
    }

    //======================================================================================================
    //Thu nhập hãng hàng không theo nam
    public double revenueairlienYear(ArrayList<Flight> flightslist, int year) {
        double revenue = 0; // Thu nhap
        for (Flight flight : flightslist) {
            LocalDate departureDate = flight.getDeparturetime().toLocalDate();
            if (departureDate.getYear() == year) {
                revenue += flight.doanhThuChuyenBay();
            }
        }
        return revenue;
    }
    //Thu nhập hãng hàng không theo nam departureDate.getMonthValue() == month

    public double revenueairlienMonth(int month, int year) {
        double revenue = 0; // Thu nhap
        for (Flight flight : flightslist) {
            if (flight.getDeparturetime().getMonthValue() == month && flight.getDeparturetime().getYear() == year) {
                revenue += flight.doanhThuChuyenBay();
            }
        }
        return revenue;
    }

    public List<Flight> kiemTraConTrongHangTrongNgay(LocalDateTime A) {
        ArrayList<Flight> list = filterFlightsByDate(A);
        ArrayList<Flight> retu = new ArrayList<>();
        for (Flight item : list) {
            if (item.isConTrong()) {
                retu.add(item);
            }
        }
        return retu;
    }

    public List<Flight> kiemTraConTrongHangTheoGio(LocalDateTime A) {
        ArrayList<Flight> list = filterFlightsByTime(A);
        ArrayList<Flight> retur = new ArrayList<>();
        for (Flight item : list) {
            if (item.isConTrong()) {
                retur.add(item);
            }
        }
        return retur;
    }

    public void Them1ChiecMayBay(Scanner sc) {
        aircraftCount = aircraftCount++;
        IdGenerator generator = new IdGenerator();
        generator.init("TK", "", aircraftNumbers.size());
        aircraftNumbers.add(generator.generate());
    }
    
    public void xoa1ChiecMayBay(Scanner sc){
        aircraftCount = aircraftCount--;
        System.out.print("Nhap vao ma may bay muon xoa");
        String maMayBay = sc.nextLine();
        for(int i=0; i<aircraftNumbers.size(); i++){
            if(aircraftNumbers.get(i)!=null&&aircraftNumbers.get(i).equals(maMayBay )){
                aircraftNumbers.set(i, null);
            }
        }
    }

    //===========================================================================================================================
    // show thông tin các hãng máy bay
    @Override
    public String toString() {
        return "Airline{" + "airlineCode=" + airlineCode + ", airlineName=" + airlineName + ", aircraftCount=" + aircraftCount + ", aircraftNumbers=" + aircraftNumbers + '}';
    }

    @Override
    public int compareTo(Airline o) {
        return this.airlineName.toUpperCase().compareTo(o.getAirlineName().toUpperCase());
    }
}
