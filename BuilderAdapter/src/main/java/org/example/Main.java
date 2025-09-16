package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Builder-Adapter -> Creational Pattern
        *  Ex:
        * PizzaBuilder {
        *   return new Pizza
        * }
        *
        * Pizza
        *
        *
        * */

        Pizza pizza1 = new PizzaBuilder().name("Hello").build();
        Pizza pizza2 = new PizzaBuilder()
                .thickness(1)
                .hasCheese(true)
                .sauce("Mang Tomas")
                .topping("Lechon")
                .build();
        Pizza pizza3 = new PizzaBuilder().build();
        // Builder and Adapter Pattern
    }
}