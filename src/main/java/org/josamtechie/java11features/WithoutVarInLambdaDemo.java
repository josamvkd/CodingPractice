package org.josamtechie.java11features;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class WithoutVarInLambdaDemo
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Java", "Python", "Go", "Dot Net", "C#");
        // ⚠️ 1. Problem Without var
        // Suppose you want to add an annotation like @NotNull:
        // ❌ This is INVALID:
        // list.forEach((@NotNull s) -> System.out.println(s));
        // Because:
        // Type is inferred (s)
        // Annotation requires explicit typing

        System.out.println("------------------@NotNull-------------------------");
        // ✅ 2. Solution Using var - With Java 11:
        list.forEach((@NotNull var s) -> System.out.println(s));
        // ✅ Now it compiles
        // ✅ Type is still inferred
        // ✅ Annotation is allowed
    }
}
