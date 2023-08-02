/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.time.LocalDateTime;

/**
 *
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
    private int soldTickets; // số lượng vé bán ra

    public Flight() {
    }

    public Flight(String flightNumber, String aircraftNumber, String departure, String destination, LocalDateTime departuretime, LocalDateTime arrivalTime, int businessSeats, int economySeats, int soldTickets) {
        this.flightNumber = flightNumber;
        this.aircraftNumber = aircraftNumber;
        this.departure = departure;
        this.destination = destination;
        this.departuretime = departuretime;
        this.arrivalTime = arrivalTime;
        this.businessSeats = businessSeats;
        this.economySeats = economySeats;
        this.soldTickets = soldTickets;
    }

    public int getSoldTickets() {
        return soldTickets;
    }

    public void setSoldTickets(int soldTickets) {
        this.soldTickets = soldTickets;
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
    
}
