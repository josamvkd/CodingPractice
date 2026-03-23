package org.josamtechie.java8features.functionalInterface;

import java.util.Arrays;
import java.util.List;

public class ConsumerFIDemo
{
    public static void main(String[] args)
    {
        //Consumer<Integer> input = i -> System.out.println("Printing : "+i);
        //input.accept(5400);

        List<Integer> list = Arrays.asList(5,7,2,4,6);
        //list.stream().forEach(i -> System.out.println("Printing : "+i));
        list.forEach(i -> System.out.println("Printing : "+i));
    }

}
