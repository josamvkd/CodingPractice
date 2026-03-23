package org.josamtechie.java11features;

import java.util.List;

public class NewCollectionMethodDemo
{
    public static void main(String[] args)
    {
        List<String> list = List.of("A", "B", "C");
        String[] arr = list.toArray(String[]::new);// toArray(IntFunction)
        for (String s : arr){
            System.out.println(s);
        }

        // String[] arr = list.toArray(String[]::new);
        // ✅ What is happening?
        // toArray(IntFunction<T[]>) is an overloaded method introduced in Java 11.
        // It takes a function that creates an array of the required size.
        // String[]::new → Constructor Reference
        // This is equivalent to => size -> new String[size]
        // So internally => arr = list.toArray(size -> new String[size]);

        // ✅ Type-safe (No casting required)
        // Old way:
        // String[] arr1 = list.toArray(new String[0]);
        // Works, but less expressive
        // Even older (unsafe):
        // String[] arr2 = (String[]) list.toArray(); // // ❌ ClassCastException risk
    }
}
