package Store;

// базовый класс для одежды, определяем основные параметры
public interface Clothing {
    String getType();

    String getBrand();

    String getColor();

    String getMaterial();

    int getSize();

    double getPrice();

    boolean isAvailable(); // доступность
}