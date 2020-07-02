package BTVN1;

import java.util.Scanner;

public class Bai12 {
    public static int Fibonaci(int n)
    {
        if(n == 1 || n == 0 ) return 1;
        return Fibonaci(n-1)+Fibonaci(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n ; i++) {
            System.out.print(Fibonaci(i)+ " ");
        }
    }
}
