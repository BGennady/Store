package Store.TypeOfСlothing.Home;

import Store.TypeOfСlothing.HomeWear;

public class Robe extends HomeWear {
    private boolean hasBelt; // пояса

    public Robe(String type, String brand, String color, String material, boolean isWarm, int size, double price, boolean available, boolean hasBelt) {
        super(type, brand, color, material, isWarm, size, price, available);
        this.hasBelt = hasBelt;
    }

    public boolean HasBelt() {
        return hasBelt;
    }
}
