package edu.unisabana.dyas.patterns.utils;

// Clase que implementa una interfaz diferente
public class AdvancedAudioPlayer {
    public void playMp4(String fileName) {
        System.out.println("Reproduciendo archivo mp4: " + fileName);
    }

    public void playVlc(String fileName) {
        System.out.println("Reproduciendo archivo VLC: " + fileName);
    }

    public void playMp3(String fileName) {
        System.out.println("Reproduciendo archivo mp3: " + fileName);
    }

    public void stop() {
        System.out.println("Deteniendo reproducción");
    }
}