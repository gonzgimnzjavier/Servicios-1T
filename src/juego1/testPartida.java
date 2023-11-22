package juego1;

import java.util.ArrayList;
import java.util.List;

public class testPartida {
	
	public static void main(String[] args) {
	
		List <Tirada> players = new ArrayList<Tirada>();
		//inicializacion de partido
		for(int i=0; i<5; i++) {
			Tirada t = new Tirada(String.valueOf(i));
			players.add(t);
		}
		Partida partida = new Partida(players);
		
		//jugar la partida
		for(Tirada tirada : partida.getJugadores()) {
			tirada.start();
		}
		try {
			for(Tirada tirada : partida.getJugadores()) {
				tirada.join();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		partida.verMarcador();
	}

}
