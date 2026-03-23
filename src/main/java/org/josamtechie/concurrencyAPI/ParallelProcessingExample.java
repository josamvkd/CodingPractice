package org.josamtechie.concurrencyAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelProcessingExample
{
    // Very Common Interview Question
    // Difference: execute() vs submit()

    // execute()	            submit()
    // From Executor interface	From ExecutorService
    // No return value	        Returns Future
    // Cannot track result	    Can track result

    // Parallel Tasks
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 3; i++) {
            int taskId = i;
            executor.submit(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                //System.out.println("Task " + taskId + " completed by " + Thread.currentThread().getName());
                System.out.println(STR."Task \{taskId} completed by \{Thread.currentThread().getName()}");
            });
        }
        executor.shutdown();
    }
}
