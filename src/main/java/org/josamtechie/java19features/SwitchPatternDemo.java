package org.josamtechie.java19features;

// Pattern Matching for switch
public class SwitchPatternDemo
{
    //  Benefit
    //  No need for multiple instanceof
    //  More readable logic
    static void main()
    {
        Object obj ="Hello";
        String result = switch (obj){
            case String s -> "String: "+s;
            case Integer i -> "Integer: "+i;
            default -> "Unknown";
        };
        System.out.println(result);
    }
}
