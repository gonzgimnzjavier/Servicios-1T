package ejemplo3;

import java.io.File;

import ejemplo2.Launcher;

public class Lanzador {
	//nuevo parametro en este modo --> fichero de almacenamiento para el resultado
	public void lanzarSumador(Integer n1, Integer n2, String fichResultado) {
		//METODO NO MUY
		String clase = "C:\\Users\\javig\\eclipse-workspace\\pbuild\\src\\ejemplo3\\Sumador.java";
		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder("java", clase, n1.toString(), n2.toString());
			//gobierno la salida y el error
			pb.redirectError(new File("errores.txt"));
			pb.redirectOutput(new File(fichResultado));
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Launcher launcher = new Launcher();
		launcher.lanzarSumador(1, 10, "suma1.txt");
		launcher.lanzarSumador(11, 20,"suma2.txt");
		System.out.println("chao");
	}
}
