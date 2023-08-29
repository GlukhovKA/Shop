package Core.ShopCores;

import Entity.Client;
import Entity.Employee;
import Entity.Human;
import Entity.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс <b>Управления кассой</b>.
 * @author MART 2023
 * @version 0.1.2
 * @since 0.1.1
 */
public class ControlCash implements Runnable{ //implements Callable

    // Расположение файла с информацией о клиентах на кассе при завершении работы программы!!!
    String src = "src/clients.json";

    // Тип данных в файле (По-хорошему нужен класс описывающий клиента) ПОДУМАТЬ!!!
    Type listOfClients = new TypeToken<List<Client>>(){}.getType();

    // list clients (--) Создать класс клиента
    List<Client> clients = new ArrayList<>();

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public void run() {
            if (!clients.isEmpty()) {
                // Возвращаем ответ о том, что требуется сотрудник
            } else {
                //Подумать что еще
            }
    }
}
