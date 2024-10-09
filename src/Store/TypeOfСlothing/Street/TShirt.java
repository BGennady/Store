package Store.TypeOfСlothing.Street;

import Store.TypeOfСlothing.CasualWear;

public class TShirt extends CasualWear {
    private String sleeveLength;

    public TShirt(String type, String brand, String color, String material, boolean isWaterproof, int size, double price, boolean available, String sleeveLength) {
        super(type, brand, color, material, isWaterproof, size, price, available);
        this.sleeveLength = sleeveLength;
    }

    public String getSleeveLength() {
        return sleeveLength;
    }
}