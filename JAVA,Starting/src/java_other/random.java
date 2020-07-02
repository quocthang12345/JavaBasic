package java_other;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        for(int i = 1 ; i <= 10 ; i++)
        {
            int a = random.nextInt(123) + 23;
            System.out.println("X = " + a);
        }
    }
}
