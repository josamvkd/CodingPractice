package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SupplyAsyncDemo
{
    // ✅ Used when async task produces a result
    public static void main(String[] args)
    {
        supplyAsyncWithoutCustomExecutor();
        supplyAsyncWithCustomExecutor();
    }
    public static void supplyAsyncWithoutCustomExecutor(){
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            return "supplyAsync task";
        });
        String result = future.join();
        System.out.println(result);
    }

    public static void supplyAsyncWithCustomExecutor(){
        ExecutorService service = Executors.newFixedThreadPool(10);
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            return "supplyAsync task";
        }, service);
        String result = future.join();
        System.out.println(result);
        service.shutdown();
    }

}
