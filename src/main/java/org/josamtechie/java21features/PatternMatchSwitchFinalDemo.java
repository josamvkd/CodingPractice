package org.josamtechie.java21features;

public class PatternMatchSwitchFinalDemo
{
    static void main()
    {
        Object obj = "Hello";
        String result = switch (obj) {
            case String s -> STR."String : \{s}";
            case Integer i -> STR."Integer : \{i}";
            case null -> "Null value";
            default -> "Unknown type";
        };
        System.out.println(result);
    }
}
