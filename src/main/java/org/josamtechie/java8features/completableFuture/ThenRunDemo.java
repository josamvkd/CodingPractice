package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class ThenRunDemo
{
    public static void main(String[] args)
    {
        CompletableFuture<Void> future =
                CompletableFuture.supplyAsync(() ->{
                    System.out.println("Thread Name1 : "+Thread.currentThread().getName());
                    return "Task Completed";
                }).thenRun(() -> {
                    System.out.println("Thread Name2 : "+Thread.currentThread().getName());
                    System.out.println("Next task executed");
                });
        future.join();
    }
}
