package BTVN5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
@SuppressWarnings("all")
public class Bai5 {
    public int nhapso() throws IOException
    {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
    public void TinhtongLeDuong(int a[])
    {
        int sum=0;
        for (int i=0;i<a.length;i++)
            if (a[i]%2 != 0 && a[i] >=0) sum+= a[i];
        System.out.println("Tong so le duong : "+sum);
    }
    public void Search(int a[],int k)
    {
        int i;
        for (i=0;i<a.length;i++)
            if (a[i]==k)
            {
                System.out.println("Co phan tu "+k+" trong mang ");
                System.out.println("Phan tu dau tien o vi tri: "+i);
                break;
            }
        if (i==a.length)
            System.out.println("Khong co phan tu "+k+" trong mang");
    }
    public void Sort(int a[])
    {
        int i,j,temp=0;
        for (i=0;i<a.length-1;i++)
            for (j=i+1;j<a.length;j++)
                if (a[j]<a[i])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        System.out.println("Mang xep tang dan : ");
        for (i=0;i<a.length;i++) System.out.print(a[i] +" ");
        System.out.println("\n");
    }
    public int[] Insert(int a[],int p)
    {
        int i,j,temp[] ;
        int  check=0;
        temp = new int [a.length+1];
        if (p<a[0]) {
            temp[0] = p;
            for (int k=1;k<temp.length;k++)
                temp[k]= a[k-1] ;
            return temp;
        }
        if (p>a[a.length-1]) {
            temp[a.length] = p;
            for (int k=0;k<temp.length-1;k++)
                temp[k]= a[k] ;
            return temp;
        }
        for (i=0;i<a.length;i++)
        {
            if (a[i]<p ) temp[i] = a[i];
            else {
                temp[i]=p;
                check = i;
                break;
            }
        }
        for (j=check;j<a.length;j++)
        {
            temp[j+1] = a[j] ;
        }
        a = new int [temp.length];
        for (int k=0;k<a.length;k++)
            a[k] = temp[k];
        return temp;
    }
    public static void main(String[] args) {
        Bai5 dt = new Bai5();
        int n=-1,s[],i;
        try
        {
            do
            {
                System.out.println("Nhap so phan tu cua mang : ");
                n = dt.nhapso();
            }
            while (n<0);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        s= new int [n];
        for (i=0;i<n;i++)
        {
            try
            {
                System.out.print("s["+i+"] = ");
                s[i] = dt.nhapso();

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        dt.TinhtongLeDuong(s);
        int k=0;
        try
        {
            System.out.print("Nhap phan tu can tim kiem: ");
            k = dt.nhapso();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        dt.Search(s, k);
        System.out.println("-------------------------");
        dt.Sort(s);
        System.out.println("-------------------------");
        int p =0;
        try
        {
            System.out.print("Nhap so can chen : ");
            p = dt.nhapso();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("-------------------------");
        s = dt.Insert(s, p);
        for (int h=0;h<s.length;h++) System.out.print(s[h]+" ");
    }
}