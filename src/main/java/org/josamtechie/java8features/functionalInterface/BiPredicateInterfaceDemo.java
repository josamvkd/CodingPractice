package org.josamtechie.java8features.functionalInterface;

import java.util.function.BiPredicate;

//  ✅ Simple way to remember
//  BiFunction → takes 2, returns one result
//  BiConsumer → takes 2, returns nothing
//  BiPredicate → takes 2, returns boolean
public class BiPredicateInterfaceDemo
{
    // BiPredicate<T, U>
    // Takes two arguments
    // Returns boolean
    // boolean test(T t, U u);
    public static void main(String[] args)
    {
        BiPredicate<Integer, Integer> validate = (a, b) -> (a + b) > 25;
        System.out.println(validate.test(15,7));
        System.out.println(validate.test(20,6));

        System.out.println("------------------------");
        // Example: Username & Password Validation
        BiPredicate<String,String> login = (username, password) ->
                username.equals("admin") && password.equals("123");
        System.out.println(login.test("admin","123"));
    }
}
