package BTVN5;

import BTVN.InputOutputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai2 {
    public static int nhapso() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
    public static int SoDaoNguoc(int i)
    {
        String s = String.valueOf(i);
        String reverse = new StringBuffer(s).reverse().toString();
        int j = Integer.parseInt(reverse);
        return j;
    }
    public static boolean Isdoixung(int i)
    {
        String s = String.valueOf(i);// hàm ép kiểu int sang string
        String reverse = new StringBuffer(s).reverse().toString();
        int j = Integer.parseInt(reverse); // hàm ép kiểu string sang int
        if(j == i) return true;
        return false;
    }
    public static int Fibonaci(int n)
    {
        if(n == 1 || n == 0 ) return 1;
        return Fibonaci(n-1)+Fibonaci(n-2);
    }
    public static boolean IsFibnaci(int k)
    {
        for (int i = 0; i <= k ; i++) {
            if(k == Fibonaci(i)){
                System.out.println(i);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        InputOutputStream dt = new InputOutputStream();
        int m = 0 ;
        int i = 0;
        try {
            do {
                System.out.println("Nhap so nguyen duong m: ");
                m = dt.nhapso();
            } while (m <= 0);
            System.out.println("Vậy số đảo ngược của m là " + SoDaoNguoc(m));
            if(Isdoixung(m)){
                System.out.println(m + " la so doi xung");
            }else{
                System.out.println(m + " khong phai la so doi xung");
            }
            System.out.print(m + " nam o vi tri thu ");
            if(IsFibnaci(m)){
                System.out.print(" trong day fibonacci" );
            }else{
                System.out.println(m + " khong nam la trong day fibonacci");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
