package org.example;

public class Pizza {

    private String name;
    private double thickness;
    private boolean hasCheese;
    private String sauce;
    private String style;
    private String topping;

    public Pizza(PizzaBuilder pb){
        this.name = pb.name;
        this.thickness = pb.thickness;
        this.hasCheese = pb.hasCheese;
        this.sauce = pb.sauce;
        this.style = pb.style;
        this.topping = pb.topping;
    }

    public String getName() {
        return name;
    }

    public double getThickness() {
        return thickness;
    }

    public boolean isHasCheese() {
        return hasCheese;
    }

    public String getSauce() {
        return sauce;
    }

    public String getStyle() {
        return style;
    }

    public String getTopping() {
        return topping;
    }

}
