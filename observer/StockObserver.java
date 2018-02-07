public class StockObserver implements Observer {

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	private static int observerIDTracker = 0;

	private int observerID;

	private Subject stockGrabber;

	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;

		System.out.println("new observer " + this.observerID);

		stockGrabber.register(this);
	}

	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice){
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;

		printThePrices();
	}

	public void printThePrices(){
		System.out.print(observerID + " IBM " + ibmPrice + "\n");
		System.out.print(observerID + " AAPL " + aaplPrice + "\n");
		System.out.print(observerID + " GOOG " + googPrice + "\n");
		System.out.println();
	}
}