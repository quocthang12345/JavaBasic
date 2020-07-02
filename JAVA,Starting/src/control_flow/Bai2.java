package control_flow;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap diem cua ban: ");
        double a = scanner.nextDouble();
        if(a>=9.0) System.out.println("Xuat sac!");
        else if(a<9.0 && a>=8.0) System.out.println("GIOI!");
        else if(a<8.0 && a>=6.5) System.out.println("KHA!");
        else if(a<6.5 && a>=3.5) System.out.println("Trung binh!");
        else System.out.println("Yeu!");
            }
}
