package Banco;

public class testCuenta {

	public static void main(String[] args) {
		System.out.println("sacando dinero");
		Cuenta c= new Cuenta(40);
		
		sacarDinero s1 = new sacarDinero("Yowi", c);
		sacarDinero s2 = new sacarDinero("Machupichu", c);
		sacarDinero s3 = new sacarDinero("MenorDeEdad", c);
		s1.start();
		s2.start();
		
		System.out.println("fin main");
	}
}
