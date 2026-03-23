package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class ThenCombineDemo
{
    // thenCombine() (Independent Tasks)
    // ✅ Used when two async tasks are independent
    public static void main(String[] args)
    {
        CompletableFuture<Integer> future1 =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("Thread1 : " + Thread.currentThread().getName());
                    return 10;
                });
        CompletableFuture<Integer> future2 =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("Thread2 : " + Thread.currentThread().getName());
                    return 20;
                });
        CompletableFuture<Integer> result =
                future1.thenCombine(future2, (a, b) -> {
                    System.out.println("Thread3 : " + Thread.currentThread().getName());
                    return a + b;
                });
        System.out.println("Sum : " + result.join());
    }
}
