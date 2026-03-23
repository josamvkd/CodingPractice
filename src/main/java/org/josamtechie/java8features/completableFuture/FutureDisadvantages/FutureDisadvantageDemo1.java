package org.josamtechie.java8features.completableFuture.FutureDisadvantages;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FutureDisadvantageDemo1
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        // Future Disadvantages
        // 1. It Cannot be manually completed
        // 2. Multiple futures cannot be chained together

        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future = service.submit(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            // Assume API response taking too time
            // TimeUnit.MINUTES.sleep(1); // in this example thread is completely blocked for 1 minute
            return Arrays.asList(1, 5, 4, 2, 3);
        });

        List<Integer> list = future.get();
        // 1. future. => there is no methods available to complete the future forcefully
        // 2. future. => after getting the result there is no methods available to process result
        System.out.println(list);
        service.shutdown();
    }

}
