package ejercicio1;

import java.util.ArrayList;

public class Juego {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            jugadores.add(new Jugador());
            for (int j = 0; j < 5; j++) {
                jugadores.get(i).getMano().agregarCarta(new Carta());
            }
        }

        // Determinar el ganador
        Jugador ganador = null;
        int maxPuntuacion = 0;
        for (Jugador jugador : jugadores) {
            int puntuacion = jugador.getMano().getPuntuacionTotal();
            System.out.println("Jugador con mano " + jugador.getMano() + " tiene puntuación: " + puntuacion);
            if (puntuacion > maxPuntuacion) {
                maxPuntuacion = puntuacion;
                ganador = jugador;
            }
        }

        System.out.println("El ganador es el jugador con mano " + ganador.getMano() + ", con puntuación de: " + maxPuntuacion);
    }
}
