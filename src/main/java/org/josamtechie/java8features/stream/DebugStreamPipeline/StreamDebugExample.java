package org.josamtechie.java8features.stream.DebugStreamPipeline;

import java.util.List;

public class StreamDebugExample
{
    public static void main(String[] args)
    {
        List<String> nameList = EmployeeDB.getEmployee()
                .stream()
                .filter(employee -> employee.getSalary() > 25000)
                .map(Employee::getName)
                .distinct()
                .sorted()
                .skip(0)
                .limit(3)
                .toList();
        System.out.println(nameList);
    }
}
