package Banco;

public class sacarDinero extends Thread {

	private Cuenta c; // objeto compartido

	String nom;

	public sacarDinero(String n, Cuenta c) {
		super(n);

		this.c = c;

	}

	public void run() {
		for (int x = 1; x <= 4; x++) {
			c.retirarDinero(10, this.getName());
		}
	}

}
