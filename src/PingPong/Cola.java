package PingPong;

public class Cola {
    private String mensaje;
    private boolean disponible = false;
    private String ultimoMensaje = "";

    public synchronized String get() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        disponible = false;
        ultimoMensaje = mensaje;  
        notifyAll();
        return mensaje;
    }

    public synchronized void poner(String valor) {
        while (disponible || valor.equals(ultimoMensaje)) { 
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        mensaje = valor;
        disponible = true;
        notifyAll();
    }
}
