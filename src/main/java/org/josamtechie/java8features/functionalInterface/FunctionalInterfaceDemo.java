package org.josamtechie.java8features.functionalInterface;


@FunctionalInterface
public interface FunctionalInterfaceDemo
{
    public abstract void m1();
    default void m2(){
        System.out.println("Default method-1");
    }
    default void m3(){
        System.out.println("Default method-2");
    }

    static void m4(){
        System.out.println("Static method-1");
    }
    static void m5(){
        System.out.println("Static method-2");
    }
}
