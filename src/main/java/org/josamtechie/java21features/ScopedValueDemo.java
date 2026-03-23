package org.josamtechie.java21features;

// Alternative to ThreadLocal (better performance & safety)
//public class ScopedValueDemo {
//    static final ScopedValue<String> USER = ScopedValue.newInstance();
//
//    public static void main(String[] args) {
//        ScopedValue.runWhere(USER, "Jomon", () -> {
//            System.out.println("User: " + USER.get());
//        });
//    }
//}
// 👉 Ideal for request context in concurrent apps