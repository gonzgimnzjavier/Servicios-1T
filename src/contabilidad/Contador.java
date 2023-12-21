package contabilidad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Contador {
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

	public static BufferedReader getBufferedReader(String nombreFichero) throws FileNotFoundException {
		FileReader lector = new FileReader(nombreFichero);
		BufferedReader bufferedReader = new BufferedReader(lector);
		return bufferedReader;
	}

//Para escrribir en un fichero
	public static PrintWriter getPrintWriter(String nombreFichero) throws IOException {
		PrintWriter printWriter;
		FileWriter fileWriter;

		fileWriter = new FileWriter(nombreFichero);
		printWriter = new PrintWriter(fileWriter);
		return printWriter;
	}

	public static void hacerCalculos(String fichEntrada, String fichSalida, String minimo) throws IOException {

		// 1 abrir el fichero infomatica.txt
		int minimoInt = Integer.parseInt(minimo);

		ArrayList<String> cantidades = getLineasFichero(fichEntrada);
		int res = 0;
		// 2 sumar las cantidades de dicho ficheros
		for (String s : cantidades) {
			int lineasInt = Integer.parseInt(s);
			if (lineasInt >= minimoInt) {
				res += Integer.parseInt(s);
			}
			// res += Integer.parseInt(s);
		}
		
		PrintWriter pw = getPrintWriter(fichSalida);
		pw.println(res);
		pw.close();
		System.out.println("El total de " + fichEntrada + " es: " + res + " $");
	}
	public static void main(String[] args) {

		//File file = new File("C:\\Users\\loygar\\eclipse-workspace\\PsP\\informatica.txt");
		System.out.println("Fichero de entrada"); // args[0]
		String fichEntrada = args[0];

		System.out.println("Fichero de salida");// args[1]
		String fichSal = args[1];
		try {
			hacerCalculos(fichEntrada, fichSal,args[2]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
