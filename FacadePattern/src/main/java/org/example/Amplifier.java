package org.example;

public class Amplifier {
    private String name;

    public Amplifier(String name) {
        this.name = name;
    }

    public void on(){
        System.out.printf("%s Amplifier is on%n", name);
    }

    public void off(){
        System.out.printf("%s Amplifier is off%n", name);
    }

    public void setVolume(int level){
        System.out.printf("%s Setting volume to %d%n", name, level);
    }

    public void setSurroundSound(){
        System.out.printf("%s Surround sound enabled%n", name);
    }

    public void setStereoSound(){
        System.out.printf("%s Stereo mode enabled%n", name);
    }

}

