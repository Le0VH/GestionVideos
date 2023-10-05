package org.example;

public class Reels extends Videos{

    public int compartido;

    public int getCompartido() {
        return compartido;
    }

    public void setCompartido(int compartido) {
        this.compartido = compartido;
    }

    public Reels(String duracion, String resolucion, String titulo, String descripcion) {
        super(duracion, resolucion, titulo, descripcion);
        this.compartido = compartido;

    }
}
