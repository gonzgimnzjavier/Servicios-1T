package parking;

public class Parking {
	private int plazas;

	// constructor
	public Parking(int sitios) {
		if (sitios < 0)
			sitios = 0;
		this.plazas = sitios;
	}

	// METODOS SINCRONIZADOS
	public synchronized void entra() throws InterruptedException {
		while (plazas == 0) {
			try {
				System.out.println("ESPERANDO, parking COMPLETO");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		plazas--;
	}

	public synchronized void sale() {
		// Cliente sale del parking
		System.out.println("Cliente SALE: Cama liberada");
		plazas++;
		notifyAll();
	}
}
