package juego1;

import java.util.Random;

public class Dado extends Thread{

	private int res;
	
	Dado(){
		this.res=aleatorio();
	}
	
	public static int aleatorio() {
		Random r = new Random();
		return r.nextInt(6)+1;
	} 
	
	public void run() {
		System.out.println(res);
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	@Override
	public String toString() {
		return "Dado [res=" + res + "]";
	}
	
}
