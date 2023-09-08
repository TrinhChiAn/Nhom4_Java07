package nhom4.java07.flightbookingsoftware.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VeMayBay {

    @SerializedName("MaHang")
    @Expose
    private String maHang;
    @SerializedName("MaMayBay")
    @Expose
    private String maMayBay;
    @SerializedName("MaChuyenBay")
    @Expose
    private String maChuyenBay;
    @SerializedName("HangVe")
    @Expose
    private HangVe hangVe;
    @SerializedName("TenKhachHang")
    @Expose
    private String tenKhachHang;

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getMaMayBay() {
        return maMayBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public HangVe getHangVe() {
        return hangVe;
    }

    public void setHangVe(HangVe hangVe) {
        this.hangVe = hangVe;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VeMayBay.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maHang");
        sb.append('=');
        sb.append(((this.maHang == null) ? "<null>" : this.maHang));
        sb.append(',');
        sb.append("maMayBay");
        sb.append('=');
        sb.append(((this.maMayBay == null) ? "<null>" : this.maMayBay));
        sb.append(',');
        sb.append("maChuyenBay");
        sb.append('=');
        sb.append(((this.maChuyenBay == null) ? "<null>" : this.maChuyenBay));
        sb.append(',');
        sb.append("hangVe");
        sb.append('=');
        sb.append(((this.hangVe == null) ? "<null>" : this.hangVe));
        sb.append(',');
        sb.append("tenKhachHang");
        sb.append('=');
        sb.append(((this.tenKhachHang == null) ? "<null>" : this.tenKhachHang));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
