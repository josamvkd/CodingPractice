package org.josamtechie.java16features;

public class PatternMatchingFinalizedDemo
{
    public static void main(String[] args)
    {
        // Simplifies type casting after instanceof.
        Object obj = "Hello from Java 16";
        // ✅ Before
        if(obj instanceof String){
            String str = (String) obj;
            System.out.println(str.toUpperCase());
        }
        System.out.println("==========");
        // ✅ Java 16
        // 👉 No explicit casting required.
        if (obj instanceof String s){
            System.out.println(s.toUpperCase());
        }
    }
}
