package exercise_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        final int m = 10000;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Nhap phan tu n: ");
        int n = scanner.nextInt();
        int [] A = new int[n];
        int index = 0;
        //int [] B = new int[m];
        for(int i = 0 ; i < A.length ; i++)
        {
            A[i] = random.nextInt(n);
        }
        for(int i = 0 ; i < A.length ; i++)
        {
            System.out.println("Phan tu A[" + i + "] = " + A[i]);
        }
        Arrays.sort(A);
        System.out.println("Mang da sap xep: " + Arrays.toString(A));
        for (int j = 0; j < n-1 ; j++) {
            for(int k = j + 1 ; k < n ; k++ )
            {
                if(A[j] == A[k])
                {
                    index = j;
                    for(int l = index + 1  ; l < n ; l++)
                    {
                        A[l-1]=A[l];
                    }
                    n--;
                }
            }
        }
        System.out.println("Mang da sap xep: " + Arrays.toString(A));

    }
}
