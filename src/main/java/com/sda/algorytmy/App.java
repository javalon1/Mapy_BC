package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        /*      Inna wersja Map, z lista.
         */
        Map<Integer, List<String>> map1 = new HashMap<>();

        map.put(1, "Jan");
        map.put(2, "Kamil");
        map.put(3, "Zosia");

        System.out.println(map);

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println("Klucz:" + m.getKey());
            System.out.println("Wartosc:" + m.getValue());
        }

        Map<String, List<String>> food = new HashMap<>();

        List<String> wegan = new ArrayList<>();
        wegan.add("Jajka");
        wegan.add("SER");
        wegan.add("Tofu");

        List<String> halal = new ArrayList<>();
        halal.add("BARAN");
        halal.add("KURCZAK");
        halal.add("SALAMI");

        List<String> koszerne = new ArrayList<>();
        koszerne.add("MARCHEWKA");
        koszerne.add("CIASTKA");
        koszerne.add("HUMUS");

        food.put("WEGAN", wegan);
        food.put("HALAL", halal);
        food.put("KOSZERNE", koszerne);

        System.out.println(food);

        for (Map.Entry<String, List<String>> m : food.entrySet()) {
            System.out.println(m.getKey());
            List<String> values = food.get(m.getKey());
            for (String val : values) {
                System.out.println("-" + val);
            }
        }
        Map<Student, List<List<String>>> foodMenu = new HashMap<>();

        Student student1 = new Student("Jan", "Kowalski", 1);
        Student student2 = new Student("Michal", "Kowalski", 1);

        List<List<String>> dni = new ArrayList<>();
        List<String> dania = new ArrayList<>();

        dania.add("JAJKA");
        dania.add("MAKARON");
        dania.add("RYBA");

        dni.add(dania);  // Poniedzialek

        List<String> daniaWtorek = new ArrayList<>();
        daniaWtorek.add("POMIDOROWA");
        daniaWtorek.add("RYZ");

        dni.add(daniaWtorek); // Wtorek

        foodMenu.put(student1, dni);

        for (Map.Entry<Student, List<List<String>>> mapData : foodMenu.entrySet()) {
            Student key = mapData.getKey();
            List<List<String>> dataList = foodMenu.get(key);
            System.out.println("Imie:" + key.getName() + "Nazwisko:" + key.getLastname());
            for (List<String> list : dataList) {
                for (String str : list) {
                    System.out.println(str);
                }
                System.out.println("=======");
            }
        }
    }
}