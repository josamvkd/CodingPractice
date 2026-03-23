package org.josamtechie.java8features.stream.ExceptionHandling.CustomFunctionalInterface;

import java.util.function.Function;

public class FunctionWrapper
{
    public static <T,R>Function<T,R> wrap(CheckedFunction<T,R> func){
            return t -> {
                try {
                    return func.apply(t);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            };
    }
}
