package org.josamtechie.concurrencyAPI;

import java.util.concurrent.*;

public class ExecutorServiceDemo
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        // ExecutorService in Java is part of the Java Concurrency API that helps manage and control threads efficiently.
        // Instead of manually creating and managing threads, ExecutorService uses a thread pool to execute tasks asynchronously.
        //It is widely used in enterprise applications for parallel processing, background tasks, and asynchronous execution.

        // 1. Why ExecutorService?
        //  Problems with creating threads manually:
        //  Creating many threads is expensive
        //  Hard to manage lifecycle
        //  No easy way to reuse threads
        //  ExecutorService solves this by:
        //  Maintaining a thread pool
        //  Reusing threads
        //  Providing methods like submit(), shutdown(), invokeAll()

        //  Method	                    Description
        //  --------------------------  ----------------------------
        //  newFixedThreadPool(n)	    Fixed number of threads
        //  newCachedThreadPool()	    Creates threads dynamically
        //  newSingleThreadExecutor()	Single worker thread
        //  newScheduledThreadPool()	For scheduled tasks

        // Runnable Task
        ExecutorService executorRunnable = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executorRunnable.execute(() -> {
                System.out.println(" Executing Task " + taskId +
                        " by " + Thread.currentThread().getName());
            });
        }
        executorRunnable.shutdown();

        // Example with Callable (Return Value)
        // Callable allows returning a value unlike Runnable.
        // Callable → returns value
        // Future → holds the result
        ExecutorService executorCallable = Executors.newFixedThreadPool(2);
        Callable<Integer> task = () -> {
            return 10 + 20;
        };

        Future<Integer> future = executorCallable.submit(task);
        System.out.println("Result : "+future.get());
        executorCallable.shutdown();

        // ExecutorService Lifecycle => Create → Submit Tasks → Shutdown

    }
}
