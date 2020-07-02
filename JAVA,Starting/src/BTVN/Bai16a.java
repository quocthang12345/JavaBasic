package BTVN1;

import java.util.ArrayList;

public class Bai11 {
    public static void UocChung(int n, ArrayList list)
    {
        int m = 0;
        for (int i = 1; i < n ; i++) {
            if(n % i == 0) m+= i;
        }
        if(m == n) list.add(n);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList();
        for(int i = 1 ; i < 1000 ; i++ )
        {
            UocChung(i,list1);
        }
        System.out.println(list1);
    }
}
