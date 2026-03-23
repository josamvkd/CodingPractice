package org.josamtechie.java8features.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//public class SupplierFIDemo implements Supplier<String>
public class SupplierFIDemo
{
    /*@Override
    public String get()
    {
        return "Welcome";
    }*/

    public static void main(String[] args)
    {
        /*Supplier<String> s = new SupplierFIDemo();
        System.out.println(s.get());*/
        //Supplier<String> s = () -> "Hi josamtechie";
        //System.out.println(s.get());
        List<String> list = Arrays.asList("Java", "Spring Boot", "Kafka", "Mysql","RabbitMQ","AWS");
        String result = list.stream()
                .filter(i -> i.equalsIgnoreCase("Redis"))
                .findAny()
                .orElseGet(() -> "No match records");
        System.out.println(result);
    }
}
