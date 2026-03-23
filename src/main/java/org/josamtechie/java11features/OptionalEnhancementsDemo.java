package org.josamtechie.java11features;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalEnhancementsDemo
{
    public static void main(String[] args)
    {
        // ✅ isEmpty()
        Optional<String> opt = Optional.empty();
        System.out.println(opt.isEmpty());// true
        System.out.println("===========");
        // ✅ Predicate not() Method
        List<String> list = List.of("", "java", "C#", "", "Go");
        list.stream()
                .filter(Predicate.not(String::isEmpty))
                .forEach(System.out::println);
    }
}
