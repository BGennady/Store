package Store.TypeOfСlothing.Sport;

import Store.TypeOfСlothing.HomeWear;
import Store.TypeOfСlothing.SportWear;

public class Leggings extends SportWear {
    private String length; // длина

    public Leggings(String type, String brand, String color, String material, boolean isBreathable, int size, double price, boolean available, String length) {
        super(type, brand, color, material, isBreathable, size, price, available);
        this.length = length;
    }

    public String getLength() {
        return length;
    }
}