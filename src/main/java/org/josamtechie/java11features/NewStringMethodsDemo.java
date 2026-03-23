package org.josamtechie.java11features;

public class NewStringMethodsDemo
{
    public static void main(String[] args)
    {
        // ✅ isBlank() – checks empty or whitespace
        String str = "   ";
        System.out.println(str.isBlank());// true

        System.out.println("========================");
        // ✅ lines() – converts string to stream
        String data = "Java\nPython\nGolang";
        data.lines().forEach(System.out::println);

        System.out.println("========================");
        // ✅ strip(), stripLeading(), stripTrailing()
        String str1 = "  Java  ";
        System.out.println("[" + str1.strip() + "]"); // "Java"
        System.out.println("[" + str1.stripLeading() + "]"); // "Java  "
        System.out.println("[" + str1.stripTrailing() + "]"); // "  Java"
        System.out.println("[" + str1.trim() + "]");// "Java"

        System.out.println("========================");
        // ✅ repeat(int)
        System.out.println("Hi ".repeat(4)); // Hi Hi Hi Hi
    }
}
