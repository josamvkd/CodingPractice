package org.josamtechie.java8features.stream.optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBase
{
    public static List<Customer> getAllCustomers()
    {
        return Stream.of(
                new Customer(101, "John", "john@gmail.com", Arrays.asList("971501234567", "971501234568")),
                new Customer(102, "David", "david@gmail.com", Arrays.asList("971501234569", "971501234570")),
                new Customer(103, "Michael", "michael@gmail.com", Arrays.asList("971501234571", "971501234572")),
                new Customer(104, "Sarah", "sarah@gmail.com", Arrays.asList("971501234573", "971501234574")),
                new Customer(105, "Emma", "emma@gmail.com", Arrays.asList("971501234575", "971501234576")),
                new Customer(106, "Daniel", "daniel@gmail.com", Arrays.asList("971501234577", "971501234578")),
                new Customer(107, "Sophia", "sophia@gmail.com", Arrays.asList("971501234579", "971501234580")),
                new Customer(108, "James", "james@gmail.com", Arrays.asList("971501234581", "971501234582")),
                new Customer(109, "Olivia", "olivia@gmail.com", Arrays.asList("971501234583", "971501234584")),
                new Customer(110, "Liam", "liam@gmail.com", Arrays.asList("971501234585", "971501234586"))
        ).collect(Collectors.toList());
    }
}
