package Core.ShopCores;

import Entity.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/**
 * Класс <b>Работа сотрудников</b>.
 * @author MART 2023
 * @version 0.1.2
 * @since 0.1.0
 */
public class EmployeeWork implements Runnable {
    // Расположение файла с информацией о сотрудниках
    String src = "src/employee.json";
    // Тип данных в файле
    Type mapIntEmpl = new TypeToken<Map<Integer, Employee>>(){}.getType();
    // hashmap employee (35, 39 str.)
    Map<Integer, Employee> employee = new HashMap<>();

    Gson gson = new GsonBuilder().setPrettyPrinting().create();


    @Override
    // Переопределение метода run()
    public void run() {
        // Проверка на отсутствие элементов в hashmap employee (26 str.)
        if (employee.isEmpty()) { /* В методе run() нехватает одной проверки, которая тоже может уронить поток. Подсказка: это еще решит вопрос с отсрочккой прибытия клиентов.*/
            // Пробуем открыть Input Stream для чтения файла
            try (FileReader reader = new FileReader(src)) {
                // При успешном открытии Input Stream, помещаем данные в hashmap employee (26 str.)
                employee = gson.fromJson(reader, mapIntEmpl);
                System.out.println("Данные загружены:" + employee.size() + " шт.");
                // ПОДУМАТЬ!!! При неудачном открытии Input Stream, ловим ошибки
            }catch (IOException ex) {
                //ex.printStackTrace();
                //System.out.checkError();
                //Thread.currentThread().interrupt();
            }finally {
                // ПОДУМАТЬ!!! ЭТОТ БЛОК ВЫПОЛНЯЕТСЯ ВСЕГДА
            }
        }
        //while(true) { // ПОДУМАТЬ!!! ЭТОТ БЛОК ВЫПОЛНЯЕТСЯ ВСЕГДА
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            System.out.println("Привет! Я управляю сотрудниками!");
        //}

    }
}
//          employee.values().forEach(System.out::println);