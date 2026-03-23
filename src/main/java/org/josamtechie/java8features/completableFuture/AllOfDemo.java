package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class AllOfDemo
{
    // ✅ Used when multiple microservices must finish
    public static void main(String[] args)
    {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread1 : " + Thread.currentThread().getName());
            return "Service1";
        });
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread2 : " + Thread.currentThread().getName());
            return "Service2";
        });
        CompletableFuture<String> f3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread3 : " + Thread.currentThread().getName());
            return "Service3";
        });
        CompletableFuture<Void> all = CompletableFuture.allOf(f1, f2, f3);
        all.join();
        System.out.println(f1.join());
        System.out.println(f2.join());
        System.out.println(f3.join());
    }
}
