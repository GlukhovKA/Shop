package Core.ShopCores;

import Entity.Employee;
import Entity.Human;
import Entity.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Класс <b>Управления кассой</b>.
 * @author MART 2023
 * @version 0.1.2
 * @since 0.1.1
 */
public class ControlCash implements Runnable{

    // Расположение файла с информацией о клиентах на кассе при завершении работы проги (Пока не используем)
    String src = "src/clients.json";
    // Тип данных в файле (По-хорошему нужен класс описывающий клиента) ПОДУМАТЬ!!!
    Type mapIntEmpl = new TypeToken<Map<Human, Product>>(){}.getType();
    // hashmap clients (--, -- str.)
    Map<Human, Product> clients = new HashMap<>();

    //Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public void run() {
        //while(true) { // ПОДУМАТЬ!!! ЭТОТ БЛОК ВЫПОЛНЯЕТСЯ ВСЕГДА
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            System.out.println("Hi! I want your money");
        //}

    }
}
