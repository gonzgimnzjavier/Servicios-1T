package prouno;

public class LanzadorProcesos {
	public void ejecutar(String ruta) {

		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder(ruta);
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//String ruta = "C:\\Program Files (x86)\\Adobe\\Reader11.0\\Reader\\AcroRd32.exe";
		String ruta = "C:\\\\Windows\\\\System32\\\\mspaint.exe";
		LanzadorProcesos lp = new LanzadorProcesos();
		lp.ejecutar(ruta);
		System.out.println("Finalizado");
	}
}
