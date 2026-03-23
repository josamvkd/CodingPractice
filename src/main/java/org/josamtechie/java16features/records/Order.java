package org.josamtechie.java16features.records;

public record Order(Long orderId, double amount, String status)
{
    // Use Case: Order Processing System
    public boolean isHighAmount()
    {
        return amount > 10000;
    }
}
