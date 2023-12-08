package parking;

public class Coche extends Thread {

	// Ejercicio examen pero añadira metodo de pago en cada hilo
	// objeto compartido
	private Parking parking;
	int t=0;

	// constructor cada coche que usara el parking
	public Coche(String numero, Parking central) {
		super(numero);
		this.parking = central;
		start();// del coche
		// podria hacer aqui un join

	}

	// metodo run del coche
	public void run() {
		try {//duerme diez segundos
			parking.entra();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println(getName() + " entro al parking");
		// duerme veinte segundos
		try {
			this.t = (int) (Math.random() * 20000);
			sleep(t);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		parking.sale();
		System.out.println(getName() + " salio del parking");
	}

	@Override
	public String toString() {
		return "Coche [t=" + t + "]";
	}
	

}
