package exercise_1;
//Bài 5: Viết chương trình nhập một số nguyên trong khoảng 0 .. 100. Sau đó lần
//        lượt lấy ngẫu nhiên các số trong khoảng này cho đến khi có một giá trị đúng
//        bằng giá trị nhập vào. In ra kết quả từng bước và số bước phải thực hiện.
import java.util.Random;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        int count = 0;
        Random random = new Random();
        while (true) {
            int randNumber = random.nextInt(100); // [0,99]
            count++;
            System.out.println("Random number: " + randNumber + ", input: " + input);
            if (randNumber == input) {
                System.out.println("Thuc hien " + count + " lan.");
                break;
            }
        }
    }
}
