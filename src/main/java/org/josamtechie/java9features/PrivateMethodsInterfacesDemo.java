package org.josamtechie.java9features;

interface MyInterface
{
    default void method1()
    {
        System.out.println("Inside method1");
        common();
    }

    default void method2()
    {
        System.out.println("Inside method2");
        common();
    }

    private void common()
    {
        System.out.println("Common logic");
    }
}

public class PrivateMethodsInterfacesDemo implements MyInterface
{
    // Private Methods in Interfaces
    // ✅ Purpose
    // Avoid code duplication inside interfaces
    public static void main(String[] args)
    {
        PrivateMethodsInterfacesDemo obj = new PrivateMethodsInterfacesDemo();
        obj.method1();
        System.out.println("--------");
        obj.method2();
    }
}
