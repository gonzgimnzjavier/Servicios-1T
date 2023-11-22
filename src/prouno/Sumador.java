package prouno;

public class Sumador {

	public int sumar(int n1, int n2) {
		int resultado = 0;
		for (int i = n1; i <= n2; i++) {
			resultado += i;
		}
		return resultado;

	}

	public static void main(String[] args) {

		Sumador s = new Sumador();

		int numero1 = Integer.parseInt(args[0]);
		int numero2 = Integer.parseInt(args[1]);

		System.out.println("la suma entre " + numero1 + " y " + numero2 + " da: " + s.sumar(numero1, numero2));
	}
}
