// Rule 04 STR03-J
// Do not encode noncharacter data as a string

import java.math.BigInteger;

public class R04_STR03_J {

    public static void main(String[] args) {

        // Noncompliant
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);

        // Compliant
        String good = x.toString();
        byte[] goodBytes = good.getBytes();
        String ns = new String(goodBytes);
        x = new BigInteger(ns);
    }
}
