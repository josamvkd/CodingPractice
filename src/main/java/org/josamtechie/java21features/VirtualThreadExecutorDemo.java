package org.josamtechie.java21features;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadExecutorDemo
{
    static void main()
    {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 5; i++) {
                int taskId = i;
                executor.submit(() -> {
                    //System.out.println("Task "+taskId+" Running in : "+Thread.currentThread());
                    System.out.println(STR."Thread \{taskId} Running in : \{Thread.currentThread()}");
                });
            }
        }
        // 👉 Use Case: Microservices, APIs, DB calls (I/O heavy apps)
    }
}
