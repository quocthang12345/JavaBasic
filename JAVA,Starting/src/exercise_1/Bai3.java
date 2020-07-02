package exercise_1;
//Bài 3: Nhập vào chiều cao và in ra hình như dưới đây (ví dụ với chiều cao bằng 4):
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt(); // h = 2
        int x, output;

        for(int i = 1;i<= h; i++){ // (i = 1; i<= 2; i++)
            for(int j = 0; j<= 2*h; j++){ //(j=0 ; j<=4 ; j++)
                x = j-h; //(-2 -1 0 1 2 )
                if(x < 0){
                    x *= -1;//( 2 1 0 1 2)
                }
                output = i - x;

                if(output > 0){
                    System.out.printf("%3d", output);
                } else{
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }

    }
}
