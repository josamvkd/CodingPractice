package org.josamtechie.java11features;

public class StripVsTrim
{
    public static void main(String[] args)
    {
        String str = "\u2003Hello\u2003"; // \u2003 = EM SPACE (Unicode whitespace)
        // ASCII only
        System.out.println("[" + str.trim() + "]");// [ Hello ]   // NOT removed
        // Unicode-aware
        System.out.println("[" + str.strip() + "]"); // [Hello]   // removed correctly

        //  Removes ALL Unicode whitespace
        //  ✅ Handles spaces like:
        //  EM SPACE (\u2003)
        //  EN SPACE (\u2002)
        //  Non-breaking space (\u00A0)
        //  etc.

        // Feature	            trim()	                strip() (Java 11+)
        // ----------------------------------------------------------------------
        // Java Version	        Since Java 1.0	        Java 11
        // Whitespace Type	    ASCII only	            Unicode-aware
        // Uses	                Hardcoded ≤ U+0020	    Character.isWhitespace()
        // Unicode Support	    ❌ No	                ✅ Yes
        // Recommendation	    Avoid for modern apps	✅ Use this
        // "\u2003Hello\u2003"
    }
}
