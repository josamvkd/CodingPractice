package org.josamtechie.java21features.vt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PlatformThreadDemo
{
    //  ❌ Problem
    //  Limited threads (10)
    //  Requests wait in queue
    //  Poor scalability under heavy load
    static void main()
    {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 50; i++) {
            int taskId = i;
            executor.submit(() -> processRequest(taskId));
        }
        executor.shutdown();
    }

    private static void processRequest(int taskId)
    {
        //System.out.println("Processing request "+taskId+" by "+Thread.currentThread());
        System.out.println(STR."Processing request \{taskId} by \{Thread.currentThread().getName()}");
        try {
            Thread.sleep(2000); // // Simulating API call
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(STR."Completed request \{taskId}");
    }
}
