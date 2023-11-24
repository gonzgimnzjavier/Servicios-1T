package Contador;

public class HiloDEC extends Thread {
    private Contador contador;

    public HiloDEC(String n, Contador c) {
        setName(n);
        contador = c;
    }

    public void run() {
		synchronized (contador) {
			
		
        for (int j = 0; j < 300; j++) {
            contador.decrementar(); // Decrementa el contador
            try {
                sleep(150);
            } catch (InterruptedException e) {}
        }
		}
        System.out.println(getName() + " contador vale " + contador.getValor());
    }
}