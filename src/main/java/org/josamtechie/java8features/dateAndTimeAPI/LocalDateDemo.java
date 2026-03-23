package org.josamtechie.java8features.dateAndTimeAPI;

import java.time.LocalDate;

public class LocalDateDemo
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        System.out.println("Today : "+today);

        LocalDate customDate = LocalDate.of(2026,12,24);
        System.out.println("CustomDate : "+customDate);

        System.out.println("Day: "+today.getDayOfWeek());
        System.out.println("Year: "+today.getYear());
        System.out.println("Month: "+today.getMonth());
    }
}
