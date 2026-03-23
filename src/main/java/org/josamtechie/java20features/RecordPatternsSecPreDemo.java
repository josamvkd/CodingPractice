package org.josamtechie.java20features;

record Person(String name, int age){}

public class RecordPatternsSecPreDemo
{
    static void main()
    {
        Object obj = new Person("Jomon",35);
        if(obj instanceof Person(String name, int age)){
            System.out.println(STR."\{name} is \{age} years old!");
        }
    }
}
