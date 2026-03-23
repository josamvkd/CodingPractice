package org.josamtechie.java8features.dateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDemo
{
    public static void main(String[] args)
    {

        ZonedDateTime dubaiTime = ZonedDateTime.now(ZoneId.of("Asia/Dubai"));
        System.out.println("Dubai Time: " + dubaiTime);

        ZonedDateTime indianTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Indian Time: " + indianTime);

        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York Time: " + newYorkTime);


    }
}
