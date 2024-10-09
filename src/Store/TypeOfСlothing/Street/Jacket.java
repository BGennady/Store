package Store.TypeOfСlothing.Street;

import Store.TypeOfСlothing.CasualWear;

public class Jacket extends CasualWear {
    private boolean hasHood;

    public Jacket(String type, String brand, String color, String material, boolean isWaterproof, int size, double price, boolean available, boolean hasHood) {
        super(type, brand, color, material, isWaterproof, size, price, available);
        this.hasHood = hasHood;
    }

    public boolean isHasHood() {
        return hasHood;
    }
}
