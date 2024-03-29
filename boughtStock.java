import java.sql.Timestamp;

public class boughtStock {
    private int customerid;
    private String ticker;
    private int numshare;
    private Timestamp date;
    private int sb;
    private double price;

    public boughtStock(int customerid, String ticker, int numshare, Timestamp date, int sb, double price){
        this.customerid = customerid;
        this.ticker = ticker;
        this.numshare = numshare;
        this.date = date;
        this.sb = sb;
        this.price = price;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public int getNumshare() {
        return numshare;
    }

    public void setNumshare(int numshare) {
        this.numshare = numshare;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getSb() {
        return sb;
    }

    public void setSb(int sb) {
        this.sb = sb;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
