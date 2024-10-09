package Store;

import Store.TypeOfСlothing.Home.Pajamas;
import Store.TypeOfСlothing.Home.Robe;
import Store.TypeOfСlothing.Sport.Leggings;
import Store.TypeOfСlothing.Sport.Sneakers;
import Store.TypeOfСlothing.Sport.Tracksuit;
import Store.TypeOfСlothing.Street.Jacket;
import Store.TypeOfСlothing.Street.Jeans;
import Store.TypeOfСlothing.Street.TShirt;

import java.util.List;
import java.util.Scanner;

public class Main implements UserInterface {
    public static void main(String[] args) {
        Main store = new Main();// создаем экземпляр магазина
        store.getWelcomeMessage(); // приветственное сообщение
        store.interact(); // запускаем взаимодействие с пользователем
    }

    private Inventory inventory;// переменная для хранения инвентаря
    private iCart cart; // переменная для хранения корзины
    private Order order; // переменная для хранения заказа

    public Main() {
        this.inventory = createInventory();// создаем корзину
        this.cart = createCart();
        this.order = createOrder(); // создаем заказ
        replenishmentOfAssortment(); // заполняем ассортимент товара
        refillCart(); // заполняем корзину
    }

    private void replenishmentOfAssortment() {
        inventory.addClothing(new Jacket("Куртка", "BrandA", "Black", "Cotton", true, 42, 59.99, true, true));
        inventory.addClothing(new Jeans("Джисы", "BrandB", "Blue", "Denim", false, 34, 39.99, true, "Slim"));
        inventory.addClothing(new TShirt("Футболка", "BrandC", "White", "Polyester", false, 38, 19.99, true, "Short"));
        inventory.addClothing(new Pajamas("Пижама", "BrandD", "Beige", "Cotton", false, 40, 49.99, true, "Classic"));
        inventory.addClothing(new Robe("Халат", "BrandE", "Beige", "Silk", false, 44, 89.99, true, true));
        inventory.addClothing(new Leggings("Леггинсы", "BrandF", "White", "Nylon", false, 36, 29.99, true, "Full Length"));
        inventory.addClothing(new Sneakers("Кросовки", "BrandG", "White", "Synthetic", true, 42, 79.99, true, "High Cushioning"));
        inventory.addClothing(new Tracksuit("Спортивный костюм", "BrandH", "Blue", "Polyester", true, 38, 69.99, true, true));
    }

    private void refillCart() {
        cart.addItem(new Jeans("Джисы", "BrandB", "Blue", "Denim", false, 34, 39.99, true, "Slim"));
        cart.addItem(new TShirt("Футболка", "BrandC", "White", "Polyester", false, 38, 19.99, true, "Short"));
        cart.addItem(new Pajamas("Пижама", "BrandD", "Beige", "Cotton", false, 40, 49.99, true, "Classic"));
        cart.addItem(new Sneakers("Кросовки", "BrandG", "White", "Synthetic", true, 42, 79.99, true, "High Cushioning"));
    }

    // метод для создания инвентаря
    @Override
    public Inventory createInventory() {
        return new Inventory(); // возвращаем новый объект Inventory
    }

    // метод для создания корзины
    @Override
    public iCart createCart() {
        return new Cart(); // возвращаем новый объект Cart
    }

    // метод для создания заказа
    @Override
    public Order createOrder() {
        return new Order(cart);// возвращаем новый объект Order с текущей корзиной
    }

    // метод для отображения доступной одежды
    @Override
    public void displayAvailableClothing(Inventory inventory) {
        List<Clothing> clothing = inventory.getAvailableClothing();
        if (clothing.isEmpty()) {
            System.out.println("Нет доступных товаров.");
        } else {
            System.out.println("Доступная одежда:");
            for (Clothing item : clothing) {
                System.out.printf("%s, бренд %s, цвет %s, размер %d, цена %2.2f\n", item.getType(), item.getBrand(), item.getSize(), item.getSize(), item.getPrice());
            }
        }
    }

    // метод для отображения корзины
    @Override
    public void displayCart(iCart cart) {
        List<Clothing> itemsInCart = cart.getShowCart();
        if (itemsInCart.isEmpty()) {
            System.out.println("Ваша корзина пустая");
        } else {
            System.out.println("В вашей корзине:");
            for (Clothing item : itemsInCart) {
                System.out.printf("%s, бренд %s, цвет %s, размер %d, цена %2.2f \n ",
                        item.getType(), item.getBrand(), item.getColor(), item.getSize(), item.getPrice());
            }
            System.out.printf("Общее колличество предметов %d шт.\n На сумму %2.2f\n", totalItemCart(cart), totalCostCart(order));

        }
    }

    // метод для отображения колличества предметов в корзине
    @Override
    public int totalItemCart(iCart cart) {
        return cart.getItemCount();
    }

    // метод для отображения общей стоимости корзины
    @Override
    public double totalCostCart(Order order) {
        return order.calculateTotal();
    }

    // метод для вывода приветственного сообщения
    public void getWelcomeMessage() {
        System.out.println("Добро пожаловать в наш магазин!");
    }

    // метод для возврата произвольного сообщения
    public String getMessage(String message) { // произвольное сообщение
        return message;
    }
    // метод для взаимодействия с пользователем
    public void interact() {
        Scanner sc = new Scanner(System.in);
        boolean shopping = true;

        while (shopping) {
            System.out.println();
            System.out.println("Выберите действие: ");
            System.out.println("1. Показать доступную одежду");
            System.out.println("2. Показать корзину");
            System.out.println("3. Завершить покупку");
            System.out.println("4. Выход");

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    displayAvailableClothing(inventory);
                    break;
                case 2:
                    displayCart(cart);
                    break;
                case 3:
                    System.out.printf("Общая стоимость заказа: %2.2f", totalCostCart(order));

                    break;
                case 4:
                    System.out.println("До свидания. Приходите еще!");
                    shopping = false;
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }

    }
}
