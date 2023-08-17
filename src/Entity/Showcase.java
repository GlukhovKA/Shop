package Entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс <b>Витрина</b> с параметрами: <b>capacity</b>.
 * И словарями: <b>productsInShowcase</b>.
 * @author Glukhov K. A.
 * @version 0.0.4
 * @since 0.0.3
*/
public class Showcase {

    /** Параметр <b>Вместимость витрин</b> */
    public int capacity;

    /** Словарь <b>Продукты на витринах</b> */
    public Map<Product, Integer> productsInShowcase = new HashMap<>();

    /*--------------------------------------------------------------*/

    /**
     * Конструктор - создание экземпляра класса <b>Витрина</b>
     * @param capacity Вместимость витрин
    */
    public Showcase(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Функция получения состояния витрин (загружен или нет)
     * @return true or false
    */
    public boolean isFull(){
        return capacity == productsInShowcase.values().stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * Функция получения свободного пространства на витринах
     * @return Кол-во свободных единиц на полках магазина.
    */
    public int showcaseFreeSpace() {
        return (capacity - (productsInShowcase.values().stream().mapToInt(Integer::intValue).sum()));
    }

    /**
     * Функция получения списка товаров, которые нужно пополнить на витринах
     * @deprecated <b>Некорректная проверка!</b> (только 10 разных товаров на полках магазина)
    */
    public Map<Product, Integer> getProductsForRefill() {
        Map<Product, Integer> productsForRefill = new HashMap<>();
        productsInShowcase.keySet().forEach(product ->{
            if (!productsInShowcase.get(product).equals(capacity/10)){
                productsForRefill.put(product, (capacity/10) - productsInShowcase.get(product));
            }
        });
        return productsForRefill;
    }

    /**
     * Процедура перемещения заданного числа единиц со склада на витрины
     * @param product Товар
     * @param amount Кол-во ед. товара
    */
    public void addProductInShowcase(Product product, int amount){
        if (!isFull()){
            int newAmount = productsInShowcase.containsKey(product) ? amount + productsInShowcase.get(product) : amount;
            productsInShowcase.put(product, newAmount);
        }else {
            System.out.println("Полки заполнены!");
        }

    }
}
