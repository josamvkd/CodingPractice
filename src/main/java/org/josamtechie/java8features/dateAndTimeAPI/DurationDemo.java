package org.josamtechie.java8features.dateAndTimeAPI;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo
{
    public static void main(String[] args)
    {
        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(12, 30);

        Duration duration = Duration.between(start, end);
        System.out.println("Minutes : "+duration.toMinutes());
    }
}
