package org.example;

public class MusicPlayer implements MediaPlayer{

    @Override
    public void play(String name, String filename) {
        System.out.println("Playing " + filename + "." + name);

    }
}
