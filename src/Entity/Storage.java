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
    int storageCapacity; // 100 freespace= 10

    /** Параметр <b>Зарезервирование пространство</b> */
    int reservedCapacity; // = 10

    /** Словарь <b>Продукты на складе</b> */
    public Map<Product, Integer> productToAmount = new HashMap<>();

    /** Словарь <b>Продукты заказанные на склад</b> */
    Map<Product, Integer> orderedProducts = new HashMap<>();

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
        int newAmount;
        if (productToAmount.containsKey(product)) {
            newAmount = amount + productToAmount.get(product);
        } else{
            newAmount = amount;
            productToAmount.put(product, newAmount);
        }
    }

    /**
     * Процедура оформления доставки заданного числа единиц товара на склад
     * @param product Товар
     * @param amount Кол-во ед. товара
    */
    public void orderOneProduct(Product product, int amount){
        if (storageFreeSpace() >= amount){
            reservedCapacity += amount;
            orderedProducts.put(product, amount);
        }else {
            System.out.println("Нет места на складе!" + '\n' + "Доступно: " + storageFreeSpace());
        }
    }

    /**
     * Процедура оформления доставки заданного числа единиц товаров на склад
     * @param products Товары в Map
     */
    public void orderAnyProducts(Map<Product, Integer> products){
        products.keySet().forEach(product -> {
            orderOneProduct(product, products.get(product));
        });
    }

    /**
     * Процедура оформления доставки заданного числа единиц товаров на склад
     * @deprecated НЕТ НИКАКОЙ ЛОГИКИ И ВОЗВРАЩАЕТ ПУСТОЙ 'MAP'
     */
    public Map<Product, Integer> productsForOrder(){
        return new HashMap<>();
    }

    /**
     * Процедура перемещения заданного числа единиц заказанного товара на склад
     * @param product Товар
     * @param amount Кол-во ед. товара
     * @deprecated Работает не корректно
     */
    public void moveOrderedProductToStorage(Product product, int amount){
        reservedCapacity -= amount;
        productToAmount.put(product, amount);
        orderedProducts.remove(product);
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public String toString() {
        return  "Информация о складе:" + '\n' +
                "Размер склада: " + storageCapacity + '\n' + '\n' +
                "Зарезервированное место:" + reservedCapacity + '\n' + '\n' +
                "Продукты на складе:" + '\n' + productToAmount + '\n' + '\n' +
                "Доставка:" + '\n' + orderedProducts;
    }

}
