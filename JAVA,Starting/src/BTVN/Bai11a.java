package BTVN1;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen bat ki:  ");
        String a = scanner.nextLine();
        String result[] = a.split(""); // hàm cắt từng kí tự trong chuỗi string với dkien cho trước
        int sum = 0 , P = 1;
        for(String s : result)
        {
            System.out.print(s+"\t");
            int i = Integer.parseInt(s); // hàm ép kiểu từ string sang int
            sum += i;
            P *= i;
        }
        System.out.println("");
        System.out.println("S = " + sum);
        System.out.println("P = " +P);
    }
}
