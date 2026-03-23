package org.josamtechie.java8features.completableFuture.FutureDisadvantages;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDisadvantageDemo3
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        // Future Disadvantages
        // 4. No proper exception handling mechanism
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future = service.submit(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            // Forcefully throw an arithmetic exceptions to demonstrate no exception handling mechanism available
            System.out.println(10/0);
            return Arrays.asList(1, 5, 4, 2, 3);
        });
        List<Integer> list = future.get();
        System.out.println(list);
        service.shutdown();
    }
}
