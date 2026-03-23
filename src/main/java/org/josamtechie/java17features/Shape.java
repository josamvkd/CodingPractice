package org.josamtechie.java17features;

public sealed class Shape permits Circle, Rectangle {}
final class Circle extends Shape {}
final class Rectangle extends Shape {}

// 1. Sealed Classes (Standard Feature)
// Sealed classes restrict which classes can extend or implement them.

// ✅ Why it matters
// Better control over inheritance
// Useful for domain modeling (like enums but more flexible)

// 👉 Only Circle and Rectangle can extend Shape.

sealed interface Vehicle permits Car, Bike {}
final class Car implements Vehicle {}
final class Bike implements Vehicle {}