package org.josamtechie.java8features.stream;

import java.util.*;

public class ForEachDemo
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

        //list.stream().forEach(i -> System.out.println(i));
        //list.stream().forEach(System.out::println);
        //list.forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Orange");
        map.put(3, "Banana");
        map.put(4, "Mango");

//        map.forEach((key,value) ->{
//            System.out.println(key+ " : "+value);
//        });
        //map.entrySet().stream().forEach(i -> System.out.println(i));
        map.entrySet().forEach(System.out::println);
    }
}
