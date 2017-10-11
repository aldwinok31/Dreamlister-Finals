package aldwin.tablante.com.mobilefinals;
import android.net.Uri;
/**
 * Created by Bobby on 06/10/2017.
 */

public class Wishbase {
    private Uri pic;
    private String Wishname;
    private String Description;
    private double price;
    private int Wishid;
public Wishbase(){};
    public Wishbase(String wishname, String description, double price, int wishid) {
        Wishname = wishname;
        Description = description;
        this.price = price;
        Wishid = wishid;
    }

    public String getWishname() {
        return Wishname;
    }

    public void setWishname(String wishname) {
        Wishname = wishname;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String decription) {
        Description = decription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWishid() {
        return Wishid;
    }

    public void setWishid(int wishid) {
        Wishid = wishid;
    }
}
