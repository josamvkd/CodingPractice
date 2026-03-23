package org.josamtechie.java9features;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodsDemo
{
    // ✅ Create immutable collections easily
    // ⚠️ Immutable → No add/remove allowed
    public static void main(String[] args)
    {
        List<String> list = List.of("Java","Python","C++");
        Set<Integer> set = Set.of(1,2,3);
        Map<String, Integer> map = Map.of("Jomon",101, "Anu",102,"Eiden",103);
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
