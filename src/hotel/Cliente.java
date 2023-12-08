package hotel;

public class Cliente  extends Thread {


	private hotel hotel;

	public Cliente (String numero, hotel p) {
		super(numero);
		this.hotel = p;
		start();
	}
	
	public void run() {
		while (true) {//se puede quitar y la simulacion es finita en el tiempo
			try {//tiempo aleatorio para que no todos entren a la vez
				sleep((int) (Math.random() * 10000));
			} catch (InterruptedException e) {
			}
			hotel.entra();//este metodo sera syncro
			System.out.println(getName() + " entro al hotel");
			try {//simula de estancia
				sleep((int) (Math.random() * 20000));
			}catch (InterruptedException e) {
				
			}
			hotel.sale();//metodo syncro
			System.out.println(getName() + " salio del hotel");
		}
	}
}
