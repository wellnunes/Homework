package classpackage;

/**
 *
 * @author Wellisson Nunes
 */
public class PhysicalPerson extends Buy {

    @Override
    public double parcel() {
        return (getPrice() / getParcels());
    }

    @Override
    public void calculatePayment1(float price) {
        setPrice(price - 10);
    }

    @Override
    public void calculatePayment2(float price, float parcels) {
        setPrice(price + (parcels * 3));
    }

}
