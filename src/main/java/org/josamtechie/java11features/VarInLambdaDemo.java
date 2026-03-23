package org.josamtechie.java11features;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class VarInLambdaDemo
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Java","Python","Go","Dot Net","C#");
        System.out.println("------------------var-------------------------");
        list.forEach((var s) -> System.out.println(s));
        System.out.println("------------------inferred-------------------------");
        // Before Java 11, lambda parameters were either:
        list.forEach(s -> System.out.println(s)); // inferred
        System.out.println("------------------explicit-------------------------");
        list.forEach((String s) -> System.out.println(s)); // explicit


    }
}
