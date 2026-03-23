package org.josamtechie.java17features;

record Employee(int id, String name, double salary)
{
}

public class RecordsDemo{
    public static void main(String[] args)
    {
        Employee emp = new Employee(101,"Jomon",35000.0);
        System.out.println("Employee Id : "+emp.id());
        System.out.println("Employee Name : "+emp.name());
        System.out.println("Employee Salary : "+emp.salary());

        //  👉 Automatically generates:
        //  Constructor
        //  Getters
        //  equals(), hashCode(), toString()
    }
}

