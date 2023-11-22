package juego2;

import java.util.Random;

public class Atleta implements Runnable, Comparable<Atleta>{

	int dorsal;
	String nombre;
	double tiempo;
	String pais;

	Atleta() {
	}

	Atleta(int dorsal, String nombre, String pais) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.pais = pais;
	}

	@Override
	
	public void run() {
	    System.out.println(this.nombre + " preparado");
	    long inicio = System.currentTimeMillis();
	    Random r = new Random();
	    tiempo = r.nextDouble() * (12000 - 8000) + 8000; 
	    try {
	        Thread.sleep((long) tiempo);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    long fin = System.currentTimeMillis();
	    this.tiempo = (fin - inicio) / 1000.0; 
	    System.out.println(this.nombre + " llegando");
	    System.out.println(toString());
	}


	@Override
	public String toString() {
		return "Atleta [dorsal=" + dorsal + ", nombre=" + nombre + ", tiempo=" + tiempo + ", pais=" + pais + "]";
	}
	
	@Override
    public int compareTo(Atleta otroAtleta) {
        return Double.compare(this.tiempo, otroAtleta.tiempo);
    }

	

}
