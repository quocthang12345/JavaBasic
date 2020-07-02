package BTVN5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai6 {
    public int nhapso() throws IOException
    {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
    public void TichBoiBa(int m[][])
    {
        int j,col;
        col  =m[0].length ;
        int P=1;
        for (j=0;j<col;j++)
            if (m[0][j]%3 == 0) P *= m[0][j] ;
        System.out.println("Tich cac so boi 3 o dong dau tien: "+P);
    }
    public int[] TimMaxdong(int m[][],int s[])
    {
        int max =-9999;
        int row,col,i,j;
        row = m.length;
        col = m[0].length;
        for (i=0;i<row;i++)
        {
            for (j=0;j<col;j++)
            {
                if (m[i][j] > max) max = m[i][j];
            }
            s[i] = max;
            max = -9999;
        }
        return s;
    }
    public int[] Xoamang(int s[])
    {
        int temp[];
        temp = new int [s.length-1];
        for (int i=0;i<temp.length;i++)
            temp[i] = s[i+1];
        return temp;
    }
    public static void main(String[] args) throws IOException {
        Bai6 dt = new Bai6();
        int row=0,col=0,i,j;
        int m[][];
        int s[];
        try
        {
            System.out.println("Nhap so hang cua ma tran: ");
            row = dt.nhapso();
            System.out.println("Nhap so cot cua ma tran: ");
            col = dt.nhapso();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        m = new int[row][col] ;
        s = new int[row];
        for (i=0;i<row;i++)
            for (j=0;j<col;j++)
            {
                System.out.println("M["+i+"]["+j+"] =");
                m[i][j] = dt.nhapso();
            }
        System.out.println("Ma tran vua nhap : ");
        for (i=0;i<row;i++)
        {
            for (j=0;j<col;j++)
                System.out.print(m[i][j]+"  ");
            System.out.print("\n");
        }
        dt.TichBoiBa(m);
        s = dt.TimMaxdong(m, s);
        for (i=0;i<s.length;i++) System.out.print(s[i]+"  ");
        System.out.println("\nSau Khi xoa s[0]: ");
        s = dt.Xoamang(s);
        for (i=0;i<s.length;i++) System.out.print(s[i]+"  ");
    }
}