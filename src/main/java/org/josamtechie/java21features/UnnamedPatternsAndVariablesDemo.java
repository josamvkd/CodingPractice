package org.josamtechie.java21features;

record User(String name, String role)
{
}

public class UnnamedPatternsAndVariablesDemo
{
    static void main()
    {
        User user = new User("Jomon", "Software Engineer");
        if (user instanceof User(String name, _)) {
            System.out.println(name);
        }
        // 👉 Cleaner code when some fields are irrelevant
    }
}
