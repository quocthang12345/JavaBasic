package BTVN1;
import java.util.Scanner;

public class Bai13 {
    public static int Fibonaci(int n)
    {
        if(n == 1 || n == 0 ) return 1;
        return Fibonaci(n-1)+Fibonaci(n-2);
    }
    public static boolean IsFibnaci(int k)
    {
        for (int i = 0; i <= k ; i++) {
            if(k == Fibonaci(i)){
                return true;
            }
        }
        return false;
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap số nguyên dương k: ");
        int k = scanner.nextInt();
        if(IsFibnaci(k)){
            System.out.println(k + " nằm trong dãy Fibonacci");
        }else{
            System.out.println(k + " không nằm trong dãy fibonacci trên");
        }
    }
}