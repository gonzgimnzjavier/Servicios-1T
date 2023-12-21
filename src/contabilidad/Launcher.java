package contabilidad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] fichiEnt = { "amarillo.txt", "azul.txt", "rojo.txt", "verde.txt" };
		String[] fichiSal = { "Tamarillo.txt", "Tazul.txt", "Trojo.txt", "Tverde.txt" };
		String[] fichiErr = { "Eamarillo.txt", "Eazul.txt", "Erojo.txt", "Everde.txt", };

		String path = System.getProperty("user.dir");
		String ruta = "\\src\\contabilidad\\";
		System.out.println(path + ruta);
		Scanner manolito = new Scanner(System.in);
		System.out.println("Introduce el numero de corte ");
		int numeroDeCorte = manolito.nextInt();

		/*
		 * ProcessBuilder pb ; pb= new ProcessBuilder("java",path+ruta+
		 * "Calculadora.java", "informatica.txt", "Tinformatica.txt");
		 * pb.redirectError(new File("Errhh.txt"));
		 */
		for (int i = 0; i < fichiEnt.length; i++) {
			ProcessBuilder pb;
			pb = new ProcessBuilder("java", path + ruta + "Contador.java", fichiEnt[i], fichiSal[i], numeroDeCorte+"");
			pb.redirectError(new File("Error" + fichiEnt[i]));
			try {
				pb.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// ponemos el hilo principal a la espera
		// para que le de tiempo a crear los ficheros de resultado antes de escribir en
		// ellos
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int parcial = 0;
		int total = 0;
		for (int i = 0; i < fichiEnt.length; i++) {
			try {

				BufferedReader br = Contador.getBufferedReader(fichiSal[i]);
				parcial = Integer.parseInt(br.readLine());
				total += parcial;
				System.out.println("gastos " + fichiEnt[i] + ": " + parcial + ": " + total);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (NumberFormatException a) {
				a.printStackTrace();
			} catch (IOException a) {
				a.printStackTrace();
			}
		}
		System.out.println("suma total " + total);
		System.out.println("Guardando en contabilidad.txt");

		try {
			PrintWriter pw = Contador.getPrintWriter("contabilidad.txt");
			pw.println(String.valueOf(total));
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		manolito.close();
	}

}
