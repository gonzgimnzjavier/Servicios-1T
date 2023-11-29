package Banco;

public class Cuenta {
	private int saldo;
	Cuenta(int s) {
		saldo = s;
	} // inicializa saldo actual
	int getSaldo() {
		return saldo;
	} // devuelve el saldo
	void restar(int cantidad) { 
		// se resta la cantidad al saldo
		saldo = saldo - cantidad;
	}
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}
	
	//SOLO SINCRONIZO EL METODO "PELIGROSO" de Cuenta
	synchronized void retirarDinero(int cant, String nom) {
		if (getSaldo() >= cant) { 
		System.out.println("SE VA A RETIRAR SALDO (ACTUAL ES: " +getSaldo()+ ")" );
		try {
			Thread.sleep (1500);
		} catch (InterruptedException ex) {}
		restar (cant);
		System.out.println(nom+" retira => " + cant + " ACTUAL ("+ getSaldo() +")" );
		} 
		else {
		System.out.println(nom+" No puede retirar dinero, NO HAY SALDO("+getSaldo()+")" );
		}
		if (getSaldo() < 0) {
		System.out.println ("SALDO NEGATIVO => " + getSaldo());
		}
	}//fin retirar saldo
		 
	
	
	
}