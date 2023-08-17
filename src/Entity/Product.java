package Entity;

import Enums.Category;
import Enums.Unit;

/**
 * Класс <b>Товар</b> с параметрами: <b>brand</b>, <b>description</b>, <b>price</b>,
 * <b>article</b>, <b>unit</b> и <b>category</b>.
 * @author Glukhov K. A.
 * @version 0.0.4
 * @since 0.0.1
*/
public class Product {

    /** Параметр <b>Производитель</b> */
    String brand;

    /** Параметр <b>Описание</b> */
    String description;

    /** Параметр <b>Цена</b> */
    int price;

    /** Параметр <b>Артикул</b> */
    int article;

    /** Параметр <b>Ед. измерения</b> */
    Unit unit;

    /** Параметр <b>Категория</b> */
    Category category;

    /*--------------------------------------------------------------*/

    /**
     * Конструктор - создание экземпляра класса <b>Продукт</b>
     * @param brand Производитель
     * @param description Краткое описание
     * @param category Категория (Овощи, фрукты и т.п.)
     * @see Category
     * @param price Цена
     * @param article Артикул
     * @param unit Ед. измерения. (кг, шт. и т.п.)
     * @see Unit
    */
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
