package exercise_2;
//Bài 1. Đọc vào dãy số a có n phần tử chỉ gồm các số nguyên dương. Kiểm tra mảng
//        a có phải là mảng đối xứng hay không (ví dụ: 15 2 1 2 15 là mảng đối xứng).
//Thuật toán
//        Tìm số đảo của số nguyên vừa nhập
//        So sánh số đảo và số nguyên đó
//        Là số đối xứng nếu 2 số bằng nhau và ngược lại
import java.util.Arrays;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        int n, kt = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // kiểm tra mảng đảo ngược
        // dùng vòng lặp for duyệt i = 0 đến i < n / 2
        // nếu A[i] != A[n - i -1]
        // thì mảng đó không phải mảng đối xứng
        for (int i = 0; i < n / 2; i++) {
            if (A[i] != A[n - i - 1]) {
                kt = 0;
                break;
            }
        }

        if (kt == 0) {
            System.out.println("Mảng một chiều vừa nhập không là mảng đối xứng");
        } else {
            System.out.println("Mảng một chiều vừa nhập là mảng đối xứng");
        }
    }
}
