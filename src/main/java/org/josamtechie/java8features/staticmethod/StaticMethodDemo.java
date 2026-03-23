package org.josamtechie.java8features.staticmethod;

interface MathUtil {

    static void staticMethod(){
        System.out.println("Static Method called!!");
    }
}

public class StaticMethodDemo
{
    public static void main(String[] args)
    {
        MathUtil.staticMethod();
    }
}
