package nhom4.java07.flightbookingsoftware.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChuyenBay {

    @SerializedName("MaHang")
    @Expose
    private String maHang;
    @SerializedName("MaMayBay")
    @Expose
    private String maMayBay;
    @SerializedName("ThongTinChuyenBay")
    @Expose
    private ThongTinChuyenBay thongTinChuyenBay;
    @SerializedName("ThongTinVe")
    @Expose
    private ThongTinVe thongTinVe;

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

    public ThongTinChuyenBay getThongTinChuyenBay() {
        return thongTinChuyenBay;
    }

    public void setThongTinChuyenBay(ThongTinChuyenBay thongTinChuyenBay) {
        this.thongTinChuyenBay = thongTinChuyenBay;
    }

    public ThongTinVe getThongTinVe() {
        return thongTinVe;
    }

    public void setThongTinVe(ThongTinVe thongTinVe) {
        this.thongTinVe = thongTinVe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChuyenBay.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maHang");
        sb.append('=');
        sb.append(((this.maHang == null) ? "<null>" : this.maHang));
        sb.append(',');
        sb.append("maMayBay");
        sb.append('=');
        sb.append(((this.maMayBay == null) ? "<null>" : this.maMayBay));
        sb.append(',');
        sb.append("thongTinChuyenBay");
        sb.append('=');
        sb.append(((this.thongTinChuyenBay == null) ? "<null>" : this.thongTinChuyenBay));
        sb.append(',');
        sb.append("thongTinVe");
        sb.append('=');
        sb.append(((this.thongTinVe == null) ? "<null>" : this.thongTinVe));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
