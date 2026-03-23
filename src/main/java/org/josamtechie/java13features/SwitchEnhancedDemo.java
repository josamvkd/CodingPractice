package org.josamtechie.java13features;

public class SwitchEnhancedDemo
{
    public static void main(String[] args)
    {
        int day = 4;
        String result = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekdays";
            case 6, 7 -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day");
        };
        System.out.println(result);

        //  Key Enhancements
        //  No need for break
        //  Supports returning values
        //  Multiple labels (case 1,2,3)
    }
}
