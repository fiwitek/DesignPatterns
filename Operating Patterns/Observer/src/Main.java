import Abstract.StockWorker;

public class Main {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        StockWorker stockObserver = new StockObserver(stockGrabber);
        StockObserver stockObserver2 = new StockObserver(stockGrabber);

        stockGrabber.setPrices(10,20,5);
        stockGrabber.unregisterObserver(stockObserver2);
        stockGrabber.setPrices(1,2,2);
    }
}
