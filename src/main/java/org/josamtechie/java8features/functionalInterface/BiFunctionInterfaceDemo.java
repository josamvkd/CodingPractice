package org.josamtechie.java8features.functionalInterface;

import java.util.function.BiFunction;

//  ✅ Simple way to remember
//  BiFunction → takes 2, returns one result
//  BiConsumer → takes 2, returns nothing
//  BiPredicate → takes 2, returns boolean
public class BiFunctionInterfaceDemo
{
    // BiFunction<T, U, R>
    // Takes two input arguments
    // Returns one result
    // R apply(T t, U u);
    public static void main(String[] args)
    {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        Integer result = add.apply(10,20);
        System.out.println("Sum: "+result);

        BiFunction<String, String, String> join = (fistName, lastName) ->fistName+" "+lastName;
        String fullName = join.apply("Jomon","Samuel");
        System.out.println("Full Name : "+fullName);
    }
}
