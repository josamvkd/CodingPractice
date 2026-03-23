package org.josamtechie.java14features;

public class NPEEnhancementDemo
{
    public static void main(String[] args)
    {
        // NullPointerException (JVM Improvement)
        // More descriptive error messages.
        String str = null;
        System.out.println(str.length()); // Cannot invoke "String.length()" because "str" is null

    }
}
