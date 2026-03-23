package org.josamtechie.java8features.stream.MapAndReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduceDemo
{
    public static void main(String[] args)
    {
        // Sum
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        // int sum1 = num.stream().mapToInt(i -> i).sum();
        int sum1 = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum : " + sum1);

        // map()
        List<String> names = Arrays.asList("jomon", "anu", "eiden");
        List<String> upperNames =
                names.stream()
                        .map(String::toUpperCase)
                        .toList();
        System.out.println(upperNames);

        //reduce()
        // Example 1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //int sum = numbers.stream().reduce(0,(a,b) -> a+b);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum : " + sum);

        // Example 2
        List<Integer> number = Arrays.asList(20, 25, 30, 41, 54, 68);
        int min = number.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.println("Min : " + min);
        int max = number.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("Max : " + max);

        //  map() + reduce() Together

        List<Integer> numbersNew = Arrays.asList(1, 2, 3, 4, 5);
        int result = numbersNew.stream()
                .map(n -> n * n) // 1, 4, 9, 16, 25
                .reduce(0, Integer::sum); //55
        System.out.println("Sum : " + result);

        List<String> word = Arrays.asList("SpringBoot", "Hibernate", "Kafka", "RabbitMQ", "Aws");

        String longestWord = word.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println("Longest Word : " + longestWord);
        String shortestWord = word.stream().reduce((w1, w2) -> w1.length() < w2.length() ? w1 : w2).get();
        System.out.println("Shortest Word : " + shortestWord);


        double avgSalary = EmployeeDB.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average().orElse(0.0);
        System.out.println("Average Salary : "+avgSalary);

        double totalSalary = EmployeeDB.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .sum();
        System.out.println("Total Salary : "+totalSalary);
    }
}
