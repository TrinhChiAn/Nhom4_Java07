/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.time.LocalDateTime;
import java.util.ArrayList;

/*
 **
 * @author Tuan Anh
 */
public class Flight { // chuyến bay

    private String flightNumber;  // số hiệu chuyến bay
    private String aircraftNumber; // số hiệu máy bay
    private String departure; // điểm xuất phát
    private String destination; // điểm đến
    private LocalDateTime departuretime; // thời gian xuất phát
    private LocalDateTime arrivalTime; // thời gian đến
    private int businessSeats; // số lượng chỗ ngồi hạng thương gia
    private int economySeats; // số lượng chỗ ngồi hạng thường
    private int soldBusinessTickets; // số lượng vé thương gia đã bán ra
    private int soldEconomTickets; // số lượng vé phổ thông đã bán ra
    private double economyTicketPrice;// giá vé hàng ghế phổ thông
    private double bussinessTicketPrice;// giá vé hàng ghế thương gia

    private ArrayList<Passenger> listPassenger; // danh sách các hành khách trên chuyến bay

    public Flight() {
        
    }

    public Flight(int n, String aircraftNumber, String departure, String destination, LocalDateTime departuretime, LocalDateTime arrivalTime, int businessSeats, int economySeats, double economyTicketPrice, double bussinessTicketPrice, int soldEconomTickets, int soldBusinessTickets) {
        IdGenerator generator = new IdGenerator();
        generator.init("FlyN", "", n);
        this.flightNumber = generator.generate();
        this.aircraftNumber = aircraftNumber;
        this.departure = departure;
        this.destination = destination;
        this.departuretime = departuretime;
        this.arrivalTime = arrivalTime;
        this.businessSeats = businessSeats;
        this.economySeats = economySeats;
        this.economyTicketPrice = economyTicketPrice;
        this.bussinessTicketPrice = bussinessTicketPrice;
        this.soldBusinessTickets = soldBusinessTickets;
        this.soldEconomTickets = soldEconomTickets;
    }

    public int getSoLuongVePhoThong() {
        return economySeats - soldEconomTickets;
    }

    public int getSoLuongVeThuongGia() {
        return businessSeats - soldBusinessTickets;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftNumber() {
        return aircraftNumber;
    }

    public void setAircraftNumber(String aircraftNumber) {
        this.aircraftNumber = aircraftNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(LocalDateTime departuretime) {
        this.departuretime = departuretime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getBusinessSeats() {
        return businessSeats;
    }

    public void setBusinessSeats(int businessSeats) {
        this.businessSeats = businessSeats;
    }

    public int getEconomySeats() {
        return economySeats;
    }

    public void setEconomySeats(int economySeats) {
        this.economySeats = economySeats;
    }

    public int getSoldBusinessTickets() {
        return soldBusinessTickets;
    }

    public void setSoldBusinessTickets(int soldBusinessTickets) {
        this.soldBusinessTickets = soldBusinessTickets;
    }

    public int getSoldEconomTickets() {
        return soldEconomTickets;
    }

    public void setSoldEconomTickets(int soldEconomTickets) {
        this.soldEconomTickets = soldEconomTickets;
    }

    public ArrayList<Passenger> getListPassenger() {
        return listPassenger;
    }

    public void setListPassenger(ArrayList<Passenger> listPassenger) {
        this.listPassenger = listPassenger;
    }

    public double getEconomyTicketPrice() {
        return economyTicketPrice;
    }

    public void setEconomyTicketPrice(double economyTicketPrice) {
        this.economyTicketPrice = economyTicketPrice;
    }

    public double getBussinessTicketPrice() {
        return bussinessTicketPrice;
    }

    public void setBussinessTicketPrice(double bussinessTicketPrice) {
        this.bussinessTicketPrice = bussinessTicketPrice;
    }

    public boolean soVeConLai() {
        return ((economySeats - soldEconomTickets) + (businessSeats - soldBusinessTickets)) != 0;
    }

    public double doanhThuChuyenBay() {
        return bussinessTicketPrice * soldBusinessTickets + economyTicketPrice * soldEconomTickets;
    }

    public void addPassenger(Passenger passenger) {
        listPassenger.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        listPassenger.remove(passenger);
    }
}
