package org.josamtechie.java16features;

public class PatternMatchingRealtimeDemo
{
    static void main()
    {
        // Real-time scenarios
        Object cashPayment =500; // Integer
        Object onlinePayment = 299.99; // Double
        Object invalidPayment = "500 AED"; //Unsupported

        check(cashPayment);
        check(onlinePayment);
        check(invalidPayment);

    }
    // Method using pattern matching for instanceof
    static void check(Object obj){
        if(obj instanceof Integer i){
            System.out.println(STR."Processing Integer amount: \{i} AED");
        } else if(obj instanceof Double i){
            System.out.println(STR."Processing Double amount: \{i} AED");
        } else {
            System.out.println(STR."Unsupported type \{obj}");
        }
    }
}
