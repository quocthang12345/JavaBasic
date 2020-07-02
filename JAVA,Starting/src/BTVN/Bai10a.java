package BTVN1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kt ,sum = 1 ;
        System.out.println("Moi nhap n: ");
        int n = scanner.nextInt();
        if(n % 2 == 0) kt = 2;
        else kt = 1;
        for(int i = kt ; i<=n ; i+=2)
        {
            sum *= i;
        }
        System.out.println("P = " + sum );
    }
}
