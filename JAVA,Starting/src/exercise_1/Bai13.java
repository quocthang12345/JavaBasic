package exercise_1;
//Bài 13. Viết chương trình liệt kê tất cả các số thuận nghịch có sáu chữ số.

import java.util.Scanner;

// số thuận nghịch là số khi ta đảo tất cả số trong một số lại thì vẫn giữ kết quả cũ
// vd : 12345 => 54321 ( ko phải là số thuận nghịch)
// vd : 558855 => 558855  ( là số thuận nghịch)
public class Bai13 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 100000 ; i <= 999999 ; i++)
        {
            String s = String.valueOf(i);// hàm ép kiểu int sang string
            String reverse = new StringBuffer(s).reverse().toString();
            int j = Integer.parseInt(reverse); // hàm ép kiểu string sang int
            if(j == i) System.out.print(j + "\t");
            count++;
        }
        System.out.print("tong so so thuan nghich la: " + count);
    }
}
