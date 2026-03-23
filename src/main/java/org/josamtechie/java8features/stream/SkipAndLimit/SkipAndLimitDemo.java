package org.josamtechie.java8features.stream.SkipAndLimit;

import java.util.Arrays;
import java.util.List;

public class SkipAndLimitDemo
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                      list.stream()
                              .skip(1)
                              .limit(4)
                              .forEach(System.out::print);
    }
}
