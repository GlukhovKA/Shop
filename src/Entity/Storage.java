package Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    int storageCapacity;
    int reservedCapacity;

    public Storage(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public Map<Product, Integer> productToAmount = new HashMap<>();
    public Map<Product, Integer> orderedProducts = new HashMap<>();
    public int countProducts() {
        return productToAmount.values().stream().mapToInt(Integer::intValue).sum();
    }
    public int storageFreeSpace() {
        return (storageCapacity - (countProducts() + reservedCapacity));
    }
    public boolean isFull() {
        return storageFreeSpace() == 0;
    }

    public void addProduct(Product product, int amount) {
        int newAmount = productToAmount.containsKey(product) ? amount + productToAmount.get(product) : amount;
        productToAmount.put(product, newAmount);
    }

    public void orderOneProduct(Product product, int amount){
        if (isFull()){
            reservedCapacity += amount;
            orderedProducts.put(product, amount);
        }else {
            System.out.println("Склад заполнен!");
        }
    }

    public void moveOrderedProductToStorage(Product product, int amount){
        reservedCapacity -= amount;
        productToAmount.put(product, amount);
        orderedProducts.remove(product);
    }
}
