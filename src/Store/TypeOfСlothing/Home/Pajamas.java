package Store.TypeOfСlothing.Home;

import Store.TypeOfСlothing.HomeWear;

public class Pajamas extends HomeWear {
    private String style; // стиль

    public Pajamas(String type, String brand, String color, String material, boolean isWarm, int size, double price, boolean available, String style) {
        super(type, brand, color, material, isWarm, size, price, available);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }
}
