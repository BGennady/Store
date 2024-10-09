package Store;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Clothing> invent; // // список для хранения одежды

    // конструктор класса Inventory
    public Inventory() {
        invent = new ArrayList<>(); // список для хранения одежды
    }

    // добавление товара в магазин
    public void addClothing(Clothing clothing) {
        invent.add(clothing);
    }

    // получение списка всех доступных товаров
    public List<Clothing> getAvailableClothing() {
        List<Clothing> availableClothing = new ArrayList<>(); // создаем новый список
        for (Clothing item : invent) {
            if (item.isAvailable()) { // проверяем доступность товара1
                availableClothing.add(item); // кладем в новый список если true
            }
        }
        return availableClothing;
    }
}
