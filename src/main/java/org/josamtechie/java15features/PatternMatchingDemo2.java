package org.josamtechie.java15features;

public class PatternMatchingDemo2
{
    public static void main(String[] args)
    {
        // Simplifies type casting after instanceof.
        Object obj = "Hello from Java 15";
        //❌ Before
        if(obj instanceof String){
            String str = (String) obj;
            System.out.println(str.length());
        }
        System.out.println("==================");
        // ✅ Java 15
        if (obj instanceof String s){
            System.out.println(s.length());
        }
    }
}
