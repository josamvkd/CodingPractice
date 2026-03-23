package org.josamtechie.java8features.stream.ExceptionHandling.UtilityWrapperMethod;

import java.util.function.Consumer;

public class LambdaExceptionWrapper {

    public static <T> Consumer<T> handleException(Consumer<T> consumer) {
        return obj -> {
            try {
                consumer.accept(obj);
            } catch (Exception e) {
                System.out.println("Exception occurred: " + obj);
            }
        };
    }
}
