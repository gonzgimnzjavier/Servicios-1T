package ejemplo3;

public class Consumidor extends Thread {
	private Cola cola;
	String nombre;

	public Consumidor(Cola c, String n) {
		cola = c;
		this.nombre = n;
	}

	public void run() {
		int valor = 0;
		for (int i = 0; i < 5; i++) {
            System.out.println(nombre +" llega a la cola " +cola.toString());
            System.out.println(nombre+" ESPERANDO A LLEVARSE LO QUE HAY");
			valor = cola.get(); // recoge el namero
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
