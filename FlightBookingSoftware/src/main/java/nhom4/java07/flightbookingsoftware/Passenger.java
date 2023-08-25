/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

/**
 *
 * @author Tuan Anh
 */
public class Passenger {        // Hành khách
    private String cccd; // số cccd
    private String fullName; // họ và tên
    private String ticketcode; // mã vé

    public Passenger() {
    }

    public Passenger(int n, String fullName, String ticketcode) {
        IdGenerator generator = new IdGenerator();
        generator.init("VN", "U", n);
        this.cccd = generator.generate();
        this.fullName = fullName;
        this.ticketcode = ticketcode;
    }

    public String getTicketcode() {
        return ticketcode;
    }

    public void setTicketcode(String ticketcode) {
        this.ticketcode = ticketcode;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
}
