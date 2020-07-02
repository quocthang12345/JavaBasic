package exercise_1;

import java.util.Scanner;
//Bài 12. Dãy số Fibonacci được định nghĩa như sau: F0 = 0, F1 = 1; Fi = Fi-1 + Fi-2.
//        Nhập n, với 2 <= n <= 90. Hãy viết chương trình in ra n số Fibonacci đầu tiên
public class Bai12 {
    public static int F(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        return F(n-1) + F(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        System.out.print("Day Fibonacci: ");
        for(int i = 0 ; i<=n ;i++)
        {
            System.out.print(+F(i)+"\t");
        }
    }
}
