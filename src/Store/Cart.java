package Store;

import java.util.ArrayList;
import java.util.List;

public class Cart implements iCart {
    private List<Clothing> shoppingCart; // список товаров в корзине

    // конструктор класса Cart
    public Cart() {
        shoppingCart = new ArrayList<>();
    }

    // добавлям товар в корзину
    @Override
    public void addItem(Clothing clothing) {
        shoppingCart.add(clothing);
    }

    @Override
    // получаем общее количесто товаров в корзине
    public int getItemCount() {
        return shoppingCart.size();
    }

    @Override
    // получаем список товаров в корзине
    public List<Clothing> getShowCart() {
        return shoppingCart;
    }
}