import Abstract.StockWorker;
import java.util.LinkedList;
import java.util.List;

public class StockGrabber extends StockWorker implements Subject {

    private List<Observer> observers;

    public StockGrabber() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(StockObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(StockObserver observer) {
            this.observers.remove(observer);
        System.out.println("\nObserver "+observer.getId()+" removed.\n");
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers) {
            observer.update(ibmPrice,applPrice,googPrice);
        }
    }

    public void setPrices(double ibmPrice, double applPrice, double googPrice) {
        this.applPrice=applPrice;
        this.googPrice=googPrice;
        this.ibmPrice=ibmPrice;
        notifyObserver();
    }
}
