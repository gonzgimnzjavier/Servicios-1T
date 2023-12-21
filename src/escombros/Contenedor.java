package escombros;



public class Contenedor {

    private final int LIMITE_MAXIMO = 5000;
    private int cantidadActual;
    
    public Contenedor() {
        this.cantidadActual = 0; // Inicializa la cantidad actual a 0
    }

    public Contenedor(int cantidadInicial) {
        this.cantidadActual = cantidadInicial;
    }

    public synchronized void agregarEscombro(int kilos) {
        while (cantidadActual + kilos > LIMITE_MAXIMO) {
            try {
                System.out.println("Almacén lleno, esperando a que se libere espacio");
                System.out.println("Cantidad actual en el almacén: " + cantidadActual);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cantidadActual += kilos;
        notifyAll();
        System.out.println("Cantidad actual en el almacén: " + cantidadActual);
    }

    public synchronized void sacarEscombro(int kilos) {
        while (cantidadActual - kilos < 0) {
            try {
                System.out.println("No puedes sacar esa cantidad del almacén, esperando...");
                System.out.println("Cantidad actual en el almacén: " + cantidadActual);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cantidadActual -= kilos;
        notifyAll();
        System.out.println("Cantidad actual en el almacén: " + cantidadActual);
    }
}
