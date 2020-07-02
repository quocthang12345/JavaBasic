package exercise_1;

import java.util.Scanner;
//Bài 8. Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?
public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap so nguyen n: ");
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.println(i + " la uoc so cua " + n);
                count++;
            }
        }
        System.out.println("so uoc so cua n la: " + count);
    }
}
