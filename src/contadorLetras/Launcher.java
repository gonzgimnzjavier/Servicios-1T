package contadorLetras;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Launcher {

	public static ArrayList<Integer> obtenerResultados(ArrayList<String> letras) {
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		BufferedReader b = null;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < letras.size(); i++) {

			try {
				b = new BufferedReader(new FileReader(letras.get(i) + ".txt"));
				resultados.add(Integer.parseInt(b.readLine()));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultados;

	}

	public static void main(String[] args) {

		String ficheroDeEntrada = "textoA.txt";
		String path = System.getProperty("user.dir");
		String ruta = "\\src\\contadorLetras\\ContadorLetras.java";
		System.out.println(path + ruta);

		ArrayList<String> letras = new ArrayList<String>();
		letras.add("a");
		letras.add("b");
		letras.add("c");
		letras.add("d");
		letras.add("e");

		for (int i = 0; i < letras.size(); i++) {
			String ficheroErrores = letras.get(i) + "Error.txt";
			ProcessBuilder p = new ProcessBuilder("java", path + ruta, ficheroDeEntrada, letras.get(i),
					letras.get(i) + ".txt");
			p.redirectError(new File(ficheroErrores));
			try {
				p.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		ArrayList<Integer> resultados = obtenerResultados(letras);
		int sumatotal = 0;
		String resultadoFinal = "";
		for (int i = 0; i < resultados.size(); i++) {
			resultadoFinal += "la cantidad de letras " + letras.get(i) + " es de " + resultados.get(i) + "\n";
			sumatotal += resultados.get(i);
		}
		resultadoFinal += "la cantidad total es " + sumatotal;
		try {
			
			//IMPORTANTE!!!!!!
			//tarda unos segundos e crear el fichero y mostrarlo !!!!!!!
			
			BufferedWriter b = new BufferedWriter(new FileWriter("ResultadoA.txt"));
			System.out.println(resultadoFinal);
			b.write(resultadoFinal);
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
