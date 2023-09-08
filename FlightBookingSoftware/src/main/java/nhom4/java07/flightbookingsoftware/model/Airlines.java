
package nhom4.java07.flightbookingsoftware.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Airlines {

    @SerializedName("TenHang")
    @Expose
    private String tenHang;
    @SerializedName("SoLuongMayBay")
    @Expose
    private int soLuongMayBay;
    @SerializedName("DanhSachSoHieuMayBay")
    @Expose
    private List<String> danhSachSoHieuMayBay;

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongMayBay() {
        return soLuongMayBay;
    }

    public void setSoLuongMayBay(int soLuongMayBay) {
        this.soLuongMayBay = soLuongMayBay;
    }

    public List<String> getDanhSachSoHieuMayBay() {
        return danhSachSoHieuMayBay;
    }

    public void setDanhSachSoHieuMayBay(List<String> danhSachSoHieuMayBay) {
        this.danhSachSoHieuMayBay = danhSachSoHieuMayBay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Airlines.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tenHang");
        sb.append('=');
        sb.append(((this.tenHang == null)?"<null>":this.tenHang));
        sb.append(',');
        sb.append("soLuongMayBay");
        sb.append('=');
        sb.append(this.soLuongMayBay);
        sb.append(',');
        sb.append("danhSachSoHieuMayBay");
        sb.append('=');
        sb.append(((this.danhSachSoHieuMayBay == null)?"<null>":this.danhSachSoHieuMayBay));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
