package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class AnyOfDemo
{
    // ✅ Used for fastest API response strategy
    public static void main(String[] args)
    {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread1 : " + Thread.currentThread().getName());
            delayTime(2000);
            return "API 1";
        });
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread2 : " + Thread.currentThread().getName());
            delayTime(1000);
            return "API 2";
        });
        CompletableFuture<String> f3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread3 : " + Thread.currentThread().getName());
            delayTime(3000);
            return "API 3";
        });
        CompletableFuture<Object> first = CompletableFuture.anyOf(f1, f2, f3);
        System.out.println("First Response: " + first.join());
    }

    static void delayTime(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
