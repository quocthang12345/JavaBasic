package Java_exerciseschool;

public class FindMax {
    public void Max(int a, int b , int c)
    {
        if(a > b && a > c) System.out.println(a + " la MAX");
        if(b > a && b > c) System.out.println(b + " la MAX");
        if(c > b && c > a) System.out.println(c + " la MAX\n");
        // sử dụng if...else
        if(a > b && a > c) System.out.println(a+ "  la MAX ");
        else if(b > a && b > c) System.out.println( " la MAX");
        else System.out.println(c + " la MAX");
    }
}
