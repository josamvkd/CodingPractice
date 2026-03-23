package org.josamtechie.java14features;

record Employee(int id, String name)
{
}

public class RecordsDemo
{
    public static void main(String[] args)
    {
        // Compact way to create immutable data classes.
        Employee employee = new Employee(101, "Jomon");
        System.out.println(employee.id());
        System.out.println(employee.name());

        // 💡 Automatically generates:
        //  Constructor
        //  Getters
        //  equals(), hashCode(), toString()
    }
}
