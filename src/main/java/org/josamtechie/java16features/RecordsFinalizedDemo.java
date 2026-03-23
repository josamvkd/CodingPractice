package org.josamtechie.java16features;

// ✅ Before Java 16
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() { return name; }
    public int age() { return age; }
}

// ✅ Java 16 (Record)
record Employee(String name, int age) {}

public class RecordsFinalizedDemo
{
    // Records provide a concise way to create immutable data classes.
    public static void main(String[] args)
    {
        Employee emp = new Employee("Jomon",35);
        System.out.println(emp.name());
        System.out.println(emp.age());
        //  👉 Automatically generates:
        //  Constructor
        //  Getters
        //  equals(), hashCode(), toString()
    }
}
