package org.example;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public int getCost() {
        return 49;
    }
}
