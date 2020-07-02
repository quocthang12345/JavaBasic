package java_input_output_console;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhap mot so nguyen
        System.out.println("Nhập một số nguyên: ");
        int a = scanner.nextInt();
        // Nhap mot so  thuc
        System.out.println("Nhập số thực kiểu float: ");
        float b = scanner.nextFloat();
        System.out.println("Nhập số thực kiểu double: ");
        double c= scanner.nextDouble();
        // nhap kieu boolean kiem tra
        System.out.println("Nhập true or false: ");
        boolean d = scanner.nextBoolean();
        /* vì không có kiểu nextChar(), nên phải nhập theo kiểu lấy từng kí tự thông qua hàm charAt(vt đầu)
        và hàm next() lấy kí tự kết thúc bằng dấu cách */
        System.out.println("Nhập một kí tự: ");
        char e = scanner.next().charAt(0);
        // nhap một từ
        System.out.println("Nhập một từ: ");
        String f = scanner.next();
        scanner.nextLine();
        // nhập một dòng
        System.out.println("Nhập một dòng: ");
        String g = scanner.nextLine();
        System.out.println("Ket qua: ");
        System.out.print(a + "-" + b + "-" + c + "-"+ d + "-"+ e +"-" + f + "-" + g );
    }
}
