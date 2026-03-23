package org.josamtechie.java14features;

public class SwitchEnhancedDemo
{
    public static void main(String[] args)
    {
        int day1 = 2;
        String result1 = switch (day1) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.println(result1);

        //  Benefits:
        //  1. Cleaner code
        //  2. No fall-through bugs
        //  3. Works like an expression

        System.out.println("============");
        int day2 = 3;
        String result2 = switch (day2) {
            case 1:
                yield "Monday";
            case 2:
                yield "Tuesday";
            case 3:
                yield "Wednesday";
            case 4:
                yield "Thursday";
            case 5:
                yield "Friday";
            case 6:
                yield "Saturday";
            case 7:
                yield "Sunday";
            default:
                yield "Invalid";
        };
        System.out.println(result2);
    }
}
