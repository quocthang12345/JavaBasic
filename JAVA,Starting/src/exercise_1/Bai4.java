package exercise_1;
//Bài 4: Viết chương trình in ra Bảng cửu chương
public class Bai4 {
    public static void main(String[] args) {
        for(int i = 1 ; i<10 ; i++) {
                for (int j = 0; j <= 10; j++)
                {
                    System.out.print(j + " x " + i + " = " + i * j +"\t");}
            System.out.println("");
            }
    }
}
