package model;

import model.constants.Colour;

public class Apple extends Food implements Discountable {
    private String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        return Colour.RED.equals(color) ? 60 : 0;
    }

}
