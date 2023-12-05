package ProdCons;

public class Cola {

	private int numero;

	private boolean disponible = false;
	// inicialmente cola vacia

	public synchronized int get() {
		if (disponible == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		disponible = false; // cola no vacia
		notifyAll();
		return numero; // retorna valor de la cola
	}

	// SINCRO
	public synchronized void put(int valor) {
		while (disponible == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		numero = valor;
		disponible = true;
		notifyAll();
	}

	@Override
	public String toString() {
		return "Cola [numero=" + numero + ", disponible=" + disponible + "]";
	}

}
