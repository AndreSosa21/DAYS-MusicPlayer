package edu.unisabana.dyas.patterns.utils;

public class AdvanceAudioPlayerAdapter implements AudioPlayer{
    private final AdvancedAudioPlayer advancedAudioPlayer;
    public AdvanceAudioPlayerAdapter( AdvancedAudioPlayer advancedAudioPlayer){
        this.advancedAudioPlayer = advancedAudioPlayer;
    }
    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "mp4":
                advancedAudioPlayer.playMp4(fileName);
                break;
            case "VLC":
                advancedAudioPlayer.playVlc(fileName);
                break;
            case "mp3":
                advancedAudioPlayer.playMp3(fileName);
                break;
            
            default:
                System.out.println("type format not supported:"+ audioType);
                break;
        }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
    
}
