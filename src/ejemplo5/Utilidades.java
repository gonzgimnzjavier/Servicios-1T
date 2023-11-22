package ejemplo5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Utilidades {
    // Para leer de un fichero
	public static BufferedReader getBufferedReader(String archivo) throws FileNotFoundException {
	    return new BufferedReader(new FileReader("./src/ejemplo5/" + archivo));
	}


    // Para escribir en un fichero
    public static PrintWriter getPrintWriter(String nombreFichero) throws IOException {
        FileWriter fileWriter = new FileWriter(nombreFichero);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        return printWriter;
    }

    // Para obtener una lista dinámica de líneas (Strings) desde un fichero
    public static ArrayList<String> getLineasFichero(String nombreFichero) throws IOException {
        ArrayList<String> lineas = new ArrayList<String>();
        BufferedReader bfr = getBufferedReader(nombreFichero);

        // Leemos líneas del fichero...
        String linea = bfr.readLine();
        while (linea != null) {
            // Y las añadimos al array
            lineas.add(linea);
            linea = bfr.readLine();
        }

        // Cerramos el bufferedReader
        bfr.close();
        
        return lineas;
    }
}
