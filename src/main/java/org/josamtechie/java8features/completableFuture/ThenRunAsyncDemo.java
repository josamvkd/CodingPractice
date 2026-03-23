package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThenRunAsyncDemo
{
    public static void main(String[] args)
    {
        // Without Custom Executor
        CompletableFuture<Void> future1 =
                CompletableFuture.supplyAsync(()->{
                    System.out.println("Thread1 : "+Thread.currentThread().getName());
                    return "Task done";
                }).thenRunAsync(() ->{
                    System.out.println("Thread2 : "+Thread.currentThread().getName());
                    System.out.println("Next async task executed");
                });
        future1.join();
        System.out.println("-------------------------------------");
        // With Custom Executor
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CompletableFuture<Void> future2 =
                CompletableFuture.supplyAsync(()->{
                    System.out.println("Thread1 : "+Thread.currentThread().getName());
                    return "Task done";
                },executor).thenRunAsync(() ->{
                    System.out.println("Thread2 : "+Thread.currentThread().getName());
                    System.out.println("Next async task executed");
                },executor);
        future2.join();
        executor.shutdown();
    }
}
