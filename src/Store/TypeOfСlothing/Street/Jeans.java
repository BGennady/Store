package Store.TypeOfСlothing.Street;

import Store.TypeOfСlothing.CasualWear;

public class Jeans extends CasualWear {
    private String fit; // фасон

    public Jeans(String type, String brand, String color, String material, boolean isWaterproof, int size, double price, boolean available, String fit) {
        super(type, brand, color, material, isWaterproof, size, price, available);
        this.fit = fit;
    }

    public String getFit() {
        return fit;
    }
}
