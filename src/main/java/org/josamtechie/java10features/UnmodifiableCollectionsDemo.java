package org.josamtechie.java10features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UnmodifiableCollectionsDemo
{
    public static void main(String[] args)
    {
        // List.copyOf, Set.copyOf, Map.copyOf
        // Creates immutable copies of collections.

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        var unmodifiableList = List.copyOf(list);
        //unmodifiableList.add("C"); // Throws UnsupportedOperationException
        System.out.println(unmodifiableList);


        Map<Integer, String> map = Map.of(1, "One", 2, "Two");
        var newMap = Map.copyOf(map);
        //newMap.put(3,"Three"); // Throws UnsupportedOperationException
        System.out.println(newMap);
    }
}
