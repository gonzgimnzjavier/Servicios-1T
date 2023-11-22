package pdos;

public class testSegundoHiloJoin {

	public static void main(String[] args) {

		SegundoHilo hilo = null;
		System.out.println("el main antes de arrancar el hilo...");
		for (int i = 0; i < 10; i++) {
			hilo = new SegundoHilo(i);
			hilo.start();
			System.out.println(hilo.getId()+" " + hilo.getName());
			System.out.println(hilo.toString());
			/*System.out.println(Thread.currentThread().getName()+"----"+
					Thread.currentThread().getId());*/
			try {
				hilo.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//onliga al hilo que lo llama a terminar antes que el hilo 
			//desde el que se lanza
		}
		
		System.out.println("han rematado todos los hilos joineados");
		System.out.println("el main ha terminado");
	}
}
