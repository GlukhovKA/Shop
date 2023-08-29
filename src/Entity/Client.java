package Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Класс <b>Клиента</b> с параметрами: <b>fullName</b> и <b>cash</b>.
 * И словарями: <b>productsInShowcase</b>.
 * @deprecated Нет логики
 * @author Glukhov K. A.
 * @version 0.1.2
 * @since 0.1.2
 */
public class Client extends Human{

    /** Словарь <b>Продукты в корзине клиента</b> */
    public Map<Product, Integer> productsInCart = new HashMap<>();

    /**
     * Конструктор - создание экземпляра класса <b>Человек</b>
     * @param fullName 'Фамилия Имя Отчество'
     */
    public Client(String fullName) {
        super(fullName);
    }

    /**
     * Процедура заполнения корзины
     * @deprecated нет логики
     * @param productsInShowcase товары на витрине
     */
    public void autoCartForClient(Map<Product, Integer> productsInShowcase){ //
        Random random = new Random();
        // рандомное число товаров
        // рандомные товары
        //productsInCart.put();
    }
}
