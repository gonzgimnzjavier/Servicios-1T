package pdos;

public class testTicTac {

	public static void main(String[] args) {
		
		System.out.println("prueba de tic tac");
		
		Tic tic = new Tic("Tic.......");
		Tac tac = new Tac("Tac......");
		
		tic.start();
		try {
			tic.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tac.start();
		try {
			tac.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("soy el main...");
	}
}
