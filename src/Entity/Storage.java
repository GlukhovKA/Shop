package Entity;

import Enums.Category;
import Enums.Unit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс <b>Склад</b> с параметрами: <b>storageCapacity</b>, <b>reservedCapacity</b>.
 * И словарями: <b>productToAmount</b>, <b>orderedProducts</b>.
 * @author Glukhov K. A.
 * @version 0.0.5
 * @since 0.0.2
*/
public class Storage {

    /** Параметр <b>Вместимость склада</b> */
    int storageCapacity;

    /** Параметр <b>Зарезервирование пространство</b> */
    int reservedCapacity;

    /** Словарь <b>Продукты на складе</b> */
    public Map<Product, Integer> productToAmount = new HashMap<>();

    /** Словарь <b>Продукты заказанные на склад</b> */
    public Map<Product, Integer> orderedProducts = new HashMap<>();

    /*--------------------------------------------------------------*/

    /**
     * Конструктор - создание экземпляра класса <b>Склад</b>
     * @param storageCapacity Вместимость склада
    */
    public Storage(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * Функция получения кол-ва товаров на складе
     * @return Кол-во товаров на складе.
    */
    public int countProducts() {
        return productToAmount.values().stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * Функция получения свободного пространства на складе (с учетом зарезерв. места)
     * @return Кол-во свободных единиц складского помещения.
    */
    public int storageFreeSpace() {
        return (storageCapacity - (countProducts() + reservedCapacity));
    }

    /**
     * Функция получения состояния склада (загружен или нет)
     * @return true or false
    */
    public boolean isFull() {
        return storageFreeSpace() == 0;
    }

    /**
     * Процедура добавления заданного числа единиц товара на склад
     * @param product Товар
     * @param amount Кол-во ед. товара
    */
    private void addProduct(Product product, int amount) {
        int newAmount = productToAmount.containsKey(product) ? amount + productToAmount.get(product) : amount;
        productToAmount.put(product, newAmount);
    }

    /**
     * Процедура оформления доставки заданного числа единиц товара на склад
     * @param product Товар
     * @param amount Кол-во ед. товара
    */
    public void orderOneProduct(Product product, int amount){
        if (isFull()){
            reservedCapacity += amount;
            orderedProducts.put(product, amount);
        }else {
            System.out.println("Склад заполнен!");
        }
    }

    /**
     * Процедура перемещения заданного числа единиц заказанного товара на склад
     * @param product Товар
     * @param amount Кол-во ед. товара
     */
    public void moveOrderedProductToStorage(Product product, int amount){
        reservedCapacity -= amount;
        productToAmount.put(product, amount);
        orderedProducts.remove(product);
    }
}
