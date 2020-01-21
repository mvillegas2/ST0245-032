package taller1;

public class Contador {
    private int numContador = 0;
    private String nombreContador;

    public Contador(String nombreContador) {
        this.nombreContador = nombreContador;
    }

    public String getNombreContador() {
        return nombreContador;
    }

    public void incrementar() {
        numContador++;
    }

    public int incrementos() {
        return numContador;
    }

    public String toString(){
        return Integer.toString(numContador);
    }
}
