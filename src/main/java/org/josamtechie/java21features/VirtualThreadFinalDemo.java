package org.josamtechie.java21features;

public class VirtualThreadFinalDemo
{
    static void main() throws InterruptedException
    {
//        Thread.startVirtualThread(()->{
//            System.out.println(Thread.currentThread());
//        });
//        Thread.sleep(1000);
        Runnable task = () -> {
            System.out.println("Running in: "+Thread.currentThread());
        };
        // Create virtual thread
        Thread vt = Thread.startVirtualThread(task);
        vt.join();
    }
}
