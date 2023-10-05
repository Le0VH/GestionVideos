package org.example;

public class Videos {
    private String ID;
    public String duracion;
    public String resolucion;
    public String titulo;
    public String descripcion;

    public int likes;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Videos(String duracion, String resolucion, String titulo, String descripcion) {
        this.duracion = duracion;
        this.resolucion = resolucion;
        this.titulo = titulo;
        this.descripcion = descripcion;


    }
}
