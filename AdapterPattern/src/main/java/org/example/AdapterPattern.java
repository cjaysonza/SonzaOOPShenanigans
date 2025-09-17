package org.example;


public class AdapterPattern {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.play("MP3", "Hello");

//        AudioPlayer ap = new AudioPlayer();
//        ap.playVLC("Hello");

//        AudioPlayer ap = new AudioPlayer();
//        ap.play("MP3", "Hello");

        AudioPlayerAdapter adp = new AudioPlayerAdapter();
        adp.play("MP3", "Hello");

    }
}