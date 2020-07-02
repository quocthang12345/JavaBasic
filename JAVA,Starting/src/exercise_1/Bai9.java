package exercise_1;

import java.util.Scanner;
//Bài 9. Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
//        Ví dụ: Số 8545604 có tổng các chữ số là: 8 + 5 + 4 + 5 + 6 + 0 + 4 = 32.

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen bat ki:  ");
        String a = scanner.nextLine();
        String result[] = a.split(""); // hàm cắt từng kí tự trong chuỗi string với dkien cho trước
        int sum = 0;
        for(String s : result)
        {
            System.out.print(s+"\t");
            int i = Integer.parseInt(s); // hàm ép kiểu từ string sang int
            sum += i;
        }
        System.out.println("");
        System.out.println("S = " + sum);
    }
}
