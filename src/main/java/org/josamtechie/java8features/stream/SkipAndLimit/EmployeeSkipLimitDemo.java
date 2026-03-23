package org.josamtechie.java8features.stream.SkipAndLimit;

import java.util.List;

public class EmployeeSkipLimitDemo
{
    public static void main(String[] args)
    {
        List<Employee> employeeList = EmployeeDB.getAllEmployee();
        employeeList.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("===========================");

        int pageNumber = 2;
        int pageSize = 3;

        List<Employee> paginatedList = employeeList.stream()
                .skip((pageNumber - 1) * pageSize)  // skip first 3
                .limit(pageSize)                       // take next 3
                .toList();
       paginatedList.forEach(System.out::println);

    }
}
