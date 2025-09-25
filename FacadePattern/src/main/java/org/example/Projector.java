package org.example;

public class Projector {
    private String name;

    public Projector(String name) {
        this.name = name;
    }

    public void on(){
        System.out.printf("%s Projector is on%n", name);
    }

    public void off(){
        System.out.printf("%s Projector is off%n", name);
    }


}
