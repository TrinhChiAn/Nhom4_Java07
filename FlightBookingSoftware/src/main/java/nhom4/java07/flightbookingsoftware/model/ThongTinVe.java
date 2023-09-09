package nhom4.java07.flightbookingsoftware.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ThongTinVe {

    @SerializedName("SoLuongVePhoThong")
    @Expose
    private int soLuongVePhoThong;
    @SerializedName("GiaVePhoThong")
    @Expose
    private double giaVePhoThong;
    @SerializedName("SoLuongVeThuongGia")
    @Expose
    private int soLuongVeThuongGia;
    @SerializedName("GiaVeThuongGia")
    @Expose
    private double giaVeThuongGia;

    public int getSoLuongVePhoThong() {
        return soLuongVePhoThong;
    }

    public void setSoLuongVePhoThong(int soLuongVePhoThong) {
        this.soLuongVePhoThong = soLuongVePhoThong;
    }

    public double getGiaVePhoThong() {
        return giaVePhoThong;
    }

    public void setGiaVePhoThong(double giaVePhoThong) {
        this.giaVePhoThong = giaVePhoThong;
    }

    public int getSoLuongVeThuongGia() {
        return soLuongVeThuongGia;
    }

    public void setSoLuongVeThuongGia(int soLuongVeThuongGia) {
        this.soLuongVeThuongGia = soLuongVeThuongGia;
    }

    public double getGiaVeThuongGia() {
        return giaVeThuongGia;
    }

    public void setGiaVeThuongGia(double giaVeThuongGia) {
        this.giaVeThuongGia = giaVeThuongGia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThongTinVe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("soLuongVePhoThong");
        sb.append('=');
        sb.append(this.soLuongVePhoThong);
        sb.append(',');
        sb.append("giaVePhoThong");
        sb.append('=');
        sb.append(this.giaVePhoThong);
        sb.append(',');
        sb.append("soLuongVeThuongGia");
        sb.append('=');
        sb.append(this.soLuongVeThuongGia);
        sb.append(',');
        sb.append("giaVeThuongGia");
        sb.append('=');
        sb.append(this.giaVeThuongGia);
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
