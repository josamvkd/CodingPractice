package org.josamtechie.java19features;

public class VirtualThreadsPreviewDemo
{
    // 🧵 Virtual Threads
    // Part of Project Loom — lightweight threads for high concurrency
    //  ✅ Why it matters
    //  Handles millions of concurrent tasks
    //  Eliminates complexity of thread pools
    public static void main(String[] args) throws InterruptedException
    {
        Runnable task = () -> System.out.println("Running in : " + Thread.currentThread());
        Thread vt = Thread.startVirtualThread(task);
        vt.join();  // wait for completion

        //  🔍 Key Points
        //  Cheap to create (unlike platform threads)
        //  Ideal for I/O-heavy applications (microservices, APIs)
    }
}
