package ProdCons;

public class testCola {

	public static void main(String[] args) {

		Cola cola = new Cola();
		Productor p = new Productor(cola, 11);
		Consumidor c = new Consumidor(cola, -55);
		p.start();
		c.start();
	}
}
