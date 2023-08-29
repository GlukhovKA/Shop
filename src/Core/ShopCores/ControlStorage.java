package Core.ShopCores;

import Entity.Employee;
import Entity.Storage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Класс <b>Управления складом</b>.
 * @author MART 2023
 * @version 0.1.0
 * @since 0.1.0
 */
public class ControlStorage implements Runnable{

    // Экземпляр класса Storage
    Storage storage;

    // Расположение файла с информацией о сотрудниках
    String src = "src/storage.json";
    // Тип данных в файле
    Type storageType = new TypeToken<Storage>(){}.getType();

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public void run() {
        // Проверяем экз. Storage'а
        if (storage == null) {
            // Пробуем открыть Input Stream для чтения файла
            try (FileReader reader = new FileReader(src)) {
                // При успешном открытии Input Stream, получаем информацию о хранилище (Storage)
                storage = gson.fromJson(reader, storageType);
                // Вывод информации о кол-ве загруженных из БД сотрудников.
                if (storage == null) {
                    storage = new Storage(25); //Базовый размер склада (При начале игры)
                }else {
                    System.out.println(storage.toString());
                }
            }catch (IOException ex) { //Подумать какие ошибки могут быть и как их обработать правильно :)
                //ex.printStackTrace();
                //System.out.checkError();
                //Thread.currentThread().interrupt();
            }finally {

            }
        }
        if (storage.storageFreeSpace() >= storage.getStorageCapacity() * 0.5){
            // !!! Написать логику автоматического заказа товаров на склад.
             storage.orderAnyProducts(storage.productsForOrder());
            // !!! Разгрузка товара при получении.
        }
    }
}
