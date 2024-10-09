package Store.TypeOfСlothing;

import Store.Clothing;

// подкласс для уличной одежды
public abstract class CasualWear implements Clothing {
    protected String type; // тип одежды
    protected String brand; // бренд
    protected String color; // цвет
    protected String material; // название
    protected boolean isWaterproof; // водонепроницаемость
    protected int size; // размер
    protected double price; // цена
    protected boolean available; // доступность

    public CasualWear(String type, String brand, String color, String material, boolean isWaterproof, int size, double price, boolean available) {
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.isWaterproof = isWaterproof;
        this.size = size;
        this.price = price;
        this.available = available;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    public boolean isWaterproof() {
        return isWaterproof;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}


