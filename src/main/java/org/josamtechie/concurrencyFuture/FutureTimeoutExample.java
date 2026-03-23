package org.josamtechie.concurrencyFuture;

import java.util.concurrent.*;

public class FutureTimeoutExample
{
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException
    {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            Thread.sleep(5000);
            return "Task Completed!!";
        };
        Future<String> future = executor.submit(task);

        try {
            String result = future.get(2, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (TimeoutException e) {
            System.out.println("Task took too long!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
