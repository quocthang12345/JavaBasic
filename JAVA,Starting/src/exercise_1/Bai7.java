package exercise_1;

import java.util.Scanner;
//Bài 7. Nhập số tự nhiên n rồi tính tổng (lưu ý phép chia các số nguyên):
public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen n: ");
        double n = scanner.nextDouble();
        double sum = 0 ;
        for(double i = 1 ; i <= n ; i++)
        {
            sum+=1/i;
        }
        System.out.printf("S = %.6f ", sum);
    }
}
