package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThenApplyAsyncDemo
{
    public static void main(String[] args)
    {
        // Without Custom Executor
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() ->{
                    System.out.println("Thread1 : "+Thread.currentThread().getName());
                    return 10;
                }).thenApplyAsync(profit ->{
                    System.out.println("Thread2 : "+Thread.currentThread().getName());
                    return profit*2;
                });
        System.out.println(future.join());

        System.out.println("-----------------------------------------------------");
        // Without Custom Executor
        ExecutorService service = Executors.newFixedThreadPool(2);
        CompletableFuture<Integer> future1 =
                CompletableFuture.supplyAsync(() ->{
                    System.out.println("Thread1 : "+Thread.currentThread().getName());
                    return 10;
                },service).thenApplyAsync(profit ->{
                    System.out.println("Thread2 : "+Thread.currentThread().getName());
                    return profit*2;
                },service);
        System.out.println(future1.join());
        service.shutdown();
    }
}
