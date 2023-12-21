package ejemplo3;

public class test {
	public static void main(String[] args) {
		System.out.println("sacando dinero");
		Cuenta c = new Cuenta(40);
		
		SacarDinero s1 = new SacarDinero("persona2", c);
		SacarDinero s2 = new SacarDinero("persona2", c);
		s1.start();
		s2.start();
		System.out.println("fin del main");
	}
}
