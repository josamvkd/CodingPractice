package org.josamtechie.java8features.lamda;

@FunctionalInterface
interface Calculator
{
    //void switchOn();
    //void sum(int input);
    int add(int a, int b);
}

public class LambdaDemo
{
    public static void main(String[] args)
    {
        // Syntax =>      () -> {}
        //Calculator calculator = () -> System.out.println("Calculator is On");
        //calculator.switchOn();
        //Calculator calculator = input -> System.out.println(input);
        //calculator.sum(650);
        Calculator calculator = (a,b) -> a+b;
        System.out.println(calculator.add(10,20));
    }
}
