package contadorLetras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ContadorLetras {
	public static BufferedReader getBufferedReader(String nombreFichero) throws FileNotFoundException {
		FileReader lector;
		lector = new FileReader(nombreFichero);
		BufferedReader bufferedReader;
		bufferedReader = new BufferedReader(lector);
		return bufferedReader;
	}

	public static PrintWriter getPrintWriter(String nombreFichero) throws IOException {
		PrintWriter printWriter;
		FileWriter fileWriter;
		fileWriter = new FileWriter(nombreFichero);
		printWriter = new PrintWriter(fileWriter);
		return printWriter;
	}

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
		// Fin del bucle que lee líneas
		return lineas;
	}

	public static void contarLetra(String archivoEntrada, String letra, String archivoSalida) {

		try {
			BufferedReader b = getBufferedReader(archivoEntrada);
			PrintWriter p = getPrintWriter(archivoSalida);
			String linea = b.readLine();
			int contador = 0;
			while (linea != null) {
				for (int i = 0; i < linea.length(); i++) {
					if ((linea.charAt(i)+"").equalsIgnoreCase(letra)) {
						contador++;
					}
				}
				linea = b.readLine();
			}
			Thread.sleep(1000);
			p.println(contador);
			p.flush();
			p.close();
			b.close();
		

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String archivoEntrada, letra, archivoSalida;
		// lol
		archivoEntrada = args[0];
		letra = args[1];
		archivoSalida = args[2];
		contarLetra(archivoEntrada, letra, archivoSalida);

	}

}
