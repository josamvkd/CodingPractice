package org.josamtechie.java20features;

public class PatternMatSwitch4thPreDemo
{
    static void main()
    {
        //Object obj = "Hello";
        Object obj = 25;
        String result = switch (obj) {
            case String s -> "String : " + s;
            case Integer i -> "Integer :" + i;
            default -> "Unknown";
        };
        System.out.println(result);
    }
}
