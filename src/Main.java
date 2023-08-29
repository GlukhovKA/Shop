import Core.ShopCores.ControlCash;
import Core.ShopCores.EmployeeWork;
import Entity.Employee;
import Entity.Product;
import Entity.Shop;
import Entity.Skill;
import Enums.Category;
import Enums.SkillType;
import Enums.Unit;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Main {
    static ControlCash ctrlCash;
    public static void main(String[] args) {

        /*System.out.println("Главный - 0!");


        ctrlCash = new ControlCash();
        Thread myThready = new Thread(ctrlCash);
        myThready.setPriority(10);
        myThready.start();

        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");
        System.out.println("Главный поток завершён...");

        Skill skill = new Skill(SkillType.CASHIER);

        System.out.println("Главный поток завершён...");*/










        Shop shop = new Shop("Магазинчик", 8, 22);

/*      Создаем данные для БД

        Employee employee1 = new Employee("Андреев Андрей Анреевич");
        employee1.addSkill(new Skill(SkillType.CASHIER));
        employee1.addSkill(new Skill(SkillType.LOADER));
        Employee employee2 = new Employee("Алексев Алексей Алексеевич");
        employee2.addSkill(new Skill(SkillType.LOADER));
        Employee employee3 = new Employee("Федотов Федот Федотович");
        employee3.addSkill(new Skill(SkillType.MERCHANDISER));
        Map <Integer, Employee> employee = new HashMap<>();
        employee.put(1, employee1);
        employee.put(2, employee2);
        employee.put(3, employee3);

        Помещаем данные в БД
        try (FileWriter writer = new FileWriter(src)) {
            gson.toJson(employee, writer);

        }catch (IOException ex){
            System.out.println(ex);
        }
*/

//        Map <Integer, Employee> employee = new HashMap<>();

//      System.out.println(employee);


        /*
        try (FileWriter writer = new FileWriter(src)) {
            gson.toJson(employee, writer);

        }catch (IOException ex){
            System.out.println(ex);
        }*/
        /*Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String src = "src/employee.json";
        Type mapIntEmpl = new TypeToken<Map<Integer, Employee>>(){}.getType();

        try (FileReader reader = new FileReader(src)) {
            employee = gson.fromJson(reader, mapIntEmpl);
        }catch (IOException ex){
            System.out.println(ex);
        }

        //System.out.println(employee);
        employee.values().forEach(System.out::println);*/

    }
}
