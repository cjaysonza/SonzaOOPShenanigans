package org.example;

public class DecoratorPattern {
    public static void main(String[] args) {
        Beverage hb = new HouseBlend();
        System.out.println("Beverage: " + hb.getDescription());
        System.out.println("Cost: " + hb.getCost());

        Beverage mb = new Milk(hb);
        System.out.println("Beverage: " + mb.getDescription());
        System.out.println("Cost: " + mb.getCost());

        Beverage mb2 = new Milk(mb);
        System.out.println("Beverage: " + mb2.getDescription());
        System.out.println("Cost: " + mb2.getCost());

        Beverage dr = new DarkRoast();
        System.out.println("Beverage: " + dr.getDescription());
        System.out.println("Cost: " + dr.getCost());

        Beverage drMocha = new Mocha(dr);
        System.out.println("Beverage: " + drMocha.getDescription());
        System.out.println("Cost: " + drMocha.getCost());

        Beverage drWhip = new Whip(drMocha);
        System.out.println("Beverage: " + drWhip.getDescription());
        System.out.println("Cost: " + drWhip.getCost());

        Beverage mrr = new Milk(drWhip);
        System.out.printf("Beverage: %s\nCost: %d", mrr.getDescription(), mrr.getCost());

    }
}