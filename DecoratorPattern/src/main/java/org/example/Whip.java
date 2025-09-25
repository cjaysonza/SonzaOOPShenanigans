package org.example;

public class Whip extends Condiments{

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " w/ Extra Whip";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 10;
    }
}
