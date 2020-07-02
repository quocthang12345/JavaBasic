package BTVN;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap thang: ");
        int thang = scanner.nextInt();
        System.out.print("Moi nhap nam: ");
        int nam = scanner.nextInt();
        switch (thang)
        {
            case 1 : System.out.println("31 ngay");break;
            case 2 :
            {
                if( nam % 4 == 0) System.out.println("29 ngay");
                else System.out.println("28 ngay");
                break;
            }
            case 3 : System.out.println("31 ngay");break;
            case 4 : System.out.println("30 ngay");break;
            case 5 : System.out.println("31 ngay");break;
            case 6 : System.out.println("30 ngay");break;
            case 7 : System.out.println("31 ngay");break;
            case 8 : System.out.println("31 ngay");break;
            case 9 : System.out.println("30 ngay");break;
            case 10 : System.out.println("31 ngay");break;
            case 11 : System.out.println("30 ngay");break;
            case 12 : System.out.println("31 ngay");break;
        }
    }
}
