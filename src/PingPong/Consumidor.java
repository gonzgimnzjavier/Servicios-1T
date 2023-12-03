package PingPong;

public class Consumidor extends Thread {
    private Cola cola;

    public Consumidor(Cola c) {
        cola = c;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            String mensaje = cola.get();
            System.out.println(mensaje);

            try {
                sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}
