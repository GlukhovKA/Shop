package Entity;

import java.util.HashMap;
import java.util.Map;

public class Showcase {
    public int capacity;
    public Map<Product, Integer> productsInShowcase = new HashMap<>();
    public Showcase(int capacity) {
        this.capacity = capacity;
    }
    public boolean isFull(){
        return capacity==productsInShowcase.values().stream().mapToInt(Integer::intValue).sum();
    }
    public int showcaseFreeSpace() {
        return (capacity - (productsInShowcase.values().stream().mapToInt(Integer::intValue).sum()));
    }
    public Map<Product, Integer> getProductsForRefill() {
        Map<Product, Integer> productsForRefill = new HashMap<>();
        productsInShowcase.keySet().forEach(prod ->{
            if (!productsInShowcase.get(prod).equals(capacity/10)){
                productsForRefill.put(prod, (capacity/10) - productsInShowcase.get(prod));
            }
        });
        return productsForRefill;
    }


    public void addProductInShowcase(Product product, int amount){
        if (!isFull()){
            int newAmount = productsInShowcase.containsKey(product) ? amount + productsInShowcase.get(product) : amount;
            productsInShowcase.put(product, newAmount);
        }else {
            System.out.println("Полки заполнены!");
        }

    }
}
