package BTVN1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap n: ");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += 1*1.0/i;
        }
        System.out.println("S = " + sum);
    }
}
