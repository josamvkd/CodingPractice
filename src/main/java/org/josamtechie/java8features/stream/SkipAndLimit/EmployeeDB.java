package org.josamtechie.java8features.stream.SkipAndLimit;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeDB
{
    public static List<Employee> getAllEmployee()
    {
        return Stream.of(
                new Employee(1, "John", 50000),
                new Employee(2, "David", 60000),
                new Employee(3, "Smith", 55000),
                new Employee(4, "Chris", 70000),
                new Employee(5, "Daniel", 65000),
                new Employee(6, "James", 72000),
                new Employee(7, "Scott", 48000))
                .toList();
    }
}
