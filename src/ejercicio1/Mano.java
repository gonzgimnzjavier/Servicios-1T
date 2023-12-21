package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Mano {
    private ArrayList<Carta> cartas = new ArrayList<>();

    public void agregarCarta(Carta carta) {
        if (cartas.size() < 5 && !cartas.contains(carta)) {
            cartas.add(carta);
        }
    }

    public int getPuntuacionTotal() {
        int total = 0;
        for (Carta carta : cartas) {
            total += carta.getPuntuacion();
        }
        return total;
    }

    @Override
    public String toString() {
        Collections.sort(cartas);
        return cartas.toString();
    }
}
