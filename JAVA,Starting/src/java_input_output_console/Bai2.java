package java_input_output_console;


import java.util.Scanner;
/*  Định dạng xuất ra màn hình
    Kiểu char: %c
    Kiểu int : %d
    Kiểu String: %s
    Kiểu boolean : %b
    Kiểu float, double : %f
    Kiểu % : %%
* */
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap mot so thuc: ");
        double a = scanner.nextDouble();
        System.out.printf("KQ= %.3f", a);
    }
}
