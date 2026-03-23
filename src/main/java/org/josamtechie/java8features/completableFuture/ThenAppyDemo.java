package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class ThenAppyDemo
{
    public static void main(String[] args)
    {
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("Thread Name : "+Thread.currentThread().getName());
            return 10;
        }).thenApply(num -> num * 2);
        System.out.println(future.join());
    }
}
