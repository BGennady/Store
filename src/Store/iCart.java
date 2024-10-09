package Store;

import java.util.List;

public interface iCart {

    // добавляем вещи в корзину
    void addItem(Clothing clothing);

    // получение общего количества товаров в корзине
    int getItemCount();

    // получение списка товаров в корзине
    List<Clothing> getShowCart();
}