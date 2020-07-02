package BTVN1;

import java.util.Scanner;

public class Bai9 {
    public static boolean Isdoixung(int i)
    {
        String s = String.valueOf(i);// hàm ép kiểu int sang string
        String reverse = new StringBuffer(s).reverse().toString();
        int j = Integer.parseInt(reverse); // hàm ép kiểu string sang int
        if(j == i) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap i: ");
        int i = scanner.nextInt();
        System.out.println(Isdoixung(i));

    }
}
