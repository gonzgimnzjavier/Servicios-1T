package pdos;

public class testPrimerHilo {

	public static void main(String[] args) {
		
		PrimerHilo hilo = new PrimerHilo(5);
		System.out.println("el main antes de arrancar el hilo...");
		PrimerHilo hilo2 = new PrimerHilo(400);
		hilo.start();
		hilo2.start();
		System.out.println("el main ha terminado");
	}
}
