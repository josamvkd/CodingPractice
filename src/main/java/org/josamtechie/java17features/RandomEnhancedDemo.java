package org.josamtechie.java17features;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomEnhancedDemo
{
    public static void main(String[] args)
    {
        // Enhanced Pseudo-Random Number Generators
        // New interface: RandomGenerator
        RandomGenerator generator = RandomGeneratorFactory.of("L64X128MixRandom").create();
        System.out.println("IX"+generator.nextInt(1000));
    }
}
