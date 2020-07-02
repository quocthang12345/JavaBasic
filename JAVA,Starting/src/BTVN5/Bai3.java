package BTVN5;

import BTVN.InputOutputStream1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai3 {
    public static String nhapchuoi() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        String s = br.readLine();
        return s;
    }
    public static String daochuoi(String s){
        String result = "";
        for (int i = s.length()-1 ; i >= 0 ; i--) {
            result += s.charAt(i);
        }
        return result;
    }
    public static String daochuoiHoaVaThuong(String s){
        String result = "";
        for (int i = s.length()-1 ; i >= 0 ; i--) {
            if(i % 2 == 0) {
                result += s.toLowerCase().charAt(i);
            }else{
                result += s.toUpperCase().charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        InputOutputStream1 dt = new InputOutputStream1();
        String Name = null;
        try {
            do {
                System.out.println("Nhap chuoi cua ban");
                Name = dt.nhapchuoi();
            } while (Name == null);
            System.out.println("Dao chuoi: ");
            daochuoi(Name);
            System.out.println("Dao chuoi thanh chuoi hoa : " + daochuoi(Name).toLowerCase());
            System.out.println("Dao chuoi thanh chuoi thuong : " + daochuoi(Name).toUpperCase());
            System.out.println("Dao chuoi vua hoa vua thuong : " + daochuoiHoaVaThuong(Name));

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
