package org.josamtechie.java8features.dateAndTimeAPI;

import java.time.LocalTime;

public class LocalTimeDemo
{
    public static void main(String[] args)
    {
        LocalTime now = LocalTime.now();
        System.out.println("Current Time : " + now);

        LocalTime customTime = LocalTime.of(14, 30, 16);
        System.out.println("Custom time : " + customTime);
    }
}
