package org.josamtechie.java8features.stream.ExceptionHandling.TryCatchInsideLambda;

import java.util.Arrays;
import java.util.List;

public class StreamExceptionExample
{
    public static void main(String[] args)
    {
        // Try–Catch Inside Lambda (Simple Approach)
        // The most straightforward way is to wrap the logic inside a try-catch block.
        // ✅ Simple
        // ❌ Makes lambda expressions cluttered.
        List<String> numbers = Arrays.asList("10", "20", "30", "abc", "40");

        numbers.forEach(num ->{
            try {
                int value = Integer.parseInt(num);
                System.out.println(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number: "+num);
            }
        });

    }
}
