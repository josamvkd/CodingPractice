package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class ThenComposeDemo
{
    public static void main(String[] args)
    {
        // Flow
        // Task1 → result → Task2(result)
        // thenCompose() (Dependent Tasks)
        // ✅ Used when second task depends on first result
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("Thread1 : " + Thread.currentThread().getName());
                    return 10;
                }).thenCompose(num ->
                        CompletableFuture.supplyAsync(() -> {
                            System.out.println("Thread2 : " + Thread.currentThread().getName());
                            return num * 2;
                        }));
        System.out.println("Result : " + future.join());
    }
}
