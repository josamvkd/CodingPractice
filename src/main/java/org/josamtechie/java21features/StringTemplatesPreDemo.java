package org.josamtechie.java21features;

public class StringTemplatesPreDemo
{
    static void main()
    {
        // Safer and more readable string interpolation
        String name ="Jomon";
        int age = 35;
        String location = "Dubai";

        String personalInfo = STR."My Name is \{name} Age \{age} and current location is \{location}";
        System.out.println(personalInfo);
        // 👉 Prevents SQL injection, improves readability
    }
}
