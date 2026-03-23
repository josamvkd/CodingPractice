package org.josamtechie.java21features;

import java.util.*;

public class SequencedCollectionsAPIDemo
{
    static void main()
    {
        //  Sequenced Collections (New API)
        //  Adds predictable ordering to collections
        //  ✅ New Interfaces
        //  SequencedCollection
        //  SequencedSet
        //  SequencedMap
        SequencedCollection<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        System.out.println(list); // [A, B]
        // 👉 Useful for ordered data handling (FIFO/LIFO)


        SequencedSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
    }
}
