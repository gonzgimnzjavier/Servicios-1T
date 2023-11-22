package pdos;

public class testSegundoHilo {

	public static void main(String[] args) {
		
		SegundoHilo hilo=null;
		System.out.println("el main antes de arrancar el hilo...");
		for(int i=0; i<20; i++) {
			hilo= new SegundoHilo(i);
			hilo.start();
		}
		System.out.println("el main ha terminado");
	}
}
