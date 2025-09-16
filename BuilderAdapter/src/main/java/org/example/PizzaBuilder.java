package org.example;

public class PizzaBuilder {
    String name;
    double thickness;
    boolean hasCheese;
    String sauce;
    String style;
    String topping;

    public PizzaBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder thickness(double thickness){
        this.thickness = thickness;
        return this;
    }

    public PizzaBuilder hasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
        return this;
    }

    public PizzaBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder style(String style) {
        this.style = style;
        return this;
    }

    public PizzaBuilder topping(String topping) {
        this.topping = topping;
        return this;
    }

    public Pizza build() {
        if(thickness > 0) {
            throw new IllegalArgumentException("Illegal Thickness");
        }
        return new Pizza(this);
    }
}
