package exercise_1;
//Bài 2: Nhập vào kích thước chiều rộng, chiều cao và in ra hình chữ nhật các dấu *
//        nhưng rỗng bên trong. Ví dụ với chiều cao là 5, chiều rộng là 5:
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap chieu rong: ");
        int a = scanner.nextInt();
        System.out.println("Nhap chieu cao: ");
        int b = scanner.nextInt();
        for(int i= 1 ; i<=b ; i++)
        {
            if(i == 1 || i == b)
            {
                for(int j = 1 ; j<a ; j++) {
                    System.out.print("*\t");
                }
                System.out.println("*");
            }
            else {
                for(int k = 1 ; k<=a ; k++)
                {
                    if(k==1||k==a)
                    {
                        System.out.print("*\t");
                    }
                    else System.out.print("\t");
                }
                System.out.println("");
            }

        }
    }
}
