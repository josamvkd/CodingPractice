package org.josamtechie.java8features.stream.ExceptionHandling.CustomFunctionalInterface;

@FunctionalInterface
public interface CheckedFunction<T,R>
{
    R apply(T t) throws Exception;
}
