package BTVN1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai10 {
    public static boolean isNgTo(int m) {
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        ArrayList list = new ArrayList();
        for (int i = 2; i <= n ; i++) {
            if(isNgTo(i)) list.add(i);
        }
        System.out.println(list);

    }
}
