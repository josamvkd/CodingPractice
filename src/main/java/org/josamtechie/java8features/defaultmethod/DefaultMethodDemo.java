package org.josamtechie.java8features.defaultmethod;

interface Vehicle
{
    default void start()
    {
        System.out.println("Vehicle starting...");
    }
}

public class DefaultMethodDemo implements Vehicle
{
    public static void main(String[] args)
    {
        Vehicle v = new DefaultMethodDemo();
        v.start();
    }
}
