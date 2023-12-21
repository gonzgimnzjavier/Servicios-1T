package ejemplo3;

public class Cuenta {
	private int saldo;

	Cuenta(int i) {
		saldo = i;
	}

	int getSaldo() {
		return saldo;
	}

	void restar(int cantidad) {
		saldo -= cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}
	synchronized void retirarDinero(int cant, String nom) {
		if(getSaldo()>=cant) {
			System.out.println("Se va a retirar saldo "+getSaldo());
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
			restar(cant);
			System.out.println(nom+" retira => "+cant+" Acttual "+getSaldo());
			// TODO: handle exception
		}
		else {
			System.out.println(nom+" no puede returar dinero no hay saldo "+getSaldo());
		}if(getSaldo()<0) {
			System.out.println("saldo negativo"+getSaldo());
		}
		
	}

}
