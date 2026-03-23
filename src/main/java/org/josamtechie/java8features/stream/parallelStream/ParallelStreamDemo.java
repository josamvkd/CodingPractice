package org.josamtechie.java8features.stream.parallelStream;

import java.util.stream.IntStream;

public class ParallelStreamDemo
{
    public static void main(String[] args)
    {
        long start =0;
        long end =0;
//
//        start = System.currentTimeMillis();
//        IntStream.range(1,100).forEach(System.out::println);
//        end =System.currentTimeMillis();
//        System.out.println("Plain stream total time taken : "+(end-start)+"ms");
//
//        start = System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach(System.out::println);
//        end =System.currentTimeMillis();
//        System.out.println("Parallel stream total time taken : "+(end-start)+"ms");

//        IntStream.range(1,10).forEach(x->{
//            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
//        });
//
//        IntStream.range(1,10).parallel().forEach(x->{
//            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
//        });

        start = System.currentTimeMillis();
       double avgSalaryNormalStream = EmployeeDB.getEmployees()
                .stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        end =System.currentTimeMillis();
        System.out.println("Plain stream total time taken : "+(end-start)+"ms : Avg Salary Normal Stream : "+avgSalaryNormalStream);

        start = System.currentTimeMillis();
        double avgSalaryParallelStream = EmployeeDB.getEmployees()
                .parallelStream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        end =System.currentTimeMillis();
        System.out.println("Parallel stream total time taken : "+(end-start)+"ms : Avg Salary Parallel Stream : "+avgSalaryParallelStream);
    }
}
