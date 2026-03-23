package org.josamtechie.java21features.vt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class VirtualThreadDemo
{
    // 🔍 Key Observations
    //  1. Massive Concurrency
    //     You can run 100,000+ virtual threads
    //     Each request gets its own thread → simpler code
    //  2. Lightweight Threads
    //     Virtual threads are managed by JVM (not OS)
    //     Memory usage is very low (~KB vs MB)
    //  3. Ideal for I/O-bound Tasks
    //    Best suited for:
    //     REST API calls
    //     Database queries
    //     File operations
    //     Microservices communication
    static void main()
    {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 1; i <= 1000; i++) {
                int taskId = i;
                executor.submit(() -> processRequest(taskId));
            }
        }
    }

    static void processRequest(int taskId){
        System.out.println(STR."Processing request \{taskId} by \{Thread.currentThread()}");
        try {
            Thread.sleep(2000); // Simulating I/O (API call, DB, etc.)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(STR."Completed request \{taskId}");
    }
}
