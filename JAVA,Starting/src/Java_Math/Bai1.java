package Java_Math;

// Các phương thức của lớp math

public class Bai1 {
    public static void main(String[] args) {
        double x = 90;
        double xIr = Math.toRadians(x);// đổi sang radian
        double result = Math.cos(xIr*1.0);
        System.out.println("Cos(90) = "+ result);
        System.out.println("Pi= "+Math.PI);
        System.out.println("E= " + Math.E);
    }
}
