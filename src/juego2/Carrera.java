package juego2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Carrera {

    ArrayList<Atleta> finalistas;

    public Carrera(){
        this.finalistas = new ArrayList<>();
    }

    public Carrera(ArrayList<Atleta> f){
        this.finalistas = f;
    }

    public void inicializaCarrera(int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.println("Datos del atleta " + (i + 1) + ": ");
            System.out.println("Introduzca el nombre: ");
            sc.nextLine(); 
            String nombre = sc.nextLine();
            System.out.println("Introduzca el pais: ");
            String pais = sc.nextLine();
            System.out.println("Introduzca el dorsal: ");
            int dorsal = sc.nextInt();
            Atleta atleta = new Atleta(dorsal, nombre, pais);
            finalistas.add(atleta);
        }
    }

    public void correr() {
        System.out.println("listos...");
        ArrayList<Thread> threads = new ArrayList<>();
        for(Atleta atleta : finalistas){
            Thread t = new Thread(atleta);
            t.start();
            threads.add(t);
        }
        System.out.println("PUM...");
        for(Thread t : threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void mostrarClasificacion(){
        Collections.sort(finalistas);
		System.out.println("La clasificación es: ");
        for(Atleta a : finalistas){
            System.out.println(a);
        }
    }
}
