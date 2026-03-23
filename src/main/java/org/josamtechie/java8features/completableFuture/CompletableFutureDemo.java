package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo
{
    public static void main(String[] args)
    {
        // Without custom executor
        CompletableFuture.supplyAsync(() -> {
                    System.out.println("Thread1 : " + Thread.currentThread().getName());
                    return 10;
                })
                .thenApply(num -> {
                    System.out.println("Thread2 : " + Thread.currentThread().getName());
                    return num * 2;
                })
                .thenAccept(result -> {
                    System.out.println("Thread3 : " + Thread.currentThread().getName());
                    System.out.println("Final Result -> " + result);
                })
                .thenRun(() -> {
                    System.out.println("Thread4 : " + Thread.currentThread().getName());
                    System.out.println("Task chain completed");
                })
                .join();

        System.out.println("===============================================");
        // With custom executor and Async methods
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CompletableFuture.supplyAsync(() -> {
                    System.out.println("Thread1 : " + Thread.currentThread().getName());
                    return 10;
                }, executor)
                .thenApplyAsync(num -> {
                    System.out.println("Thread2 : " + Thread.currentThread().getName());
                    return num * 2;
                }, executor)
                .thenAcceptAsync(result -> {
                    System.out.println("Thread3 : " + Thread.currentThread().getName());
                    System.out.println("Final Result -> " + result);
                }, executor)
                .thenRunAsync(() -> {
                    System.out.println("Thread4 : " + Thread.currentThread().getName());
                    System.out.println("Task chain completed");
                }, executor)
                .join();
        executor.shutdown();
    }
}
