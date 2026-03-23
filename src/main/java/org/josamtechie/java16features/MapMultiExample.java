package org.josamtechie.java16features;

import java.util.List;

public class MapMultiExample
{
    // Stream API Enhancements (mapMulti)
    // More efficient alternative to flatMap.
    // 👉 Avoids creating intermediate streams → better performance.
    public static void main(String[] args)
    {
        List<List<String>> list = List.of(
                List.of("A", "B"),
                List.of("X", "Y")
        );

        list.stream()
                .mapMulti((innerList, consumer) -> {
                    for (String s : innerList) {
                        consumer.accept(s);
                    }
                }).forEach(System.out::println);
    }
}
