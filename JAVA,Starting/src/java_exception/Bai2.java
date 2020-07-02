package java_exception;
/*
    throw và throws
    Phân biệt : giống nhau đều không xử lí ngoại lệ trực tiếp như try-catch-finally.Khác nhau , đối với throw thì nằm ở trong
    khối code của phương thức và ném ra một đối tượng ngoại lệ trực tiếp được khởi tạo , còn với throws thì nằm ở phần khai báo
    phương thức và liệt kê các ngoại lệ cần xử lí.
    Khi nào sử dụng : khi ta không biêt hoặc không làm bắt trực tiếp các ngoại lệ thì ta ném ngoại lê
 */
public class Bai2 {
    public static double divide(int a , int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("Moi nhap lai");
        }
        return ((a/b)*1.0);
    }
    public static void countTime(int n) throws InterruptedException {
        for(int i = 0 ; i<n ; i++)
        {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }

    public static void main(String[] args) /*throws InterruptedException*/ {
        //countTime(10);
        //divide(1,0); lỗi,sử dụng try-catch-finally hoặc tiếp tục throw
        try{
            divide(1,0);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
