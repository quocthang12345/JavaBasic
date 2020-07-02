package java_other;

import java.util.Scanner;

public class function {
    public static void NhapMang(int arr[], int n)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length ; i++)
        {
            System.out.print("Nhap phan tu mang: ");
            arr[i] = scanner.nextInt();
        }
    }
    public static void XuatMang(int arr[])
    {
        for(int i=0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static int Max(int arr[])
    {
        int max = arr[0];
        for(int i = 1; i< arr.length ; i++)
        {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] arr = new int[n1];
        NhapMang(arr,n1);
        XuatMang(arr);
        int n2 = scanner.nextInt();
        int[] arr1 = new int[n2];
        NhapMang(arr1,n1);
        XuatMang(arr1);
        int n3 = scanner.nextInt();
        int[] arr2 = new int[n3];
        NhapMang(arr2,n1);
        XuatMang(arr2);
        System.out.println(Max(arr));
    }
}
