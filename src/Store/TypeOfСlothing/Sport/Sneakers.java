package Store.TypeOfСlothing.Sport;

import Store.TypeOfСlothing.HomeWear;
import Store.TypeOfСlothing.SportWear;

public class Sneakers extends SportWear {
    private String cushioning; // уровень амортизации

    public Sneakers(String type, String brand, String color, String material, boolean isBreathable, int size, double price, boolean available, String cushioning) {
        super(type, brand, color, material, isBreathable, size, price, available);
        this.cushioning = cushioning;
    }

    public String getCushioning() {
        return cushioning;
    }
}
