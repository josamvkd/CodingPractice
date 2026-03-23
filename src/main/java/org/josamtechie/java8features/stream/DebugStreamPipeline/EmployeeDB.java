package org.josamtechie.java8features.stream.DebugStreamPipeline;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB
{
    public static List<Employee> getEmployee() {
        return Stream.of(
                new Employee(101, "John", "DEV", 25000.0),
                new Employee(102, "David", "QA", 22000.0),
                new Employee(103, "Michael", "DEV", 27000.0),
                new Employee(104, "Sarah", "HR", 20000.0),
                new Employee(105, "Daniel", "DEV", 30000.0),
                new Employee(106, "Emma", "QA", 23000.0),
                new Employee(107, "James", "DEV", 28000.0),
                new Employee(108, "Olivia", "BA", 26000.0),
                new Employee(109, "William", "DEV", 31000.0),
                new Employee(110, "Sophia", "HR", 24000.0)
        ).collect(Collectors.toList());
    }
}
