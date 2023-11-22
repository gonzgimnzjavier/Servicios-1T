package pbuild.src.ejemplo7T.PsP.src.Ejemplo6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Launcher {
//Hay que lanzar caculadoras para cada fichero
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] fichiEnt = { "informatica.txt", "comercio.txt", "gerencia.txt", "rrhh.txt", "contabilidad.txt" };
		String[] fichiSal = { "Tinformatica.txt", "Tcomercio.txt", "Tgerencia.txt", "Trrhh.txt", "Tcontabilidad.txt" };
		String[] fichiErr = { "Einformatica.txt", "Ecomercio.txt", "Egerencia.txt", "Errhh.txt", "Econtabilidad.txt" };

	

		String path = System.getProperty("user.dir");
		String ruta="\\src\\Ejemplo6\\";
		System.out.println(path+ruta);
		https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=5630287
/*		ProcessBuilder pb ;
			pb= new ProcessBuilder("java",path+ruta+ "Calculadora.java", "informatica.txt",	 "Tinformatica.txt");
			pb.redirectError(new File("Errhh.txt"));
	*/		 
		for(int i=0; i<fichiEnt.length; i++) { 
			ProcessBuilder pb ;
			pb= new ProcessBuilder("java",path+ruta+ "Calculadora.java", fichiEnt[i], fichiSal[i]); 
			pb.redirectError(new File("Error"+fichiEnt[i]));
			try {
				pb.start();
			}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	int parcial =0;
	int total=0;
	// necesito tiempo para leer los ficheros de resultados
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		for(int i=0; i<fichiEnt.length; i++) {
			try {
				BufferedReader br = Calculadora.getBufferedReader(fichiSal[i]);
				 parcial = Integer.parseInt(br.readLine());
				total+=parcial;
				 System.out.println("gastos "+fichiEnt[i]+": "+parcial+": "+total );
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(NumberFormatException a) {
				a.printStackTrace();
			}catch(IOException a) {
				a.printStackTrace();
			}
		}
	System.out.println("gastos totales"+total);
	System.out.println("Guardando en totaltes.txt");
	try {
		PrintWriter pw = Calculadora.getPrintWriter("gastostotales.txt");
		pw.println(String.valueOf(total));
		pw.close();
	}catch (Exception e) {
		// TODO: handle exception
	}
	}

	
}
