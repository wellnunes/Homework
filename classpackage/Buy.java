package classpackage;

/**
 *
 * @author Wellisson Nunes
 */
public abstract class Buy {

    private float price;
    private float parcels;
    private String typePerson, typeBuy;

    public Buy() {
        price = 0;
        parcels = 0;
        typePerson = "";
        typeBuy = "";
    }

    public abstract void calculatePayment1(float price);

    public abstract void calculatePayment2(float price, float parcels);

    public abstract double parcel();

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getParcels() {
        return parcels;
    }

    public void setParcels(float parcels) {
        this.parcels = parcels;
    }

    public String getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    public String getTypeBuy() {
        return typeBuy;
    }

    public void setTypeBuy(String typeBuy) {
        this.typeBuy = typeBuy;
    }

}
