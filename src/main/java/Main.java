import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] foods = {
                new Meat(5, 350),
                new Apple(10, 80, "red"),
                new Apple(8, 80, "green")
        };

        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Общая сумма без скидки:  " + cart.getTotalPrice() + " руб.");
        System.out.println("Общая сумма со скидкой:  " + cart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов:  " + cart.getVegetarianTotalPrice() + " руб.");
    }
}