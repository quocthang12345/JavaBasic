package java_OOP;
/*
    Phương thức static:
    để thực hiện code trong phương thức được khai báo static thì các phương thức , trường , hay biến phải khai báo static
    vì chúng chỉ thao tác với thành phần có static ( chú ý các thành phần nằm trong phương thức vẫn khai báo bthuong)
    Không cần có đối tượng để thao tác
    Tất cả những gì cần thiết đã cung cấp qua tham số của phương thức
    phương thức static thực hiện code ko cần phải khởi tạo đối tượng ( ý k cân new đối tượng)
    còn phương thức non-static thì phải bắt buộc khởi tạo đối tượng mới chạy đc
*/
public class Bai7 {
    private String a = "xox";
    private static String b = "vwv";
    public static void show()
    {
        int n = 2;
        //System.out.println(a); báo lỗi vì thuộc tính a k khai báo static
        System.out.println(b);
        //System.out.println(Tinh(n)); báo lỗi vì phương thức Tinh() k khai báo static
        System.out.println(TinhToan(n));
    }
    public int Tinh(int n)
    {
        return n+1;
    }
    public static int TinhToan(int n)
    {
        return n+1;
    }

    public static void main(String[] args) {
        Bai7 bai = new Bai7();
        bai.show();
    }

}
