package org.example;

public class AudioPlayerAdapter implements MediaPlayer {

    AudioPlayer instance;

    public AudioPlayerAdapter() {
        instance = new AudioPlayer();
    }

    @Override
    public void play(String name, String filename) {
        switch (name) {
            case ("MP3") -> {
                instance.playMp3(filename);
                break;
            }
            case ("VLC") -> {
                instance.playVLC(filename);
                break;
            }
            case ("WAV") -> {
                instance.playWAV(filename);
                break;
            }
            default -> {
                instance.playMp3(filename);
                break;
            }
        }
    }
}
