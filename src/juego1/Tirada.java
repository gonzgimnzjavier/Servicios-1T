package juego1;

public class Tirada extends Thread implements Comparable {

	String nombre;

	int puntos;

	Tirada(String n) {
		this.nombre = n;
	}

	public void run() {
		Dado d;
		for (int i = 0; i < 2; i++) {
			d = new Dado();
			d.start();
			System.out.println(d.toString());
			puntos += d.getRes();
		}
		System.out.println("MARCADOR: " + puntos);

	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	@Override
	public String toString() {
		return "Tirada [nombre=" + nombre + ", puntos=" + puntos + "]";
	}

	public int compareTo(Object o) {
		Tirada t = (Tirada) o;
		/*
		 * // if the string are not equal if (this.puntos > t.puntos) { return
		 * this.puntos - t.puntos; } else if (this.puntos < t.puntos) { return t.puntos
		 * - this.puntos;
		 * 
		 * } else { return 0;
		 */
		return this.puntos - t.puntos;
	}
}
