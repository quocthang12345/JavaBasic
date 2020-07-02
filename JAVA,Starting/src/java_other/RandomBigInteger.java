package java_other;

import java.math.BigInteger;
import java.util.Random;

public class RandomBigInteger {
    public static void main(String[] args) {
        BigInteger a = GenerateMyBigInteger(500);
        System.out.println(a);
    }
    public static BigInteger GenerateMyBigInteger(int bit)
    {
        Random random = new Random();
        BigInteger i = new BigInteger(bit,random);
        return i;
    }
}
