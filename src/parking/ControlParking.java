package parking;

import java.util.ArrayList;

public class ControlParking {

	public static void main(String[] args) {

		ArrayList<Coche> automoto = new ArrayList<>();
		
		Parking park1 = new Parking(10);
		for (int i = 0; i < 50; i++) {
			Coche c = new Coche("Coche " + i, park1);
			automoto.add(c);
			
		}
		
		for (Coche co : automoto) {
			try {
				co.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("aqui podria sacar lo que pagan coches");
			for (Coche c : automoto) {
				System.out.println(c);
			}
		}

		//En funcion del numero segundos pagas una cantidad hacer con un metodo y una lista de coches cada coche tendria su tiempo y pagarian en funcion de ese
		//como meterle una variable de tiempo 
	}
}
