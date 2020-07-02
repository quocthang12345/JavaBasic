package BTVN;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap gio bat dau (h): ");
        int a = scanner.nextInt();
        System.out.print("Moi nhap gio ket thuc (h): ");
        int b = scanner.nextInt();
        int giott = b - a;
        if(b < 18) System.out.println("So tien phai tra truoc 18h = " + giott*45000);
        else System.out.println("So tien phai tra sau 18h = " +giott*60000);
    }
}
