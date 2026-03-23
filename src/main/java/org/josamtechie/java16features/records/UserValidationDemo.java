package org.josamtechie.java16features.records;

public class UserValidationDemo
{
    // 👉 No need to assign fields manually—handled automatically.
    public static void main(String[] args)
    {
        User user = new User("", "test@gmail.com");
        User user1 = new User("test", "test123");
        User user2 = new User("test", "test@test.com");
        //System.out.println(user); // Username cannot be empty
        //System.out.println(user1); // Invalid email
        System.out.println(user2); // User[username=test, email=test@test.com]

    }
}
