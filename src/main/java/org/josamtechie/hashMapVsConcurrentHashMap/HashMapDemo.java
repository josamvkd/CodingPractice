package org.josamtechie.hashMapVsConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
    // ❌ HashMap (Not Thread Safe)
    static void main() throws InterruptedException
    {
        Map<Integer, String> map = new HashMap<>();
        Runnable task = () ->{
            for (int i=0;i<1000;i++){
            map.put(i,Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(STR."Size: \{map.size()}"); // unpredictable

        //  🔴 Problem:
        //  Final size may not be 1000
        //  Data inconsistency

        //      🔹 1. Core Difference
        //      Feature	                        HashMap	                                    ConcurrentHashMap
        //      Thread Safety	                ❌ Not thread-safe	                        ✅ Thread-safe
        //      Synchronization	                None	                                    Internal (segment-based / CAS)
        //      Performance	                    Fast (single-thread)	                    Optimized for multi-thread
        //      Null Keys/Values	            1 null key, multiple null values	        ❌ Not allowed
        //      Use Case	                    Single-threaded or externally synchronized	Multi-threaded environments
    }
}
