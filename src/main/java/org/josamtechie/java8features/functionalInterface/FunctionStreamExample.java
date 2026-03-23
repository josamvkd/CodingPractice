package org.josamtechie.java8features.functionalInterface;

import java.util.Arrays;
import java.util.List;

public class FunctionStreamExample
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "David", "Sam");
        List<Integer> lengths = names.stream()
                .map(String::length)
                .toList();
        System.out.println(lengths);
        // map() internally uses Function.
    }
}
