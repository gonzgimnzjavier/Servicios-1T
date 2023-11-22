package pdos;

public class SegundoHilo extends Thread{

	int c;
	int hilo;
	
	SegundoHilo(int hilo){
		this.hilo=hilo;
		System.out.println("CREANDO HILO "+ hilo);
	}
	
	public void run() {
		c=0;
		
		while(c<=5) {
			System.out.println("hilo "+hilo+" contador "+c);
			c++;
		}
	}
}
