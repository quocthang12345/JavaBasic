package exercise_1;
//Bài 6: Viết chương trình tính tổng S = 1 + 3 + 5 + ... + n nếu n lẻ
//        S = 2 + 4 + ... + n nếu n chẵn
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = scanner.nextInt();
        int sum = 0;
        if(n % 2 == 0)
        {
            for(int i = 0 ; i<=n ; i+=2)
            {
                sum += i;
            }
            System.out.println("S = " + sum);
        }
        else
        {
            for(int i = 1 ; i<=n ;i+=2)
            {
                sum+=i;
            }
            System.out.println("S = " + sum);
        }
    }
}
