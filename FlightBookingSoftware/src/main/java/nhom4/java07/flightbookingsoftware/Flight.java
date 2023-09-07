/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    private double giaVePhoThong;
    private double giaVeThuongGia;
    private ArrayList<Passenger> listPassenger; // danh sách các hành khách trên chuyến bay
    private ArrayList<Ticket> listTicktet; // danh sach vé

    public Flight() {
        listPassenger = new ArrayList<>();
        listTicktet = new ArrayList<>();
    }
    
    public Flight(int n, String aircraftNumber, String departure, String destination, LocalDateTime departuretime, LocalDateTime arrivalTime, int businessSeats, int economySeats, int soldEconomTickets, int soldBusinessTickets, double giaVePhoThong, double giaVeThuongGia, ArrayList listPassenger, ArrayList listTicket) {

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
        this.soldBusinessTickets = soldBusinessTickets;
        this.soldEconomTickets = soldEconomTickets;
        this.listPassenger = listPassenger;
        this.listTicktet = listTicket;
        this.giaVePhoThong = giaVePhoThong;
        this.giaVeThuongGia = giaVeThuongGia;
    }

    public int getSoLuongVePhoThong() {
        return economySeats - soldEconomTickets;
    }

    public int getSoLuongVeThuongGia() {
        return businessSeats - soldBusinessTickets;
    }
//====================================================================================================================
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

    public ArrayList<Ticket> getListTicktet() {
        return listTicktet;
    }

    public void setListTicktet(ArrayList<Ticket> listTicktet) {
        this.listTicktet = listTicktet;
    }

    public double getGiaVePhoThong() {
        return giaVePhoThong;
    }

    public void setGiaVePhoThong(double giaVePhoThong) {
        this.giaVePhoThong = giaVePhoThong;
    }

    public double getGiaVeThuongGia() {
        return giaVeThuongGia;
    }

    public void setGiaVeThuongGia(double giaVeThuongGia) {
        this.giaVeThuongGia = giaVeThuongGia;
    }
//========================================================================================================
    public boolean isConTrong(){
        return !((businessSeats+economySeats-soldBusinessTickets-soldEconomTickets)==0);
    }
    
    public double doanhThuChuyenBay() {
        return soldBusinessTickets * giaVeThuongGia + soldEconomTickets * giaVePhoThong;
    }

    @Override
    public String toString() {
        return "Flight{" + "flightNumber=" + flightNumber + ", aircraftNumber=" + aircraftNumber + ", departure=" + departure + ", destination=" + destination + ", departuretime=" + departuretime + ", arrivalTime=" + arrivalTime + ", businessSeats=" + businessSeats + ", economySeats=" + economySeats + ", soldBusinessTickets=" + soldBusinessTickets + ", soldEconomTickets=" + soldEconomTickets + ", giaVePhoThong=" + giaVePhoThong + ", giaVeThuongGia=" + giaVeThuongGia + ", listPassenger=" + listPassenger + ", listTicktet=" + listTicktet + '}';
    }
    

    public void them1Ve(Ticket ticket) {
        listTicktet.add(ticket);
    }
    public void xoa1Ve(Ticket ticket){
        listTicktet.remove(ticket);
    }
    public void them1HanhKhach(Passenger passenger){
        listPassenger.add(passenger);
    }
    public void xoa1HanhKhach(Passenger passenger){
        listPassenger.remove(passenger);
    }
    
}
