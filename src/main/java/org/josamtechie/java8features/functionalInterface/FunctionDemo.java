package org.josamtechie.java8features.functionalInterface;

import java.util.function.Function;

public class FunctionDemo
{
    public static void main(String[] args)
    {
       /*
            @FunctionalInterface
            public interface Function<T, R> {
                R apply(T t);
            }
        */

        //T → Input type
        //R → Return type
        //apply() → Method that performs the operation

        //Function<String, Integer> length = s -> s.length();
        Function<String, Integer> length = String::length;
        System.out.println(length.apply("Java"));

    }
}
