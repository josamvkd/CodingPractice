package org.josamtechie.java16features.records;

public record Product(Long id, String name, double price)
{
    // Custom Constructor (Full Control)
    public Product(Long id, String name, double price)
    {
        if (price < 0) throw new IllegalArgumentException("Invalid price");
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
