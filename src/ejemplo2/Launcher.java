package ejemplo2;

public class Launcher {
	public void lanzarSumador(Integer n1, Integer n2, String string) {
		String clase = "prouno.Sumador";
		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder("java", clase, n1.toString(), n2.toString());
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Launcher launcher = new Launcher();
		
		launcher.lanzarSumador(1, 10, null);
		launcher.lanzarSumador(11, 20, null);
		
		System.out.println("fin de main");
	}
}