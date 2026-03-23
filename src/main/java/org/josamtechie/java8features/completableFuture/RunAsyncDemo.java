package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunAsyncDemo
{
    // ✅ Used for background tasks like logging, sending emails, etc.
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        runnableWithoutCustomExecutor();
        runnableWithCustomExecutor();
    }

    public static void runnableWithoutCustomExecutor(){
        // CompletableFuture Runnable will get thread from ForkJoinPool
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
        });
        // future.get();
        future.join();// wait for completion
        System.out.println("Main thread finished");
    }

    public static void runnableWithCustomExecutor() throws ExecutionException, InterruptedException
    {
        ExecutorService executors = Executors.newFixedThreadPool(5);
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
        },executors);
        // future.get();
        future.join();// wait for completion
        System.out.println("Main thread finished");
        executors.shutdown();
    }
}
