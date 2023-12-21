package ejemplo3;

public class SacarDinero extends Thread {

	private Cuenta c;
	String nombre ;
	
	public SacarDinero(String n , Cuenta c) {
		super(n);
		this.c=c;
		
	}
	public void run() {
		for (int i = 0; i <=4; i++) {
			c.retirarDinero(10,this.getName());
		}
	}
}
