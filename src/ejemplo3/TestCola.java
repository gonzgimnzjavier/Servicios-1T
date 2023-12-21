package ejemplo3;

public class TestCola {

	public static void main(String[] args) {
		Cola cola = new Cola();
		Productor p = new Productor(cola, "Productor");
		Consumidor c = new Consumidor(cola, "Consumidor");
		p.start();
		c.start();
	}

}
