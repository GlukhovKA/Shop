package Core.Server;

import Entity.Product;
import Entity.Storage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ядро <b>Управления закупа</b>.
 * @deprecated Нет логики вообще никакой
 * @author MART 2023
 * @version 0.1.0
 * @since 0.1.0
 */
public class DistributiveStorageCore implements Runnable {

    /** Словарь <b>Продукты на закупочной базе</b> */
    public List<Product> productsInDistStorage = new ArrayList<>();

    // Расположение файла с информацией о сотрудниках
    String src = "src/distStorage.json";
    // Тип данных в файле
    Type storageType = new TypeToken<List<Product>>(){}.getType();

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public void run() {
        // Проверяем список товаров на их отсутствие.
        if (productsInDistStorage.isEmpty()) {
            // Пробуем открыть Input Stream для чтения файла
            try (FileReader reader = new FileReader(src)) {
                // При успешном открытии Input Stream, получаем информацию о товарах на закупочной базе
                productsInDistStorage = gson.fromJson(reader, storageType);
            }catch (IOException ex) { //Подумать какие ошибки могут быть и как их обработать правильно :)
                //ex.printStackTrace();
                //System.out.checkError();
                //Thread.currentThread().interrupt();
            }finally {
                if (productsInDistStorage.isEmpty()){
                    System.out.println("Информация о товарах на закупочной базе не была получена");
                    System.exit(666);
                }
            }
        }
    }
}
