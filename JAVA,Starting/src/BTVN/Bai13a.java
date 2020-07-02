package BTVN1;

import java.util.Scanner;

public class Bai8 {
    public static boolean IsChinhphuong(int p)
    {
        int res = (int) Math.sqrt(p);
        if(res*res == p) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap P: ");
        int p = scanner.nextInt();
        System.out.println(IsChinhphuong(p));
    }
}
