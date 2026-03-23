package org.josamtechie.java15features;

record Employee(int id, String name)
{
}

public class RecordsDemo
{
    // Compact way to create immutable data classes.
    //  ✅ Reduces boilerplate
    //  No need for:
    //  getters
    //  constructor
    //  equals/hashCode/toString
    public static void main(String[] args)
    {
        Employee emp = new Employee(101, "Jomon");
        System.out.println(emp.id());
        System.out.println(emp.name());
    }
}
