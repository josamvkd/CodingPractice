package org.josamtechie.concurrencyFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCancelExample
{
    public static void main(String[] args) throws Exception
    {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> {
            Thread.sleep(5000);
            return "Task Completed";
        };

        Future<String> future = executor.submit(task);
        Thread.sleep(1000);
        boolean cancelled = future.cancel(true);
        System.out.println("Cancelled: " + cancelled);
        System.out.println("Is Cancelled: " + future.isCancelled());
        executor.shutdown();

        //  Future Limitation (Important Interview Point)
        //  Traditional Future has limitations:
        //  Cannot chain multiple tasks
        //  Cannot combine results
        //  Blocking get()
        //  No async callbacks
        //  Because of these limitations Java 8 introduced
        //  CompletableFuture which supports non-blocking async programming.

        //  Callable vs Runnable (Interview Difference)
        //  Feature	            Runnable	                        Callable
        //  Return value	    ❌ No	                            ✅ Yes
        //  Exception	        ❌ Cannot throw checked exception	✅ Can throw
        //  Used with Future	❌ No	                            ✅ Yes
    }
}
