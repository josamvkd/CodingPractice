package org.josamtechie.java8features.dateAndTimeAPI;

import java.time.LocalDateTime;

public class LocalDateTimeDemo
{
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now : "+now);

        LocalDateTime specificDateTime = LocalDateTime.of(2024,12,24,10,44);
        System.out.println("Specific: "+specificDateTime);
    }
}
