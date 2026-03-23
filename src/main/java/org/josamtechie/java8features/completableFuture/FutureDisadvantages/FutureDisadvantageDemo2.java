package org.josamtechie.java8features.completableFuture.FutureDisadvantages;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDisadvantageDemo2
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        // Future Disadvantages
        // 3. We cannot combine multiple future together
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future1 = service.submit(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            return Arrays.asList(1, 5, 4, 2, 3);
        });

        Future<List<Integer>> future2 = service.submit(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            return Arrays.asList(6, 3, 4, 1, 5);
        });

        Future<List<Integer>> future3 = service.submit(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            return Arrays.asList(8, 3, 4, 2, 1);
        });

        // We can run the futures separately like
        List<Integer> list1 = future1.get();
        List<Integer> list2 = future2.get();
        List<Integer> list3 = future3.get();
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        // There is no method to join the futures together
        //future1.future2.future3;
        //future1+future2+future3;

        service.shutdown();
    }
}
