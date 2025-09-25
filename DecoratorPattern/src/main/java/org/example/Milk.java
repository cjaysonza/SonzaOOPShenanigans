package org.example;

public class Milk extends Condiments{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " w/ Extra Milk";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 15;
    }
}
