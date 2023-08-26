/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

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
    private ArrayList<Flight> flightsbyTime; //Danh sách chuyến bay theo giờ
    private ArrayList<Flight> flightsbyDate;//Danh sách chuyến bay theo ngày
    private Iterable<Ticket> ticketlist; //Danh sach ve
    private ArrayList<Flight> filteredFlightsdepartune;
    private ArrayList<Flight> filteredFlightsarrival = new ArrayList<>();
    //=================================================================================

    public Airline() {
    }

    public Airline(String airlineCode, String airlineName, int aircraftCount, ArrayList<String> aircraftNumbers, ArrayList<Flight> flightslist, ArrayList<Flight> flightsbyTime, ArrayList<Flight> flightsbyDate, Iterable<Ticket> ticketlist, ArrayList<Flight> filteredFlightsdepartune) {
        this.airlineCode = airlineCode;
        this.airlineName = airlineName;
        this.aircraftCount = aircraftCount;
        this.aircraftNumbers = aircraftNumbers;
        this.flightslist = flightslist;
        this.flightsbyTime = flightsbyTime;
        this.flightsbyDate = flightsbyDate;
        this.ticketlist = ticketlist;
        this.filteredFlightsdepartune = filteredFlightsdepartune;
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

    public ArrayList<Flight> getFlightsbyTime() {
        return flightsbyTime;
    }

    public void setFlightsbyTime(ArrayList<Flight> flightsbyTime) {
        this.flightsbyTime = flightsbyTime;
    }

    public ArrayList<Flight> getFlightsbyDate() {
        return flightsbyDate;
    }

    public void setFlightsbyDate(ArrayList<Flight> flightsbyDate) {
        this.flightsbyDate = flightsbyDate;
    }

    public Iterable<Ticket> getTicketlist() {
        return ticketlist;
    }

    public void setTicketlist(Iterable<Ticket> ticketlist) {
        this.ticketlist = ticketlist;
    }

    public ArrayList<Flight> getFilteredFlightsdepartune() {
        return filteredFlightsdepartune;
    }

    public void setFilteredFlightsdepartune(ArrayList<Flight> filteredFlightsdepartune) {
        this.filteredFlightsdepartune = filteredFlightsdepartune;
    }

    public ArrayList<Flight> getFilteredFlightsarrival() {
        return filteredFlightsarrival;
    }

    public void setFilteredFlightsarrival(ArrayList<Flight> filteredFlightsarrival) {
        this.filteredFlightsarrival = filteredFlightsarrival;
    }

    //==================================================================================
    //Lọc các chuyến bay theo ngày
    public ArrayList<Flight> filterFlightsByDate(LocalDateTime A) {
        flightsbyDate = new ArrayList<>();
        for (Flight flight : flightslist) {
            if ((flight.getDeparture().equals(A.getDayOfYear())) && (flight.getDeparture().equals(A.getMonth())) && (flight.getDeparture().equals(A.getYear()))) {
                flightsbyDate.add(flight);
            }
        }
        return flightsbyDate;
    }

    //Lọc các chuyến bay theo giờ 
    public ArrayList<Flight> filterFlightsByTime(LocalDateTime B) {
        flightsbyTime = new ArrayList<>();
        for (Flight flight : flightslist) {
            if ((flight.getDeparture().equals(B.getDayOfYear())) && (flight.getDeparture().equals(B.getMonth())) && (flight.getDeparture().equals(B.getYear()))) {
                flightsbyTime.add(flight);
            }
        }
        return flightsbyTime;
    }

    //Lọc các chuyến bao theo thời gian đến và thời gian đi
    public ArrayList<Flight> filterFlightD() { //Lọc các chuyến bay đi
        filteredFlightsdepartune = new ArrayList<>();
        for (Flight flight : flightslist) {
            if (flight.getDeparturetime().isEqual((ChronoLocalDateTime<?>) filteredFlightsdepartune)) {
                filteredFlightsdepartune.add(flight);
            }
        }
        return filteredFlightsdepartune;
    }

    public ArrayList<Flight> filterFlightV() { //Lọc các chuyến bay về
        filteredFlightsarrival = new ArrayList<>();
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
                flights.doanhThuChuyenBay();
            }           
        }
        return revenue;
    }
        //Thu nhập hãng hàng không theo nam departureDate.getMonthValue() == month
public double revenueairlienMonth(ArrayList<Flight> flightslist, int month) {
        double revenue = 0; // Thu nhap
        Flight flights = new Flight();
        for (Flight flight : flightslist) {
            LocalDate departureDate = flight.getDeparturetime().toLocalDate();
            if (departureDate.getMonthValue() == month) {
                flights.doanhThuChuyenBay();
            }
        }
        return revenue;
    }
    //===========================================================================================================================
    // show thông tin các hãng máy bay

    @Override
    public String toString() {
        return "Airline{" + "airlineCode=" + airlineCode + ", airlineName=" + airlineName + ", aircraftCount=" + aircraftCount + ", aircraftNumbers=" + aircraftNumbers + ", filteredFlightsarrival=" + filteredFlightsarrival + '}';
    }
}
