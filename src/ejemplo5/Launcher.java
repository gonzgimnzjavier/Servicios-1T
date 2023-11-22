package ejemplo5;

import java.io.IOException;
import java.util.ArrayList;

public class Launcher {

    public static void main(String[] args) throws IOException, InterruptedException {
        String[] consonantes = { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z" };

        ArrayList<String> resultados = new ArrayList<String>();

        for (String consonante : consonantes) {
            ProcessBuilder pb = new ProcessBuilder("java", "-cp", ".", "ejemplo5.Contador", consonante);
            Process process = pb.start();
            process.waitFor(); // Espera a que el proceso termine.

            resultados.add("El número de : " + consonante + " es: " + Utilidades.getLineasFichero(consonante + ".txt").get(0));
        }

        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}
