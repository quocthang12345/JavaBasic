package exercise_2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static int[] insert(int[] arr , int x)
    {
        int index = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] > x)
            {
                index = i;
                break;
            }
        }
        if(index == -1)
        {
            arr[n] = x;
        }else {
            for (int i = n-1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n va x: ");
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n+1];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri phan tu mang: ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Arrays.sort(a);
        String res = Arrays.toString(a);
        System.out.println(res);
        String res1 = Arrays.toString(insert(a,x));
        System.out.println(res1);
    }
}
