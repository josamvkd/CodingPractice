package org.josamtechie.java20features;

public class VirtualThreadsSecPreDemo
{
    //  Virtual Threads (Second Preview)
    //  👉 Lightweight threads for high-throughput applications.

    //  ✅ Why it matters
    //  Massive scalability (millions of threads possible)
    //  Simplifies concurrent programming
    static void main() throws InterruptedException
    {
        Thread.startVirtualThread(() -> {
            System.out.println("Running in virtual thread: " + Thread.currentThread());
        });
        Thread.sleep(1000); // wait for thread
    }
}
