package exercise_2;

import java.util.Scanner;
//Bài 2. Đọc vào một dãy số a có n phần tử là các số nguyên. Đếm số lần xuất hiện
//        của từng phần tử trong mảng. In ra phần tử và số lần xuất hiện của phần tử có
//        số lần xuất hiện nhiều nhất trong a.
public class Bai2 {
    public static void main(String[] args) {
        final int m = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap n : ");
        int i, max = 0;
        int n = scanner.nextInt();
        int[] b = new int[m];
        int[] a = new int[n];
        for (i = 0; i < a.length; i++) {
            System.out.print("Nhap gia tri cua a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        for (int j = 0; j < b.length; j++) {
            b[j] = 0;
        }
        for (int k = 0; k < a.length; k++) {

            b[a[k]]++;
        }
        for (i = 0; i < b.length; i++) {
            if (b[i] > 0) {
                System.out.println("Gia tri cua " + i + "  xuat hien " + b[i] + "  lan  ");
            }
        }
        for (int g = 0; g < a.length; g++) {
            if (b[g] > max) {
                max  = b[g];
            }
        }
        System.out.println(" So lan xuat hien nhieu nhat " + max + "  lan  ");
    }
}
