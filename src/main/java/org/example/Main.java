package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Administrador admin = new Administrador("1","123456789","coolAdmin","admin");
        VideoLargo video1 = new VideoLargo("00:19","320x240","Me at the zoo","San Diego Zoo");
        admin.agregarvideo(video1);
        Reels reel1 = new Reels("00:25","1080x1920","Que es un Reel?","Ayuda!");
        admin.agregarreel(reel1);

        admin.agregarvideo(new VideoLargo("10:00","1920x1080","Video de prueba","Probando la plataforma"));
        admin.agregarvideo(new VideoLargo("15:25","1280x720","Listas en Java","Curso para Principiantes"));
        admin.agregarvideo(new VideoLargo("8:34","800x600","Hola Mundo!","Tu primer programa"));

        System.out.println("----------------------------------------");

        admin.agregarreel(new Reels("00:50","1080x1920","Reel de prueba","Probando la plataforma con un Reel"));
        admin.agregarreel(new Reels("00:30","1080x1920","Un Meme","Reviviendo memes antiguos"));
        admin.agregarreel(new Reels("00:50","1080x1920","Challenge","Challenge trend del momento"));

        System.out.println("----------------------------------------");
        admin.verBDvideos();
        System.out.println("----------------------------------------");
        admin.eliminarvideo(video1);
        System.out.println("----------------------------------------");
        admin.verBDreels();
        System.out.println("----------------------------------------");
        admin.eliminarreel(reel1);
        System.out.println("----------------------------------------");
        admin.verBDreels();
        System.out.println("----------------------------------------");
        admin.verBDvideos();
        System.out.println("----------------------------------------");
        admin.verBDreels();
        System.out.println("----------------------------------------");
        admin.reproducir();
        System.out.println("----------------------------------------");
        admin.detener();
        System.out.println("----------------------------------------");
        admin.retroceder();
        System.out.println("----------------------------------------");
        admin.avanzar();
        System.out.println("----------------------------------------");
        }

    }


