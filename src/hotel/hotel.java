package hotel;

public class hotel {
	private int places;

	public hotel(int places) {
		if (places < 0)
			places = 0;
		this.places = places;
	}

	public synchronized void entra() {
		// Cliente entra al hotel
		while (places == 0) {
			try {
				System.out.println("ESPERANDO, hotel COMPLETO");
				wait();
			} catch (InterruptedException e) {
			}
		}
		places--;
	}

	public synchronized void sale() {
		// Cliente sale del hotel
		System.out.println("Cliente SALE: Cama liberada");
		places++;
		notifyAll();

	}
}
