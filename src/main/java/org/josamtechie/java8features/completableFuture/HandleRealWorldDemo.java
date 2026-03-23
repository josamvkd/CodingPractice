package org.josamtechie.java8features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class HandleRealWorldDemo
{

    //  ✅ Used for:
    //  Fallback response
    //  Graceful degradation
    //  Circuit breaker-like behavior
    //  handle() = BiFunction (result, exception) - Both come → You decide what to return
    public static void main(String[] args) {

        CompletableFuture<Object> apiCall =
                CompletableFuture.supplyAsync(() -> {
                            throw new RuntimeException("API Down");
                        })
                        .handle((res, ex) -> {
                            if (ex != null) {
                                return "Default Response";
                            }
                            return res;
                        });

        System.out.println(apiCall.join());
    }
}
