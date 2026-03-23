package org.josamtechie.java9features;

public class ProcessExample {
    public static void main(String[] args) {
        ProcessHandle.allProcesses()
                .forEach(p -> System.out.println(p.pid()));
    }
}
