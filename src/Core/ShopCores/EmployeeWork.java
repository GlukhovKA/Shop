package Core.ShopCores;

import Entity.Employee;
import Entity.Shop;
import Entity.Skill;
import Enums.SkillType;
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
    Map<Integer, Employee> employee  = new HashMap<>();

    Gson gson = new GsonBuilder().setPrettyPrinting().create();


    @Override
    // Переопределение метода run()
    public void run() {
        // Проверка на отсутствие элементов в hashmap employee (26 str.)
        if (employee.isEmpty()) {
            // Пробуем открыть Input Stream для чтения файла
            try (FileReader reader = new FileReader(src)) {
                // При успешном открытии Input Stream, помещаем данные в hashmap employee (26 str.)
                employee = gson.fromJson(reader, mapIntEmpl);
                // Вывод информации о кол-ве загруженных из БД сотрудников.

                if (employee.isEmpty()){
                    BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Привет! Ты зашел в игру"); // Подумать

                    //Получаем имя персонажа и создаем экземпляр класса Employee и помещаем в словарь
                    System.out.println("Введите имя вашего персонажа (ФИО полностью)");
                    String ownerName = readerConsole.readLine();
                    employee.put(0, new Employee(ownerName));

                    /*
                    System.out.println("Введите название магазина");
                    String shopName = readerConsole.readLine();
                    Shop shop = new Shop(shopName, 8, 22);
                    */

                }else {
                    System.out.println("Данные загружены:" + employee.size() + " шт.");
                }
            }catch (IOException ex) {
                //ex.printStackTrace();
                //System.out.checkError();
                //Thread.currentThread().interrupt();
            }finally {

            }
        }


    }
}
//          employee.values().forEach(System.out::println);