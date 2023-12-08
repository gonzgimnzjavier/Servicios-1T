package Contador;

public class HiloDEC extends Thread {
    private Contador contador;

    public HiloDEC(String n, Contador c) {
        setName(n);
        contador = c;
    }

    public void run() {
        System.out.println(getName() + " comenzando a decrementar.");
        for (int j = 0; j < 300; j++) {
            contador.decrementar(); // Decrementa el contador
            try {
                sleep(150);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrumpido.");
            }
        }
        System.out.println(getName() + " contador vale " + contador.getValor());
    }
}