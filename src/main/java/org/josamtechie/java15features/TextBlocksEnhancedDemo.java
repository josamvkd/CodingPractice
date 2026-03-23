package org.josamtechie.java15features;

public class TextBlocksEnhancedDemo
{
    public static void main(String[] args)
    {
        // Introduced earlier as preview, finalized in Java 15.
        //  ✅ What it solves
        //  Writing multi-line strings easily (JSON, SQL, HTML)
        //  Avoids \n, \", concatenation

        String json = """
                {
                    "name":"Jomon",
                    "role":"Chief Technology Officer"
                }
                """;

        System.out.println(json);
    }
}
