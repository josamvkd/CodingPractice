package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class ExceptionallyDemo
{
    // ✅ Used for fallback logic
    public static void main(String[] args)
    {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
                    int x = 10 / 0;
                    return x;
                })
                .exceptionally(ex -> {
                    System.out.println("Exception occurred: " + ex.getMessage());
                    return 0;
                });
        System.out.println("Result : " + future.join());
    }
}
