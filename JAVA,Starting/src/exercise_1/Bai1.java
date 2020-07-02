package exercise_1;
//       Bài 1: Nhập vào kích thước chiều rộng chiều cao và in ra hình chữ nhật các dấu *.
//        Ví dụ với chiều cao là 5, chiều rộng là 5:
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap chieu rong: ");
        int a = scanner.nextInt();
        System.out.print("Moi nhap chieu cao: ");
        int b = scanner.nextInt();
        for(int i = 1; i <= b ; i++)
        {
            for (int j = 1; j<a ;j++)
            {
                System.out.print("*\t");
            }
            System.out.println("*");
        }
    }
}
