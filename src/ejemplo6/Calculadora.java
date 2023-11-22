package ejemplo6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {

	public static void hacerCalculos(String fichEntrada, String fichSalida) throws IOException {
		int suma = 0;

		// 1. Abrir el archivo informatica.txt
		ArrayList<String> cantidades = getLineasFichero(fichEntrada);

		// 2. Sumar las cantidades de dicho archivo
		for (String s : cantidades) {
			try {
				suma += Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.println("Formato de número no válido en la línea: " + s);
			}
		}

		// Mostrar el total de gastos
		System.out.println("El total de gastos de: " + fichEntrada + " es: " + suma + "€");

		// 3. Guardar el resultado numérico en un archivo
		try (PrintWriter pw = getPrintWriter(fichSalida)) {
			pw.println(suma);
			pw.close();
		}
	}

	public static void main(String[] args) {
		try (Scanner jaime = new Scanner(System.in)) {
			System.out.println("fichero de entrada: ");
			String ent = jaime.nextLine();
			System.out.println("fichero de salida: ");
			String sal = jaime.nextLine();

			try {
				hacerCalculos(ent, sal);
			} catch (IOException e) {
				System.out.println("Ha ocurrido un error al procesar los archivos.");
				e.printStackTrace();
			}
		}
	}

	// Para leer de un fichero
	public static BufferedReader getBufferedReader(String archivo) throws FileNotFoundException {
		return new BufferedReader(new FileReader("./src/ejemplo5/" + archivo));
	}

	// Para escribir en un fichero
	public static PrintWriter getPrintWriter(String nombreFichero) throws IOException {
		FileWriter fileWriter = new FileWriter("./src/ejemplo5/" + nombreFichero);
		return new PrintWriter(fileWriter);
	}

	// Para obtener una lista dinámica de líneas (Strings) desde un fichero
	public static ArrayList<String> getLineasFichero(String nombreFichero) throws IOException {
		ArrayList<String> lineas = new ArrayList<>();
		try (BufferedReader bfr = getBufferedReader(nombreFichero)) {
			// Leemos líneas del fichero...
			String linea = bfr.readLine();
			while (linea != null) {
				// Y las añadimos al array
				lineas.add(linea);
				linea = bfr.readLine();
			}
		}
		return lineas;
	}
}
