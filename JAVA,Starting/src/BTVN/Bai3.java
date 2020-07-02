package BTVN;

public class Bai3 {
    public static void Nghiem2(double a,double b,double c)
    {
        double x1,x2;
        double delta = b*b - 4*a*c ;
        if(delta > 0 ) {
            x1 = (-b+Math.sqrt(delta))/2*a;
            x2 = (-b-Math.sqrt(delta))/2*a;
            System.out.println("Nghiem thu nhat cua phuong trinh la: " + x1);
            System.out.println("Nghiem thu  hai cua phuong trinh la: " + x2);
        }
        else if(delta == 0) {
            x1 = x2 = 1.0*(-b)/2*a;
            System.out.println("Nghiem kep cua phuong trinh la " + x1);
        }
        else
        {
            System.out.println("Phuong trinh khong co nghiem");
        }
    }

    public static void main(String[] args) {
        double a = 1 , b = 2 , c = -3;
        System.out.println("Nghiem cua phuong trinh bac hai la: " );
        Nghiem2(a,b,c);
    }

}
