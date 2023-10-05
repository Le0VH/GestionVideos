package org.example;

public class Usuarios implements IUsuarios{
    private String id;
    private String contraseña;
    public String nombre;
    public String tipousuario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    public Usuarios(String id, String contraseña, String nombre, String tipousuario) {
        this.id = id;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.tipousuario = tipousuario;
    }

    @Override
    public void retroceder() {
        System.out.println("Video Anterior.");
    }

    @Override
    public void avanzar() {
        System.out.println("Siguiente Video.");
    }

    @Override
    public void detener() {
        System.out.println("Video Detenido.");
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo Video.");
    }
}
