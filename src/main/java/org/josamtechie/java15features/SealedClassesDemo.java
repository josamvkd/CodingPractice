package org.josamtechie.java15features;

// 👉 Only Car and Bike can extend Vehicle.
sealed class Vehicle permits Car, Bike {}
final class Car extends Vehicle{}
final class Bike extends Vehicle{}
//class Truck extends Car{} // Cannot inherit from final class

public class SealedClassesDemo
{
    public static void main(String[] args)
    {
        // Restrict which classes can extend or implement a class/interface.
        //  ✅ Use Case
        //  Better control over inheritance
        //  Useful in domain modeling
    }
}
