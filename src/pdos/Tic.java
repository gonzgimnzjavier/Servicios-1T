package pdos;

public class Tic extends Thread {

    String tic;


    Tic(String tic) {
        this.tic = tic; 
    }

    
    public void run() {
        while (true) { 
            try {
                Thread.sleep(200);
                System.out.println(tic);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
                break;
            }
        }
    }
}
