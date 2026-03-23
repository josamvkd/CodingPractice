package org.josamtechie.java18features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class UTF8Demo
{
    public static void main(String[] args) throws IOException
    {
        // UTF-8 by Default (Important Change)
        // 👉 JEP 400
        // Java 18 makes UTF-8 the default charset across all platforms.
        // ✅ Before:
        // Charset depended on OS (Windows → Cp1252, Linux → UTF-8)
        // ✅ Now:
        // Always UTF-8 → consistent behavior
        String content = "Hello 😊";
        Files.writeString(Path.of("test.txt"), content);
        String read = Files.readString(Path.of("test.txt"));
        System.out.println(read);

        // 👉 No need to explicitly specify charset anymore.
    }
}
