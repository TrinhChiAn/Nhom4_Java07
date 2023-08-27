/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom4.java07.flightbookingsoftware;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tuan Anh
 */
public class FlightManagementSystem {

    ArrayList<Airline> Airlines;

    public FlightManagementSystem() {
    }

    public FlightManagementSystem(ArrayList<Airline> Airlines) {
        this.Airlines = Airlines;
    }

    public void addAirline(Scanner sc) {
        try {
            System.out.print("Nhap vao ten hang:");
            String tenHang = sc.nextLine();
            System.out.print("Nhap vao so luong may bay cua hang:");
            int soLuongMayBay = sc.nextInt();
            System.out.print("Nhap vao danh sach so hieu may bay:");
            ArrayList<String> maMayBay = new ArrayList<>();
            for (int i = 0; i < soLuongMayBay; i++) {
                IdGenerator generator = new IdGenerator();
                generator.init("TK", "", 1);
                maMayBay.add(generator.generate());
            }
            ArrayList<Flight> listFlight = new ArrayList<>();
            // làm việc với file;
            Airlines.add(new Airline(Airlines.size()+1,tenHang,soLuongMayBay,maMayBay,listFlight));
        } catch (Exception e) {
            System.out.println("Ban da nhap sai gia tri.");
        }
        
    }

    public void removeAirline(Scanner sc) {
        System.out.print("Nhap vao ma hang muon xoa");
        String maHang = sc.nextLine();
        for(int i=0; i< Airlines.size(); i++){
            if(Airlines.get(i).getAirlineCode().equals(maHang))
            {
                Airlines.remove(i);
                return;
            }
        }
        System.out.println("Khong tim thay hang hang khong nao co ma: "+maHang);
    }
}
