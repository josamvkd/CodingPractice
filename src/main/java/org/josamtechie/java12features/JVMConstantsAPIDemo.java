package org.josamtechie.java12features;

import java.lang.constant.ClassDesc;

public class JVMConstantsAPIDemo
{
    public static void main(String[] args)
    {
        // Package: java.lang.invoke.constant
        // Used for modeling key class-file and runtime constants.
        ClassDesc desc = ClassDesc.of("java.lang.String");
        System.out.println(desc.displayName());
    }
}
