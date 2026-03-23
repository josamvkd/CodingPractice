package org.josamtechie.java19features;

record Person(String name, int age) {}

public class RecordPatternsDemo
{
    static void main()
    {
        Object obj = new Person("Jomon", 25);
        if(obj instanceof Person(String name, int age)){
            System.out.println(name+" is "+age+" years old" );
            System.out.println(STR."\{name} is \{age} years old.");
        }

        //  🔍 Benefit
        //  Eliminates boilerplate casting
        //  Cleaner destructuring
    }
}
