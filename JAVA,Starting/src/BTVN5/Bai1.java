package BTVN5;

import BTVN.InputOutputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai1 {
    public static int nhapso() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }


    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
    public static void main(String[] args) {
        InputOutputStream dt = new InputOutputStream();
        int m = 0 ;
        int n = 0;
        try {
            do {
                System.out.println("Nhap so nguyen duong m: ");
                m = dt.nhapso();
                System.out.println("Nhap so nguyen duong n: ");
                n = dt.nhapso();
            } while (m <= 0 && n <= 0);
            System.out.println("UCLN của 2 số m và n là: " + USCLN(m,n));
            System.out.println("BCNN của 2 số m và n là: " + BSCNN(m,n));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
