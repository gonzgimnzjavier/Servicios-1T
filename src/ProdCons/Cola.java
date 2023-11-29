package ProdCons;

public class Cola {

	private int numero;
	
	private boolean disponible = false;
	
	public synchronized int get() {
		if(disponible) {
			disponible = false;
			return numero;
			//hay numero en la cola, se pone cola vacia y se devuelve el numero		
		}
		return -1; //no hay numero disponible
	}
	
	public synchronized void put(int valor) {
		numero = valor; //coloca valor en la cola
		disponible = true;//disponible para consumir, cola llena
	}

	@Override
	public String toString() {
		return "Cola [numero=" + numero + ", disponible=" + disponible + "]";
	}
	
}
