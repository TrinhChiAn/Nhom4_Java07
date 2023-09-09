package nhom4.java07.flightbookingsoftware.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ThongTinChuyenBay {

    @SerializedName("DiemXuatPhat")
    @Expose
    private String diemXuatPhat;
    @SerializedName("DiemDen")
    @Expose
    private String diemDen;
    @SerializedName("ThoiGianXuatPhat")
    @Expose
    private String thoiGianXuatPhat;
    @SerializedName("ThoiGianHaCanh")
    @Expose
    private String thoiGianHaCanh;

    public String getDiemXuatPhat() {
        return diemXuatPhat;
    }

    public void setDiemXuatPhat(String diemXuatPhat) {
        this.diemXuatPhat = diemXuatPhat;
    }

    public String getDiemDen() {
        return diemDen;
    }

    public void setDiemDen(String diemDen) {
        this.diemDen = diemDen;
    }

    public String getThoiGianXuatPhat() {
        return thoiGianXuatPhat;
    }

    public void setThoiGianXuatPhat(String thoiGianXuatPhat) {
        this.thoiGianXuatPhat = thoiGianXuatPhat;
    }

    public String getThoiGianHaCanh() {
        return thoiGianHaCanh;
    }

    public void setThoiGianHaCanh(String thoiGianHaCanh) {
        this.thoiGianHaCanh = thoiGianHaCanh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThongTinChuyenBay.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("diemXuatPhat");
        sb.append('=');
        sb.append(((this.diemXuatPhat == null) ? "<null>" : this.diemXuatPhat));
        sb.append(',');
        sb.append("diemDen");
        sb.append('=');
        sb.append(((this.diemDen == null) ? "<null>" : this.diemDen));
        sb.append(',');
        sb.append("thoiGianXuatPhat");
        sb.append('=');
        sb.append(((this.thoiGianXuatPhat == null) ? "<null>" : this.thoiGianXuatPhat));
        sb.append(',');
        sb.append("thoiGianHaCanh");
        sb.append('=');
        sb.append(((this.thoiGianHaCanh == null) ? "<null>" : this.thoiGianHaCanh));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
