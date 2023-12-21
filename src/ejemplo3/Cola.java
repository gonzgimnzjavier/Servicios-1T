package ejemplo3;

public class Cola {

	private int numero;
	private boolean estaOcupado = false;
	// inicialmente cola vacia

	public synchronized int get() {
		while (estaOcupado == false) {

			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(numero + " retirado de cola");
		estaOcupado = false;
		notify();

		return numero;

	}

	public synchronized void put(int valor) {
		while (estaOcupado) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("puesto " + valor + " en cola");
		numero = valor;
		estaOcupado = true;
		notifyAll();

	}

	@Override
	public String toString() {
		return "Cola [Iteracion = " + numero + "; "
				+ (estaOcupado ? "Hay algo para consumir" : "No hay nada que consumir") + "]";
	}
}
