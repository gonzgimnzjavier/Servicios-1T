package PingPong;

public class Productor extends Thread {
    private Cola cola;

    public Productor(Cola c) {
        cola = c;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            String mensaje;
            if (i % 2 == 0) {
                mensaje = "PING";
            } else {
                mensaje = "PONG";
            }
            cola.poner(mensaje);

            try {
                sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
