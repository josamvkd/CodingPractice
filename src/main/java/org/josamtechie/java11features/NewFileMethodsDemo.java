package org.josamtechie.java11features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethodsDemo
{
    public static void main(String[] args) throws IOException
    {
        // ✅ readString() & writeString()
        Path path = Path.of("test.txt");
        Files.writeString(path, "Hello  from java 11");
        String content = Files.readString(path);
        System.out.println(content);
    }
}
