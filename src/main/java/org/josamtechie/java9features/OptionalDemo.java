package org.josamtechie.java9features;

import java.util.Optional;

public class OptionalDemo
{
    // Optional API Improvements
    // New Methods:
    // ifPresentOrElse()
    // or()
    // stream()
    public static void main(String[] args)
    {
        Optional<String> name = Optional.ofNullable(null);
        name.ifPresentOrElse(
                //val -> System.out.println(val),
                System.out::println,
                () -> System.out.println("Value Not present")
        );
    }
}
