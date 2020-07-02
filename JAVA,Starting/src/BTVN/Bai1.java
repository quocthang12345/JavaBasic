package BTVN;

public class Bai1 {
    public static void main(String[] args) {
        int a = 1 , b = 2 , c = 3;
        if(a > b && a > c) System.out.println("a la Max");
        else if(b > a && b > c) System.out.println("b la Max");
        else if(c > b && c > a) System.out.println("c la Max");
    }
}
