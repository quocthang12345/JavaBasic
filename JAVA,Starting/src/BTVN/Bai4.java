package BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap lan luot a,b,c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a > b && a < c) System.out.println(a + " la so trung gian");
        else if(b>a && b<c) System.out.println(b+ " la so trung gian");
        else System.out.println(c + " la so trung gian");
    }
}
