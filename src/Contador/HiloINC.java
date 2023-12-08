package Contador;

public class HiloINC extends Thread {
    private Contador contador;

    public HiloINC(String n, Contador c) {
        setName(n);
        contador = c;
    }

    public void run() {
        System.out.println(getName() + " comenzando a incrementar.");
        for (int j = 0; j < 300; j++) {
            contador.incrementar(); // Incrementa el contador
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrumpido.");
            }
        }
        System.out.println(getName() + " contador vale " + contador.getValor());
    }
}