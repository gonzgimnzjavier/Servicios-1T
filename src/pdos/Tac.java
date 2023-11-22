package pdos;

public class Tac extends Thread{

	String tac;
	Tac(String tac){
		this.tac=tac;
		}
	public void run(){
		while(true){
			
			try {
				Thread.sleep(200);
				System.out.println(tac);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
			
		}
	}
}
