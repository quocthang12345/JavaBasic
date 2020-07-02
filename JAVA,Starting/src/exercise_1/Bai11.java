package exercise_1;

import java.util.Scanner;
//Bài 11. Viết chương trình liệt kê n số nguyên tố đầu tiên.
public class Bai11 {
    public static void main(String[] args) {
        int n;
        n = new Scanner(System.in).nextInt();
        int count = 0;
        int x = 2;
        while(true){
            if(isNgTo(x)){
                System.out.print(x+" ");
                count++;
            }
            if(count == n){
                break;
            }
            if(x == 2)
                x++;
            else{
                x+= 2;
            }
        }
    }

    public static boolean isNgTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
