package Store.TypeOfСlothing.Sport;

import Store.TypeOfСlothing.HomeWear;
import Store.TypeOfСlothing.SportWear;

public class Tracksuit extends SportWear {
    private boolean hasPockets; // наличие карманов

    public Tracksuit(String type, String brand, String color, String material, boolean isBreathable, int size, double price, boolean available, boolean hasPockets) {
        super(type, brand, color, material, isBreathable, size, price, available);
        this.hasPockets = hasPockets;
    }

    public boolean HasPockets() {
        return hasPockets;
    }
}
