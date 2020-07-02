package BTVN1;

import java.util.Scanner;

public class Bai7 {
    public static boolean isNgTo(int m) {
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int m;
        System.out.println("Moi nhap m: ");
        m = new Scanner(System.in).nextInt();
        System.out.println(isNgTo(m));
    }
}
