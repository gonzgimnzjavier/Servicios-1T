package juego2;

public class testAtleta {

	public static void main(String[] args) {

		Atleta atleta;

		for (int i = 0; i < 35; i++) {
			atleta = new Atleta(i + 1, "gicho " + i, "pais " + i);
			new Thread(atleta).start();
			//atleta.run();
		}
	}
}
