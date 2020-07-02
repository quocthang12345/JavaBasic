package java_array;

import java.util.Scanner;

// khởi tạo cho mảng
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // cách 1
        int [] arr = {1,2,3,4,5};
        // cách 2
        int arr1[] = {1,2,3,4,5};
        // cách 3
        int [] arr3 = new int[5];
        for(int i = 0 ; i < arr3.length;i++)
        {
            System.out.println("Moi nhap a[i]: ");
            arr3[i] = scanner.nextInt();
        }
        for(int i = 0 ; i< arr3.length;i++)
        {
            System.out.println("A[" + i + "] = " + arr3[i]);
        }
    }
}
