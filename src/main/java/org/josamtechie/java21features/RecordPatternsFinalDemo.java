package org.josamtechie.java21features;

record Person(String name, int age)
{
}

public class RecordPatternsFinalDemo
{
    // Deconstruct objects directly in pattern matching
    // 👉 Clean destructuring like modern languages (Kotlin, Scala)
    static void main()
    {
        Object obj = new Person("Jomon", 35);
        if (obj instanceof Person(String name, int age)) {
            System.out.println(STR."\{name} is \{age} Years old!");
        }
    }
}
