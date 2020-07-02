package java_exception;
/*
    Exception khác với Error ở chỗ Exception có thể xử lí ngoại lệ để đưa chương trình tiếp tục thực thi trong khi với
    error thì ko thể nào xử lí và chương trình sẽ bị crack
    Trong Exception có 5 keyword cần chú ý
    Đó là try, catch , finally , throw, throws
    Hướng dẫn sử dụng try-catch-finally:
    Các trường hợp xảy ra nên sử dụng try-catch-finally, try-cacth:
    1/ Ngoại lệ xảy ra trong try nhưng được khối catch xử lí
    2/ Ngoại lệ xảy ra trong try nhưng không được khối catch xử lí
    3/ Ngoại lệ không xảy ra trong khối try

    Các trường hợp sử dụng try-finally
    1/ Ngoại lệ xảy ra trong khối try
    2/ Ngoại lệ không xảy ra trong khối try

    Keyword finally đc sử dụng khi dù ctrinh có exception hay ko thì vẫn phải thực thi khối lệnh nằm trong khối finally

    //
*/
public class Bai1 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            System.out.println("Trong khối try");
        }catch (Exception e) // sử dụng đa hình gọi lớp cha exception để khi ngoại lệ xảy ra sẽ tham chiếu đến các lớp con để ném ngoại lệ
        {
            System.out.println("Exception: NullPointerException");
            System.out.println("Trong khối catch");
        }
        finally {
            System.out.println("Trong khối finally");
        }
        System.out.println("Thoát khởi khối try-catch-finally");
    }
}
