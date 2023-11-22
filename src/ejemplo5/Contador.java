package ejemplo5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Contador {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Por favor, especifica una consonante como argumento.");
            return;
        }

        String consonante = args[0];
        int count = 0;
        ArrayList<String> lineas = Utilidades.getLineasFichero("himno.txt"); // Ruta del archivo de entrada

        for (String linea : lineas) {
            for (char caracter : linea.toLowerCase().toCharArray()) {
                if (caracter == consonante.charAt(0)) {
                    count++;
                }
            }
        }

        try (PrintWriter writer = Utilidades.getPrintWriter(consonante + ".txt")) {
            writer.println(count);
        }
    }
}
