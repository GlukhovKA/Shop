package Entity;

import Enums.Category;
import Enums.Unit;

public class Product {
    String brand;
    String description;
    int price;
    int article;
    Unit unit;
    Category category;

    public Product(String brand, String description, Category category, int price, int article, Unit unit ) {
        this.brand = brand;
        this.description = description;
        this.price = price;
        this.article = article;
        this.category = category;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Продукт:" + '\n' +
                "Артикул: " + article + '\n' +
                "Бренд: " + brand + '\n' +
                "Описание: " + description + '\n' +
                "Категория: " + category + '\n' +
                "Цена: " + price + " руб. за " + unit;
    }
}
