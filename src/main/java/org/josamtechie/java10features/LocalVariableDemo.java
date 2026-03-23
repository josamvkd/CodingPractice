package org.josamtechie.java10features;

import java.util.List;

public class LocalVariableDemo
{
    //  ✅ Rules:
    //  Only for local variables
    //  Must be initialized at declaration
    //  Cannot be used for method parameters or return types
    public static void main(String[] args)
    {
        var name ="Jomon"; // String
        var age = 35; // int
        var list = List.of(1,2,3,4,5);
        System.out.println(name);
        System.out.println(age);
        System.out.println(list);
        System.out.println(name+" : "+name.getClass());

        System.out.println("========================");
        var employees = List.of("Jomon","Anu","Eiden");
        for(var emp: employees){
            System.out.println(emp);
        }
        // ❌ Invalid:
        // var x;          // Compilation error
        // var y = null;   // Cannot infer type
    }
}
