package org.josamtechie.java8features.stream.ExceptionHandling.UsingOptional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample
{
    // Using Optional to Avoid Exceptions
    // ✅ Functional style
    // ✅ No exception propagation
    public static void main(String[] args)
    {
        List<String> numbers = Arrays.asList("10", "20", "abc", "40");
        numbers.stream()
                .map(OptionalExample::parse)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }

    public static Optional<Integer> parse(String num){
        try {
            return Optional.of(Integer.parseInt(num));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
