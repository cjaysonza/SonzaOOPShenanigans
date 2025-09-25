package org.example;

public class Mocha extends Condiments{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " w/ Extra Mocha";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 3;
    }
}
