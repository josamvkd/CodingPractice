package org.josamtechie.java8features.completableFuture.CompletableFutureAdvantages;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureAdvantageDemo
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        // CompletableFuture to overcome the Disadvantages
        // 1. It can be manually completed
        // 2. Multiple futures can be chained together
        // 3. We can combine multiple future together
        // 4. There is a proper  exception handling mechanism

        ExecutorService service = Executors.newFixedThreadPool(10);
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        // Assume if theAPI response taking too time
        completableFuture.get();
        // The complete() methods available to complete the completableFuture forcefully
        completableFuture.complete("return value");

    }
}
