package org.example;
import java.util.ArrayList;
import java.util.List;
import org.example.IUsuarios;

public class Administrador extends Usuarios {
    private List<VideoLargo> BDV;
    private List<Reels> BDR;

    public Administrador(String id, String contraseña, String nombre, String tipousuario) {
        super(id, contraseña, nombre, tipousuario);
        BDV = new ArrayList<>();
        BDR = new ArrayList<>();

    }

    public void agregarvideo(VideoLargo video) {
        BDV.add(video);
        System.out.println("Video agregado: " + video.getTitulo());

    }

    public void eliminarvideo(VideoLargo video) {
        BDV.remove(video);
        System.out.println("Video eliminado: " + video.getTitulo());
    }

    public void agregarreel(Reels reel) {
        BDR.add(reel);
        System.out.println("Reel agregado: " + reel.getTitulo());

    }

    public void eliminarreel(Reels reel) {
        BDR.remove(reel);
        System.out.println("Reel eliminado: " + reel.getTitulo());
    }

    public void verBDvideos() {
        System.out.println("Listado de videos: ");
        for (int i = 0; i < BDV.size(); i++) {
            System.out.println("prueba: " + BDV.get(i).getTitulo());
            ;
        }
    }

    public void verBDreels() {
        System.out.println("Listado de reels: ");
        for (int i = 0; i < BDR.size(); i++) {
            System.out.println("prueba: " + BDR.get(i).getTitulo());
            ;
        }

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