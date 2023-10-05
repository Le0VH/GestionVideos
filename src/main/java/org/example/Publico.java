package org.example;

public class Publico extends Usuarios{
    public Publico(String id, String contraseña, String nombre, String tipousuario) {
        super(id, contraseña, nombre, tipousuario);
    }
    @Override
    public void avanzar() {
        super.avanzar();
    }

    @Override
    public void detener() {
        super.detener();
    }

    @Override
    public void reproducir() {
        super.reproducir();
    }

    @Override
    public void retroceder() {
        super.retroceder();
    }
}
