package org.josamtechie.java20features;

//public class ScopedValuesDemo
//{
//    private static final ScopedValue<String> USER = ScopedValue.newInstance();
//
//    static void main()
//    {
//
//        // 👉 Alternative to ThreadLocal for sharing immutable data safely across threads.
//        // ✅ Why it matters
//        // Better performance than ThreadLocal
//        // Works well with virtual threads (Project Loom)
//        ScopedValue.where(USER, "Jomon").run(() -> {
//            System.out.println("User: " + USER.get());
//        });
//    }
//}
