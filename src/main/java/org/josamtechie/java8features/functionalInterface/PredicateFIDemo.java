package org.josamtechie.java8features.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//public class PredicateFIDemo implements Predicate<Integer>
public class PredicateFIDemo
{
//    @Override
//    public boolean test(Integer i)
//    {
//        return i%2==0;
//    }

    public static void main(String[] args)
    {
        //Predicate<Integer> p = i -> i%2==0;
        //System.out.println(p.test(7));

        List<Integer> list = Arrays.asList(5,7,2,4,6);
        list.stream().filter(i -> i%2==0).forEach(System.out::println);
    }
}
