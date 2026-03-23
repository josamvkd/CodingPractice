package org.josamtechie.java8features.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Hyundai");
        list.add("Toyota");
        list.add("Suzuki");
        list.add("Infinity");
        list.add("Patrol");
        list.add("Honda");
        list.add("Nisan");

//        list.stream()
//                .filter(i ->i.endsWith("a"))
//                .forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Orange");
        map.put(3, "Banana");
        map.put(4, "Mango");

        map.entrySet()
                .stream()
                .filter(i -> i.getKey() % 2 == 0)
                .forEach(System.out::println);
    }
}
