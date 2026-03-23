package org.josamtechie.java16features.records;


import java.util.List;
import java.util.stream.Stream;

public class RealTimeExample
{
    public static void main(String[] args)
    {
        Order order = new Order(101L, 15000, "PAID");

        if(order.isHighAmount()) {
            System.out.println("High value order");
        }
//        List<Order> orders = List.of(new Order(100L, 15000.0, "PAID"),
//                new Order(102L, 9000.0, "PAID"),
//                new Order(103L, 11000.0, "PAID"));
//        orders
//                .forEach(order -> {
//                    if (order.isHighAmount()) {
//                        System.out.println("High order amount : " + order.amount());
//                    } else {
//                        System.out.println("Normal order amount : " + order.amount());
//                    }
//                });
    }
}
