package exercise_2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = scanner.nextInt();
        int count= 0,vt = 0 ;
        int[] a = new int[n];
        for (int i = 0; i <a.length ; i++) {
            System.out.print("Nhap phan tu cua mang: ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Moi nhap x : ");
        int x = scanner.nextInt();
        for(int j = 0 ; j < a.length; j++)
        {
            if(isNgTo(a[j]) == true)
            {
               if(a[j] > vt)
               {
                   vt = a[j];
                   count = j ;
               }
            }
            else continue;
        }
        if(vt <= x) System.out.println("Gia tri so nguyen to gan nhat voi x la : "+  vt + " o vi tri " + count );
        if(vt > x)  System.out.println("Gia tri so nguyen to gan nhat voi x la : "+  vt + " o vi tri " + count );
    }
    public static boolean isNgTo(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
