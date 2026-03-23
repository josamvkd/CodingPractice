package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class ParallelAllOfDemo
{
    // ✅ Reduces latency from 3 seconds → 1 second by running services in parallel.
    public static void main(String[] args)
    {
        CompletableFuture<String> userService = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread1 : " + Thread.currentThread().getName());
            return getUser();
        });
        CompletableFuture<String> orderService = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread2 : " + Thread.currentThread().getName());
            return getOrder();
        });
        CompletableFuture<String> paymentService = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread3 : " + Thread.currentThread().getName());
            return getPayment();
        });
        CompletableFuture<Void> all = CompletableFuture.allOf(userService, orderService, paymentService);
        all.join();
        System.out.println(userService.join());
        System.out.println(orderService.join());
        System.out.println(paymentService.join());
    }

    static String getUser()
    {
        return "User Data";
    }

    static String getOrder()
    {
        return "Order Data";
    }

    static String getPayment()
    {
        return "Payment Data";
    }
}
