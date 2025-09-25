package org.example;

public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaffeinated Drink";
    }

    @Override
    public int getCost() {
        return 29;
    }
}
