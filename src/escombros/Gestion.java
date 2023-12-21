package escombros;

import java.util.Random;

public class Gestion extends Thread {

	private int cantidadEscombros;
	private long tiempoEspera;
	public Contenedor almacen;

	public Gestion(Contenedor almacen) {
		this.cantidadEscombros = obtenerNumeroAleatorio(-5000, 5000);
		this.tiempoEspera = obtenerNumeroAleatorio(0, 20000);
		this.almacen = almacen;
		start();
	}

	static int obtenerNumeroAleatorio(int num1, int num2) {
	        Random random = new Random();
	        return random.nextInt(num2 - num1) + num1;
	}

	public void run() {
		try {
			sleep(tiempoEspera);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (cantidadEscombros >= 0) {
			System.out.println(toString());
			almacen.agregarEscombro(Math.abs(cantidadEscombros));
		} else {
			System.out.println(toString());
			almacen.sacarEscombro(Math.abs(cantidadEscombros));
		}

		System.out.println(getName() + " entra en la pausa");

		try {
			sleep(tiempoEspera);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "TrabajadorEscombros [cantidadEscombros=" + cantidadEscombros + ", tiempoEspera=" + tiempoEspera + "]";
	}
}
