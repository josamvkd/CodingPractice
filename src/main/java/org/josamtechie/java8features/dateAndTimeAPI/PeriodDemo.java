package org.josamtechie.java8features.dateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo
{
    public static void main(String[] args)
    {
        LocalDate start = LocalDate.of(2022, 5, 9);
        LocalDate end = LocalDate.now();

        Period period = Period.between(start, end);
        System.out.println("Year : " + period.getYears());
        System.out.println("Month : " + period.getMonths());
        System.out.println("Day : " + period.getDays());
    }
}
