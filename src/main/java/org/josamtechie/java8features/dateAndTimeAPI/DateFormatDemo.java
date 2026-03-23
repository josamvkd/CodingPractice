package org.josamtechie.java8features.dateAndTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatDemo
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatedDate = today.format(formatter);
        System.out.println("Formated Date : "+formatedDate);

        LocalDate parseDate = LocalDate.parse("19-03-2026", formatter);
        System.out.println("Parsed Date : "+parseDate);
    }
}
