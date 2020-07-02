package BTVN1;

import java.util.Scanner;

public class Bai2 {
    public static double Giaithua(double n)
    {
        if(n < 0) System.out.println("Moi nhap lai");
        if(n == 0 ) return 1;
        if(n == 1) return 1;
        return n*Giaithua(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap n: ");
        double n = scanner.nextDouble();
        double sum = 0;
        for (double i = 0; i <= n ; i++) {
            sum += (Math.pow(-1,i)*(1*1.0/Giaithua(i)));
        }
        System.out.println("S = " + sum);
    }
}
