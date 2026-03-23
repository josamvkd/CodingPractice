package org.josamtechie.java15features;

import java.security.*;

public class EdDSAExample
{
    // EdDSA Digital Signature Algorithm
    // New cryptographic algorithm support.
    //  ✅ Use Case
    //  Modern secure digital signatures
    //  Faster than traditional RSA in some cases
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException
    {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("Ed25519");
        KeyPair kp = kpg.generateKeyPair();

        Signature sig = Signature.getInstance("Ed25519");
        sig.initSign(kp.getPrivate());

        sig.update("Hello".getBytes());
        byte[] signature = sig.sign();

        System.out.println("Signature generated : "+signature);
    }
}
