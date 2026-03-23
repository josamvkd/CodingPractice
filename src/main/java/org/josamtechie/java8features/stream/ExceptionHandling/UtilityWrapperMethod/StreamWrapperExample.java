package org.josamtechie.java8features.stream.ExceptionHandling.UtilityWrapperMethod;

import java.util.Arrays;
import java.util.List;

public class StreamWrapperExample
{
    // Using a Utility Wrapper Method (Clean Approach)
    // create a generic wrapper to handle exceptions.
    // ✅ Cleaner stream pipeline
    // ✅ Reusable
    public static void main(String[] args)
    {
        List<String> numbers = Arrays.asList("10", "20", "xyz", "30");
        numbers.forEach(LambdaExceptionWrapper.handleException(num -> {
        System.out.println(Integer.parseInt(num));
            }));
    }

    // Create separate class for the same for reusability
   /*static <T> Consumer<T> handleException(Consumer<T> consumer){
        return obj ->{
            try {
                consumer.accept(obj);
            } catch (Exception e) {
                System.out.println("Exception occurred: "+e);
            }
        };
    }*/
}
