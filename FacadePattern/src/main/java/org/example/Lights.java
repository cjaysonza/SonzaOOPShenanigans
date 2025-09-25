package org.example;

public class Lights {
    private String name;

    public Lights(String name) {
        this.name = name;
    }

    public void on(){
        System.out.printf("%s Lights is on%n", name);
    }

    public void off(){
        System.out.printf("%s Lights is off%n", name);
    }

}
