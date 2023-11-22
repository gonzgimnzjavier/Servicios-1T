package ejemplo4;

public class Sumador {
	public static int sumar(int n1, int n2) {
		int suma = 0;
		if (n1 > n2) {
			int aux = n1;
			n1 = n2;
			n2 = aux;

		}
		for (int i = n1; i <= n2; i++) {
			suma = suma + i;

		}
		return suma;

	}

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int suma = sumar(n1, n2);

		System.out.println(suma);
		System.out.flush();

	}
}
