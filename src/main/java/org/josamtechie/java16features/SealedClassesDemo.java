package org.josamtechie.java16features;

sealed class Vehicle permits Car, Bike{}

final class Car extends Vehicle{}
final class Bike extends Vehicle{}
// final class Truck extends Vehicle{} // Truck' is not allowed in the sealed hierarchy
// final class Truck extends Car{} // Cannot inherit from final class
public class SealedClassesDemo
{
    // Restricts which classes can extend or implement a class/interface.
    // 👉 Ensures controlled inheritance.
}
