package org.josamtechie.java11features;

import java.lang.annotation.*;
import java.util.Arrays;
import java.util.List;

// Create Annotation
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface LogParam {}

public class VarInLambdaRealTimeExample
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Java", "Python", "Go");
        list.forEach((@LogParam var s) -> System.out.println("Processing : "+s));
    }

    // Important Rules

    //  1. Use var for ALL parameters or NONE
    //  ✅ Valid:
    //  (a, b) -> a + b
    //  (var a, var b) -> a + b
    //  ❌ Invalid:
    //  (var a, b) -> a + b   // compilation error

    // 2. Cannot mix var with explicit types
    //  ❌ Invalid:
    // (var a, String b) -> a + b
}
