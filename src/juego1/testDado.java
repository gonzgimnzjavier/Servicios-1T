package juego1;

public class testDado {
	public static void main(String[] args) {

		Dado d;
		int marcador=0;
		for(int i=0;i<2;i++) {
		d = new Dado();
		d.start();
		System.out.println(d.toString());
		marcador+=d.getRes();
		}
		System.out.println("MARCADOR: "+marcador);
		
	}

}
