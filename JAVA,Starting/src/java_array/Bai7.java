package java_array;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int count = 0;
        int vt = -1;
        int maxcount = 0 , vtbd = -1;
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length  ; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = a.length - 1 ; i > 0 ; i--) {
            if(a[i] < a[i-1])
            {
                ++count;
                vt = i-1;
            }
            else{
                System.out.println(count);
                System.out.println(vt);
            }
            if(maxcount < count && vtbd < vt) {
                maxcount = count;
                vtbd = vt;
            }
        }
        System.out.println(count + " " + vtbd);


    }
}
