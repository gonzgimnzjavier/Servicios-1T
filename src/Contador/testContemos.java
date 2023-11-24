package Contador;

public class testContemos {
    public static void main(String[] args) {
        Contador cont = new Contador(0); 
        HiloINC a = new HiloINC("HiloINC", cont);
        HiloDEC b = new HiloDEC("HiloDEC", cont);
        a.start();
        b.start();
    }
}