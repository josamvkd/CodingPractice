package org.josamtechie.concurrencyFuture;

import java.util.concurrent.*;

public class FutureExample
{
    // In Java concurrency, a Future represents the result of an asynchronous computation.
    // It acts like a placeholder for a value that will be available later after a task finishes executing.
    // It is commonly used with thread pools via ExecutorService.

    //  Key capabilities of Future:
    //  Check if the task is completed
    //  Wait for the result
    //  Cancel the task
    //  Retrieve the result when ready

    // The interface is Future.

    // Scenario
    //  Submit a task to a thread pool and retrieve the result later.
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> task = () -> {
            System.out.println("Task started...");
            Thread.sleep(3000);
            return 10 + 20;
        };
        Future<Integer> future = executor.submit(task);
        System.out.println("Task submitted. Doing other work...");
        // get() blocks until result is available
        Integer result = future.get();
        System.out.println("Result: " + result);
        executor.shutdown();

        //  Explanation
        //  ------------
        //  1. Task is submitted to thread pool.
        //  2. Future immediately returns.
        //  3. get() waits until task finishes.
        //  4. The result is retrieved.

        // Important Future Methods
        //  Method	            Description
        //  ------------------  -------------------------
        //  get()	            Waits and returns result
        //  get(timeout, unit)	Waits for specific time
        //  isDone()	        Checks if task finished
        //  isCancelled()	    Checks if task cancelled
        //  cancel()	        Cancels the task
    }
}
