package org.josamtechie.java13features;

public class TextBlocksDemo
{
    public static void main(String[] args)
    {
        // Text Blocks simplify writing multi-line strings without excessive escaping.
        // ✅ Before Java 13
        String json1 = "{\n" +
                "  \"name\": \"Jomon\",\n" +
                "  \"age\": 34\n" +
                "}";
        System.out.println(json1);

        System.out.println("===============");

        // ✅ Java 13 (Text Block)

        String json2 = """
                {
                  "name": "Jomon",
                  "age": 34
                }
                """;
        System.out.println(json2);
    }
}
