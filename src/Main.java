import Entity.Product;
import Entity.Skill;
import Enums.Category;
import Enums.SkillType;
import Enums.Unit;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product(
                "Княгинино",
                "Лучшее молоко в Нижнем Новгороде",
                Category.DAIRY,
                100,
                12548001,
                Unit.LITRE
        );

        Skill skill = new Skill(SkillType.CASHIER);


        System.out.println(milk.toString());

/*
        Map<String, Integer> test = new HashMap<>();
        Map<String, Integer> test1 = new HashMap<>();
        test.put("прод1", 1);
        test.put("прод2", 2);
        test.put("прод3", 7);
        test.put("прод4", 10);

        System.out.println(test);
        System.out.println();

        test.keySet().forEach(prod -> {
            if (!test.get(prod).equals(10)){
                test1.put(prod, 10 - test.get(prod));
            }
        });
        System.out.println(test1);

        bbbbGson gson = new GsonBuilder().setPrettyPrinting().create();

        String src = "src/test.json";

        try (FileWriter writer = new FileWriter(src)) {
            gson.toJson(test, writer);
            System.out.println(test);
        }catch (IOException ex){
            System.out.println(ex);
        }

        try (FileReader reader = new FileReader(src)) {
            test1 = gson.fromJson(reader, test1.getClass());
            System.out.println(test1);
        }catch (IOException ex){
            System.out.println(ex);
        }*/

    }
}
