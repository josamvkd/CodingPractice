package org.josamtechie.java17features;

public class SwitchPatternDemo
{
    static String formatter(Object obj)
    {
        // Pattern Matching for switch (Preview)
        // Enhances switch to support type patterns.
        return switch (obj) {
            case Integer i -> i + " -> is an Integer";
            case String s -> s + " -> is a String";
            default -> "Unknown type";
        };
    }

    public static void main(String[] args)
    {
        System.out.println(formatter("Java"));
        System.out.println(formatter(17));
        System.out.println(formatter("Spring boot")+" and Version "+formatter(4));
    }
}
