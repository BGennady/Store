package Store;

import java.util.List;

public class Order {
    //используем интерфейс ICart
    private iCart cart;

    // конструктор принимает ICart
    public Order(iCart cart) {
        this.cart = cart;
    }

    // подсчет общей стоимости заказа
    public double calculateTotal() {
        double amount = 0;
        for (Clothing clothing : cart.getShowCart()) {

            amount += clothing.getPrice();
        }
        return amount;
    }
}