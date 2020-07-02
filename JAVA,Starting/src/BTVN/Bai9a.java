package BTVN1;

import java.util.Scanner;

public class Bai3 {
    public static int Giaithua(int n)
    {
        if(n < 0) System.out.println("Moi nhap lai");
        if(n == 0 ) return 1;
        if(n == 1) return 1;
        return n*Giaithua(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for(int i = 1 ; i <= n ; i+=2)
        {
            sum+= 1*1.0/Giaithua(i);
        }
        System.out.println("S = " +sum);
    }
}
