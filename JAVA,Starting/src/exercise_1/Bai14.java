package exercise_1;
//Số chính phương hay còn gọi là số hình vuông là số tự nhiên có căn bậc 2 là một số tự nhiên, hay nói cách khác,
// số chính phương là bình phương (lũy thừa bậc 2) của một số tự nhiên.
// Số chính phương hiển thị diện tích của một hình vuông có chiều dài cạnh bằng số nguyên kia.
// Số chính phương là các số không âm. Một định nghĩa khác: số chính phương là số có căn bậc hai là một số nguyên.
//Bài 14. Nhập vào 2 số tự nhiên m và n, sao cho m < n. Hãy liệt kê các số chính
//        phương trong đoạn [m,n]. Có bao nhiêu số chính phương?

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        int count = 0;
        if ((m >= 0 && n >= 0) || n >= 0) {
            for (int i = m; i <= n; i++) {
                if(i>=0){
                    int res = (int)Math.sqrt(i);
                    if(res*res == i){
                        count++;
                        System.out.printf("%10d", i);
                        if(count %10 == 0){
                            System.out.println();
                        }
                    }
                }
            }
        }
        System.out.println("\nSo luong so chinh phuong thoa man: " + count);
    }
}
