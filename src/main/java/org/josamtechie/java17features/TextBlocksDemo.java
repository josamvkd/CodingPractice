package org.josamtechie.java17features;

public class TextBlocksDemo
{
    // Multi-line string support (introduced earlier but heavily used in Java 17).
    public static void main(String[] args)
    {
        String json = """
                {
                    "username":"user123",
                    "password":"password123"
                }
                """;
        System.out.println(json);
    }
}
