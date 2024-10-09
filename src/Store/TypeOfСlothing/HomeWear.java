package Store.TypeOfСlothing;

import Store.Clothing;

public abstract class HomeWear implements Clothing {
    protected String type; // тип одежды
    protected String brand; // бренд
    protected String color; // цвет
    protected String material; // название
    public boolean isWarm; // теплая или нет
    protected int size; // размер
    protected double price; // цена
    protected boolean available; // доступность

    public HomeWear(String type, String brand, String color, String material, boolean isWarm, int size, double price, boolean available) {
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.isWarm = isWarm;
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

    public boolean isWarm() {
        return isWarm;
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

