package juego2;

import java.util.Scanner;

public class testCarrera {

    public static void main(String[] args) {

        Carrera japon = new Carrera();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de atletas:");
        int numAtletas = sc.nextInt();
        japon.inicializaCarrera(numAtletas);
        japon.correr();

        try {
            Thread.sleep(15000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        japon.mostrarClasificacion();
        System.out.println("Fin de la carrera");

        sc.close();
    }
}
