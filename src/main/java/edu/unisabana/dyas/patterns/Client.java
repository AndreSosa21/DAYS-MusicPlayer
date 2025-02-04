package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvanceAudioPlayerAdapter;
// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AdvanceAudioPlayerAdapter(new AdvancedAudioPlayer());
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("VLC", "movie.vlc");
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.stop();
    }
}