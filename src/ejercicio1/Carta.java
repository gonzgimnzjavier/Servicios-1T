package ejercicio1;

import java.util.Objects;

public class Carta implements Comparable<Carta> {
    private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private static String[] p = {"bastos", "copas", "espadas", "oros"};

    private Integer numero;
    private String palo;

    public Carta() {
        this.numero = (int) (Math.random() * 10);
        this.palo = p[(int) (Math.random() * 4)];
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getPuntuacion() {
        switch (numero) {
            case 9: return 12; // rey
            case 8: return 11; // caballo
            case 7: return 10; // sota
            default: return numero + 1; // as=1, dos=2, ..., siete=7
        }
    }

    @Override
    public String toString() {
        return n[numero] + " de " + palo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carta carta = (Carta) obj;
        return Objects.equals(numero, carta.numero) && Objects.equals(palo, carta.palo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, palo);
    }

    @Override
    public int compareTo(Carta c) {
        if (palo.equals(c.getPalo())) {
            return numero.compareTo(c.getNumero());
        } else {
            return palo.compareTo(c.getPalo());
        }
    }
}
