package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items != null ? items : new Food[0];
    }

    public double getTotalPrice() {
        double total = 0;
        for (Food item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item instanceof Discountable) {
                double discount = ((Discountable) item).getDiscount();
                total += item.getTotalPrice() * (1 - discount / 100);
            } else {
                total += item.getTotalPrice();
            }
        }
        return total;
    }

    public double getVegetarianTotalPrice() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getTotalPrice();
            }
        }
        return total;
    }
}
