package ejemplo6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Launcher {

	// hay que lanzar calculadoras para cada fichero
	public static void main(String[] args) {
		
		String[] fichiEnt = {"informatica.txt","gerenecia.txt","rrhh.txt","contabilidad.txt","comercio.txt"};
		String[] fichiSal = {"Tinformatica.txt","Tgerenecia.txt","Trrhh.txt","Tcontabilidad.txt","Tcomercio.txt"};
		String[] fichiErr = {"Einformatica.txt","Egerenecia.txt","Errhh.txt","Econtabilidad.txt","Ecomercio.txt"};
		
		String path=System.getProperty("user.dir");
		String ruta=path+"\\src\\ejemplo6\\";
		ProcessBuilder pb;
		pb=new ProcessBuilder("java",path+ruta+"Calculadora.java","rrhh.txt","Trrhh.txt","Tinformatica.txt");
		
		pb.redirectError(new File("Errhh.txt"));
		try {
			pb.start();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//QUIERO RECUPERAR LOS TOTALES DE CADA FICHERO MOSTRANDOLO POR PANTALLA
		//Y GUARDAR LOS GASTOS EN TOTALGASTOS.TXT
		for (int i=0;i<fichiEnt.length;i++) {
			try {
				BufferedReader br = Calculadora.getBufferedReader(fichiSal[i]);
				int total= Integer.parseInt(br.readLine());
				System.out.println("gastos "+fichiEnt[i]+": "+total);
				int parcial=0;
				total+=parcial;
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		char[] total = {'a','b','c','d','e'};
		System.out.println("gastos tottales: "+total);
		System.out.println("guardando en totalgastos.txt");
		
		try {
			PrintWriter pw = Calculadora.getPrintWriter("totalgastos.txt");
			pw.append(String.valueOf(total));
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		
	}
}
