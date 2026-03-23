package org.josamtechie.java21features.vt;

import java.util.concurrent.Executors;

// Real-World Architecture Example
public class OrderController
{
    //  🧠 When to Use Virtual Threads
    //  ✅ Use when:
    //  High concurrency (1000s of users)
    //  I/O-bound workloads
    //  Microservices / APIs
    //  Blocking operations
    //  ❌ Avoid when:
    //  CPU-intensive tasks (use parallel streams or ForkJoinPool)
    //  Tight low-level thread control needed
    static void main()
    {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 1; i <= 100; i++) {
                int orderId = i;
                executor.submit(() -> {
                    callPaymentService(orderId);
                    callInventoryService(orderId);
                });
            }
        }
    }


    private static void callPaymentService(int orderId)
    {
        simulateDelay();
        System.out.println(STR."Payment completed for order \{orderId}");
    }

    private static void callInventoryService(int orderId)
    {
        simulateDelay();
        System.out.println(STR."Inventory updated for order \{orderId}");
    }

    private static void simulateDelay()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
