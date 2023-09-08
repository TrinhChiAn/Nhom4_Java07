
package nhom4.java07.flightbookingsoftware.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class HangVe {

    @SerializedName("MaHangVe")
    @Expose
    private String maHangVe;
    @SerializedName("TenHangVe")
    @Expose
    private String tenHangVe;

    public String getMaHangVe() {
        return maHangVe;
    }

    public void setMaHangVe(String maHangVe) {
        this.maHangVe = maHangVe;
    }

    public String getTenHangVe() {
        return tenHangVe;
    }

    public void setTenHangVe(String tenHangVe) {
        this.tenHangVe = tenHangVe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HangVe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maHangVe");
        sb.append('=');
        sb.append(((this.maHangVe == null)?"<null>":this.maHangVe));
        sb.append(',');
        sb.append("tenHangVe");
        sb.append('=');
        sb.append(((this.tenHangVe == null)?"<null>":this.tenHangVe));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
