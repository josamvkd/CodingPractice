package org.josamtechie.java8features.stream;

import java.util.*;

public class SortDemo
{
    public static void main(String[] args)
    {
        List<Integer> list  = new ArrayList<>();
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(7);
        list.add(5);
        list.add(2);

        //Collections.sort(list);// ASC
        //Collections.reverse(list);// DESC
        //System.out.println(list);

        //list.stream().sorted().forEach(System.out::println);// ASC
        //System.out.println("---");
        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);// DESC


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Orange");
        map.put(3, "Banana");
        map.put(4, "Mango");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("***********");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("***********");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("***********");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
