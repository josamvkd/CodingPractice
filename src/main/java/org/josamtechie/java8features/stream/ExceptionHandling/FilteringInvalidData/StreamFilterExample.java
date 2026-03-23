package org.josamtechie.java8features.stream.ExceptionHandling.FilteringInvalidData;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample
{
    // Filtering Invalid Data Before Processing
    // Sometimes it's better to avoid exceptions altogether.
    // ✅ Best performance
    // ✅ Functional style
    public static void main(String[] args)
    {
        List<String> numbers = Arrays.asList("10", "20", "abc", "30");
        numbers.stream()
                .filter(num -> num.matches("\\d+"))
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
