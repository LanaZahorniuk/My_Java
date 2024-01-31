package org.example._2024_01_17;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {
    /*
    Задача 9: Напишите метод, который преобразует карту, где ключи - это строки, а значения -
списки объектов, в один список уникальных строк, извлечённых из атрибутов объектов.
class Product {
    private String category;
    private String name;
}


     */
public static final Faker FAKER = new Faker();
    public static void main(String[] args) {

//        Map<String, List<Product>> listMap = new HashMap<>();
//        listMap.put("Music", Arrays.asList(new Product(FAKER.music().instrument(),FAKER.music().genre())));
//        listMap.put("Music2", Arrays.asList(new Product(FAKER.music().instrument(),FAKER.music().genre())));
//        listMap.put("Music3", Arrays.asList(new Product(FAKER.music().instrument(),FAKER.music().genre())));

        Map<String, List<Product>> categoryMap = new HashMap<>();
        categoryMap.put("Key1", Arrays.asList(new Product("ContainsMilk", "Milk")));
        categoryMap.put("Key2", Arrays.asList(new Product("Meat/Fish", "Salmon")));
        categoryMap.put("Key3", Arrays.asList(new Product("Drinks", "CocaCola")));
        categoryMap.put("Key4", Arrays.asList(new Product("Snacks", "Mini-Snickers")));

        System.out.println(getUniqueProductNames(categoryMap));

    }

    public static List<String> getUniqueProductNames(Map<String, List<Product>> categoryMap) {
        return categoryMap.entrySet().stream()
                .flatMap(el -> el.getValue().stream())
                .map(el -> el.getName())
                .distinct()
                .toList();
    }

    private String category;
    private String name;

    public Product(String category, String name) {
        this.category = category;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}
