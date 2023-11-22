package juego1;

import java.util.Collections;
import java.util.List;

public class Partida {

	List <Tirada> jugadores;
	
	Partida(List<Tirada> j){
		this.jugadores=j;
	}
	
	//metodo para inicializar
	
	//metodo para ordenar los jugadores por puntos
	public void resultadoPuntos(){
		Collections.sort(jugadores);
	}
	
	public List<Tirada> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Tirada> jugadores) {
		this.jugadores = jugadores;
	}

	public void verMarcador(){
		resultadoPuntos();
		System.out.println("\n MARCADOR FINAL\n");
		for (Tirada tirada : jugadores) {
			System.out.println(tirada.toString());
		}
	}
}
