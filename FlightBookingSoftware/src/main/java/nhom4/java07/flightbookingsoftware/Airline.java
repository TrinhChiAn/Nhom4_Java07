/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.util.ArrayList;

/**
 *
 *
 */
public class Airline {
    private String airlineCode; // mã hãng
    private String airlineName;  // tên hạng
    private int aircraftCount; // số lượng máy bay
    private ArrayList<String> aircraftNumbers;

    public Airline() {
        aircraftNumbers = new ArrayList<>();
    }

    public Airline(String airlineCode, String airlineName, int aircraftCount, ArrayList<String> aircraftNumbers) {
        this.airlineCode = airlineCode;
        this.airlineName = airlineName;
        this.aircraftCount = aircraftCount;
        this.aircraftNumbers = aircraftNumbers;
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
    
}
