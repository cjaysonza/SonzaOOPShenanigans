package org.example;

public class Screen {
    private String name;

    public Screen(String name) {
        this.name = name;
    }

    public void on(){
        System.out.printf("%s Screen is on%n", name);
    }

    public void off(){
        System.out.printf("%s Screen is off%n", name);
    }

}
