package ejemplo3;

public class Productor extends Thread {

	private Cola cola;
	// el conguito produciod es un entero
	String nombre;

	public Productor(Cola c, String n) {
		cola = c;
		this.nombre = n;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(nombre + " llega a la cola " + cola.toString());
			System.out.println(nombre + ", ESPERANDO A PONER " + i);
			cola.put(i); // pone el numero en la cola

			try {
				sleep(100);

			} catch (InterruptedException e) {
			}
		}
	}

}