package org.josamtechie.java8features.functionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//  ✅ Simple way to remember
//  BiFunction → takes 2, returns one result
//  BiConsumer → takes 2, returns nothing
//  BiPredicate → takes 2, returns boolean
public class BiConsumerInterfaceDemo
{
    // BiConsumer<T, U>
    // Takes two input arguments
    // Does not return anything
    // void accept(T t, U u);
    public static void main(String[] args)
    {
        BiConsumer<String, Double> employee = (name, salary) -> System.out.println(name+" : "+salary);
        employee.accept("Jomon",30000.0);
        employee.accept("Anu",25000.0);

        System.out.println("-------------------------");
        // Common Use Case
        // Often used with Map iteration.
        Map<Integer, String> map = new HashMap<>();
        map.put(101,"Jomon");
        map.put(102,"Anu");
        map.put(103,"Eiden");

        map.forEach((id,name) -> System.out.println(id+" : "+name));
    }
}
