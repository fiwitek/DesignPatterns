import Abstract.StockWorker;

public class StockObserver extends StockWorker implements Observer{

    private static int observerIDCounter = 0;
    private int observerID;
    private Subject stockGrabber;

    public int getId(){
        return this.observerID;
    }

    public StockObserver(StockGrabber stockGrabber) {
        this.stockGrabber=stockGrabber;
        this.observerID = observerIDCounter++;
        System.out.println("New Observer "+this.observerID);
        stockGrabber.registerObserver(this);
    }

    @Override
    public void update(double ibmPrice, double applPrice, double googPrice) {
        this.applPrice=applPrice;
        this.googPrice=googPrice;
        this.ibmPrice=ibmPrice;
        printPrices();
    }

    private void printPrices() {
        System.out.println("Observer "+observerID+":\n\tAPPL price: "+applPrice+"\n\tGOOG price: "+googPrice+"\n\tIBM price: "+ibmPrice);
    }
}
