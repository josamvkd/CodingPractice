package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class ThenAcceptDemo
{
    public static void main(String[] args)
    {
        CompletableFuture<Void> future =
                CompletableFuture.supplyAsync(() -> {
                            System.out.println("Thread Name : " + Thread.currentThread().getName());
                            return "Java";
                        })
                        .thenAccept(result -> {
                            System.out.println("Result : " + result);
                        });
        future.join();
    }
}

