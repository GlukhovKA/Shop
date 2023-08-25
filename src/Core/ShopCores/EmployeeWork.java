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

/**
 * Класс <b>Работа сотрудников</b>.
 * @author MART 2023
 * @version 0.1.0
 * @since 0.1.0
 */
class EmployeeWork implements Runnable {
    String src = "src/employee.json";
    Type mapIntEmpl = new TypeToken<Map<Integer, Employee>>(){}.getType();
    Map<Integer, Employee> employee = new HashMap<>();

    Gson gson = new GsonBuilder().setPrettyPrinting().create();



    @Override
    public void run() {
        try (FileReader reader = new FileReader(src)) {
            employee = gson.fromJson(reader, mapIntEmpl);
            /*while(){

            }*/
        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}
