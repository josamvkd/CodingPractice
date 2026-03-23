package org.josamtechie.java8features.stream.ExceptionHandling.CustomFunctionalInterface;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class StreamFileReadExample
{
    // Creating a Custom Functional Interface for Checked Exceptions
    // Streams don't allow checked exceptions, so we wrap them.
    // Lambda cannot throw checked exceptions.
    // ✅ Useful for IO operations
    // ✅ Maintains stream readability
    public static void main(String[] args)
    {
        List<Path> files = Arrays.asList(
                Paths.get("src/main/java/org/josamtechie/java8features/stream/ExceptionHandling/CustomFunctionalInterface/file1.txt"),
                Paths.get("src/main/java/org/josamtechie/java8features/stream/ExceptionHandling/CustomFunctionalInterface/file2.txt"),
                Paths.get("src/main/java/org/josamtechie/java8features/stream/ExceptionHandling/CustomFunctionalInterface/file3.txt")
        );

        files.stream()
                .map(FunctionWrapper.wrap(
                        file -> new String(Files.readAllBytes(file))
                ))
                .forEach(System.out::println);
    }
}
