package org.josamtechie.java16features.records;

public record User(String username, String email)
{
    // Compact Constructor (Validation)
    // Use Case: Input Validation
    // 👉 No need to assign fields manually—handled automatically.
    public User
    {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
    }

}
