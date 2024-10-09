package Store;

import java.util.List;

public interface UserInterface {

    Inventory createInventory();

    iCart createCart();

    Order createOrder();

    void displayAvailableClothing(Inventory inventory); // получаем список доступной одежды на экране

    void displayCart(iCart cart); // отображаем содержимое корзины

    int totalItemCart(iCart cart); // получить общее колличество товаров в корзине

    double totalCostCart(Order order); // получить общую стоимость товаров в корзине

    void getWelcomeMessage(); // приветственное сообщение

    String getMessage(String message); // произвольное сообщение

    void interact(); // метод для взаимодействия с пользователем

}