package pdos;

public class PrimerHilo extends Thread{

	int x;
	
	PrimerHilo(int x){
		
		System.out.println("estoy creando un hilo...");
		this.x=x;
	}
	
	public void run(){
		for(int i=0; i<x; i++)
			System.out.println("Me imprimo por vez: "+i);
	}
}
