/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Tuan Anh
 */
public class Airline {

    private String airlineCode; // mã hãng
    private String airlineName;  // tên hãng
    private int aircraftCount; // số lượng máy bay
    private ArrayList<String> aircraftNumbers; //Danh sách máy bay theo số hiệu
    private ArrayList<Flight> flightslist; // Danh sách cách chuyến bay

    //=================================================================================
    public Airline() {
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
    public ArrayList<Flight> cacChuyenBayDen() { //Lọc các chuyến bay theo điểm đi
        ArrayList filteredFlightsdepartune = new ArrayList<>();
        for (Flight flight : flightslist) {
            if (flight.getDeparturetime().isEqual((ChronoLocalDateTime<?>) filteredFlightsdepartune)) {
                filteredFlightsdepartune.add(flight);
            }
        }
        return filteredFlightsdepartune;
    }

    public ArrayList<Flight> filterFlightV() { //Lọc các chuyến bay theo điểm đến
        ArrayList filteredFlightsarrival = new ArrayList<>();
        for (Flight flight : flightslist) {
            if (flight.getArrivalTime().isEqual((ChronoLocalDateTime<?>) filteredFlightsarrival)) {
                filteredFlightsarrival.add(flight);
            }
        }
        return filteredFlightsarrival;
    }

    //======================================================================================================
    //Lấy thông tin chuyến bay
    public void showInfoFlights(String maMayBay) {
        flightslist = new ArrayList<>();
        for (Flight flights : flightslist) {
            System.out.println("flightNumber: " + flights.getFlightNumber());
            System.out.println("Thời gian đến: " + flights.getArrivalTime());
            System.out.println("Thời gian đi: " + flights.getDeparturetime());
            System.out.println("Điểm đến: " + flights.getDestination());
            System.out.println("Điểm đi: " + flights.getDeparture());
            System.out.println("Cho ngồi: " + flights.getEconomySeats() + flights.getBusinessSeats());
            System.out.println("Cho ngồi thường: " + flights.getEconomySeats());
            System.out.println("Cho ngồi hạng thương gia: " + flights.getBusinessSeats());
        }
    }

    //======================================================================================================
    //Thu nhập hãng hàng không theo nam
    public double revenueairlienYear(ArrayList<Flight> flightslist, int year) {
        double revenue = 0; // Thu nhap
        Flight flights = new Flight();
        for (Flight flight : flightslist) {
            LocalDate departureDate = flight.getDeparturetime().toLocalDate();
            if (departureDate.getYear() == year) {
                revenue += flights.doanhThuChuyenBay();
            }
        }
        return revenue;
    }
    //Thu nhập hãng hàng không theo nam departureDate.getMonthValue() == month

    public double revenueairlienMonth(int month, int year) {
        double revenue = 0; // Thu nhap
        Flight flights = new Flight();
        for (Flight flight : flightslist) {
            LocalDate departureDate = flight.getDeparturetime().toLocalDate();
            if (departureDate.getMonthValue() == month && departureDate.getYear() == year) {
                revenue += flights.doanhThuChuyenBay();
            }
        }
        return revenue;
    }
    //===========================================================================================================================
    // show thông tin các hãng máy bay

    @Override
    public String toString() {
        return "Airline{" + "airlineCode=" + airlineCode + ", airlineName=" + airlineName + ", aircraftCount=" + aircraftCount + ", aircraftNumbers=" + aircraftNumbers + '}';
    }
}
