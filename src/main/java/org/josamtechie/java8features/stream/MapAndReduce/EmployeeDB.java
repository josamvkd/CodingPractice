package org.josamtechie.java8features.stream.MapAndReduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB
{
    public static List<Employee> getEmployees() {
        return Stream.of(
                new Employee(101, "John", "B", 18000.0),
                new Employee(102, "Sarah", "A", 25050.0),
                new Employee(103, "David", "A", 22300.0),
                new Employee(104, "Michael", "B", 17000.0),
                new Employee(105, "Emma", "A", 21500.0)
        ).collect(Collectors.toList());
    }
}
