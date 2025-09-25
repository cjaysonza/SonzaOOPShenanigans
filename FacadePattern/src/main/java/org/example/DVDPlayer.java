package org.example;

public class DVDPlayer {
    private String name;

    public DVDPlayer(String name) {
        this.name = name;
    }

    public void on(){
        System.out.printf("%s DVD-Player is on%n", name);
    }

    public void off(){
        System.out.printf("%s DVD-Player is off%n", name);
    }

    public void play(String movie){
        System.out.printf("%s DVD-Player is playing the movie: %s%n", name, movie);
    }

    public void stop(){
        System.out.printf("%s DVD-Player has stopped Playing%n", name);
    }

//    public void setVolume(int level){
//        System.out.printf("%s Setting volume to %d%n", name, level);
//    }
//
//    public void setSurroundSound(){
//        System.out.printf("%s Surround sound enabled%n", name);
//    }
//
//    public void setStereoSound(){
//        System.out.printf("%s Stereo mode enabled%n", name);
//    }
}
