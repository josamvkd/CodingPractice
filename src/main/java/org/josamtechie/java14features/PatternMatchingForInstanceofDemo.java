package org.josamtechie.java14features;

public class PatternMatchingForInstanceofDemo
{
    public static void main(String[] args)
    {
        Object obj = "Hello Java 14";
        // 💡 Before:
        /*  if (obj instanceof String) {
                String str = (String) obj;
            }
        */

        // ✅ No need for explicit casting after instanceof.
        if (obj instanceof String str) {
            System.out.println(str.toUpperCase());
        }


    }
}
