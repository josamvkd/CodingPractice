package org.josamtechie.java9features;

import java.util.stream.Stream;

public class StreamDemo
{
    // ✅ New Methods:
    // takeWhile()
    // dropWhile()
    // iterate() (with condition)
    public static void main(String[] args)
    {
        Stream.of(1, 2, 3, 4, 5, 6)
                .takeWhile(n -> n < 4)
                .forEach(System.out::println); // 1, 2, 3
        System.out.println("---------------");
        Stream.of(1, 2, 3, 4, 5, 6)
                .dropWhile(n -> n < 4)
                .forEach(System.out::println);
        System.out.println("---------------");
        Stream.iterate(1, n -> n < 5, n -> n + 1)
                .forEach(System.out::println);
    }
}
