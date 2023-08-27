/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nhom4.java07.flightbookingsoftware;

import java.time.LocalDateTime;

public class Ticket {  // vé 
    private String ticketCode;  // mã vé 
    private String flightNumber; // số hiệu chuyến bay
    private String departure;  // điểm xuất phát
    private String destination; // điểm đến 
    private LocalDateTime departureTime; // thoi gian đi
    private LocalDateTime arrivalTime; // thời gian đến 
    private String seatClass; // Hạng vé( phổ thông hoặc thương gia)
    

    public Ticket() {
    }

    public Ticket(int n, String flightNumber, String departure, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime, String seatClass) {
        IdGenerator generator = new IdGenerator();
        generator.init("TK", "", n);
        this.ticketCode = generator.generate();
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatClass = seatClass;
        
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
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

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

}

