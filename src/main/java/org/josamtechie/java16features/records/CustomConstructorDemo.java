package org.josamtechie.java16features.records;

public class CustomConstructorDemo
{
    public static void main(String[] args)
    {
        Product product1 = new Product(120151L,"Mobile",5000.0);
        //Product product2 = new Product(120151L,"Mobile",-2000.0);
        System.out.println(product1); // Product[id=120151, name=Mobile, price=5000.0]
        //System.out.println(product2); // Invalid price
    }
}
