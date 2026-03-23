package org.josamtechie.java8features.dateAndTimeAPI;

import java.time.Instant;

public class InstantDemo
{
    // ✅ Useful for logging, DB timestamps, APIs.
    public static void main(String[] args)
    {
        Instant now = Instant.now();
        System.out.println("Current Timestamp: " + now);
    }
}
