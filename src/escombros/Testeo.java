package escombros;

import java.util.ArrayList;

public class Testeo {

    public static void main(String[] args) {
        Contenedor almacen = new Contenedor();

        ArrayList<Gestion> trabajadores = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            Gestion trabajador = new Gestion(almacen);
            trabajadores.add(trabajador);
        }

        for (Gestion trabajador : trabajadores) {
            try {
            	trabajador.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("La obra ha finalizado.");
    }
}
