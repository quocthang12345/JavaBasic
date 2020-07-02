package exercise_1;

import java.util.Scanner;
//Bài 10. Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố
//        Ví dụ: Số 28 được phân tích thành 2 x 2 x 7
public class Bai10 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i = 2;
        if (n == 1) {
            System.out.println(n + " = " + n);
        } else {
            System.out.print(n + " = ");
            while (n != 1) {
                if (n % i == 0) { // n % 2 == 0 => lay 2 => lay 2 => vi n!=1 lay 7 // vd n = 9 , n%2 != 0 xuong else tang i len 1 don vi
                    // n%3==0 lay 3 => lay 3
                    System.out.print(i + " x ");
                    n /= i;
                } else {
                    ++i;
                }
            }
            System.out.print("\b\b\b");
        }
    }
}
