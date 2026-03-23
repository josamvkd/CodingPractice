package org.josamtechie.java12features;

public class SwitchExpressionsDemo
{
    public static void main(String[] args)
    {
        // ✅ Problem (Old switch)
        int day1 = 1;
        String result1;
        switch (day1) {
            case 1:
            case 2:
                result1 = "Weekday";
                break;
            case 3:
                result1 = "Midweek";
                break;
            default:
                result1 = "Weekend";
        }
        System.out.println(result1);
        System.out.println("===============");
        // ✅ New Switch Expression
        int day2 = 3;
        String result2 = switch (day2) {
            case 1, 2 -> "Weekday";
            case 3 -> "Midweek";
            default -> "Weekend";
        };
        System.out.println(result2);
        //  Key Improvements:
        //  No break needed
        //  Multiple labels (case 1,2)
        //  Returns value directly
        System.out.println("===============");
        // ✅ Using yield (for block logic)
        int day3 = 2;
        String result3 = switch (day3) {
            case 1, 2: yield "Weekday";
            case 3: yield "Midweek";
            default: yield "Weekend";
        };
        System.out.println(result3);
    }
}
