package exercise_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void Nhap(int arr[] ,int n)
    {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n  ; i++) {
            arr[i] = scanner.nextInt();
        }
    }
    public static void Xuat(int arr[])
    {
        for (int i = 0; i < arr.length  ; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Nhap n,m va vt p: ");
        int n = scanner1.nextInt();
        int m = scanner1.nextInt();
        int j = m+n;
        int p = scanner1.nextInt();
        int [] a = new int[n];
        int [] b = new int [m];
        int [] c = new int [j];
        System.out.print("Nhap mang a[n]: ");
        Nhap(a,n);
        System.out.print("Nhap mang b[m]: ");
        Nhap(b,m);
        System.out.println("Mang a[n] : "  );
        Xuat(a);
        System.out.println("Mang b[m] : ");
        Xuat(b);
        for (int i = 0; i < p; i++) {
            c[i] = a[i];
        } // copy các phần tử của a[i] trước vt p
        for (int i = 0; i < m  ; i++) {
            c[i+p] = b[i];
        } // copy các phần tử của b[i] từ vt p
        for (int i = p; i < n; i++) {
            c[i+m] = a[i];
        }// copy các phần tử của a[i] sau vt p
        System.out.println("Mang c[n+m] : ");
        Xuat(c);
    }
}
