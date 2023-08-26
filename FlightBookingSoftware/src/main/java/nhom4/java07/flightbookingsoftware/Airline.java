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
    public void filterFlightsByDate(LocalDateTime date) {
         flightsbyDate = new ArrayList<>();
        for (Flight flight : flightslist) {
            if (flight.getDeparture().equals(date)) {
                flightsbyDate.add(flight);
            }
        }
    }

    //Lọc các chuyến bay theo giờ 
    public void filterFlightsByTime(LocalDateTime time) {
        flightsbyTime = new ArrayList<>();
        for (Flight flight : flightslist) {
            if (flight.getDeparture().equals(time)) {
                flightsbyTime.add(flight);
            }
        }
    }

    //Lọc các chuyến bao theo thời gian đến và thời gian đi
    public void filterFlightD() { //Lọc các chuyến bay đi
        filteredFlightsdepartune = new ArrayList<>();
        for (Flight flight : flightslist) {
            if (flight.getDeparturetime().isEqual((ChronoLocalDateTime<?>) filteredFlightsdepartune)) {
                filteredFlightsdepartune.add(flight);
            }
        }
    }

    public void filterFlightV() { //Lọc các chuyến bay về
         filteredFlightsarrival = new ArrayList<>();
        for (Flight flight : flightslist) {
            if (flight.getArrivalTime().isEqual((ChronoLocalDateTime<?>) filteredFlightsarrival)) {
                filteredFlightsarrival.add(flight);
            }
        }
    }

    //======================================================================================================
    //Lấy thông tin chuyến bay
    public void showInfoFlights() {
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
    //Thu nhập hãng hàng không(theo thang va theo nam)
    public double revenueairlien(ArrayList<Flight> flightslist, ArrayList<Ticket> ticketlsit, int year, int month) {
        double revenue = 0; // Thu nhap
        for (Flight flight : flightslist) {
                LocalDate departureDate = flight.getDeparturetime().toLocalDate();
                if (departureDate.getYear() == year) {
                    revenue += flight.getSoldBusinessTickets()*flight.getBussinessTicketPrice() + flight.getSoldEconomTickets()*flight.getEconomyTicketPrice();
                } else if (departureDate.getMonthValue() == month) {
                     revenue += flight.getSoldBusinessTickets()*flight.getBussinessTicketPrice() + flight.getSoldEconomTickets()*flight.getEconomyTicketPrice();
                }
            }
        return revenue;
    }

    //===========================================================================================================
    //Điền thông tin của các hãng máy bay
    public void inputInfoairline(Scanner sc) {

        System.out.print("Enter airline code: ");
        airlineCode = sc.nextLine();

        System.out.print("Enter airline name: ");
        airlineName = sc.nextLine();

        System.out.print("Enter aircraft count: ");
        aircraftCount = Integer.parseInt(sc.nextLine());

        aircraftNumbers = new ArrayList<>();
        for (int i = 0; i < aircraftCount; i++) {
            System.out.print("Enter aircraft number " + (i + 1) + ": ");
            String aircraftNumber = sc.nextLine();
            aircraftNumbers.add(aircraftNumber);

        }

    }

    //===========================================================================================================================
    // show thông tin các hãng máy bay
    public void showinfoInfoairline() {
        System.out.println("=============Thông tin hãng máy bay==================");
        System.out.println("Airline Code: " + airlineCode);
        System.out.println("Airline Name: " + airlineName);
        System.out.println("Aircraft Count: " + aircraftCount);
        System.out.println("Aircraft Numbers: " + aircraftNumbers);
    }

//=============================================================================================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Airline airline = new Airline();

        System.out.println("Enter airline count: ");
        int airlineCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < airlineCount; i++) {
            System.out.println("Airline number " + (i + 1) + ":");
            airline.inputInfoairline(sc);
            airline.showinfoInfoairline();

        }

    }
}
