package org.josamtechie.java14features;

public class TextBlockDemo2
{
    // 💡 Benefits:
    //  No escape characters
    //  Cleaner JSON/XML/SQL
    public static void main(String[] args)
    {
        String json = """
                {
                    "id":101,
                    "name":"Jomon"
                }
                """;
        System.out.println(json);
    }
}
