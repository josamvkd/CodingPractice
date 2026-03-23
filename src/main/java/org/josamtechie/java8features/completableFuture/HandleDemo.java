package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class HandleDemo
{
    public static void main(String[] args)
    {
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> {
                            System.out.println("Thread1 : " + Thread.currentThread().getName());
                            return 10 / 0;
                        })
                        .handle((result, ex) -> {
                            System.out.println("Thread2 : " + Thread.currentThread().getName());
                            if (ex != null) {
                                System.out.println("Exception : " + ex.getMessage());
                                return 0;
                            }
                            return result;
                        });
        System.out.println("Final Result : " + future.join());

        System.out.println("==========================================");
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
                    System.out.println("Thread3 : " + Thread.currentThread().getName());
                    return 20;
                })
                .handleAsync((res, ex) -> {
                    System.out.println("Thread4 : " + Thread.currentThread().getName());
                    if (ex == null) {
                        return res * 2;
                    } else {
                        return 0;
                    }
                });
        System.out.println(future1.join());//40
    }
}
