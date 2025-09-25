package org.example;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend";
    }

    @Override
    public int getCost() {
        return 39;
    }
}
