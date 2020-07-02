package java_other;
/*
                     Lớp bao
    Autoboxing  là quá trình mà trình biên dịch của Java tự động chuyển đổi giữa kiểu dữ liệu nguyên thủy (Primitive type)
    về đối tượng tương ứng với lớp (Wrapper class) của kiểu dữ liệu đó.
    Ví dụ, trình biên dịch sẽ chuyển đổi kiểu dữ liệu int sang Integer, kiểu double sang Double, …Và ngược lại là unboxing.

    Unboxing là quá trình ngược lại với Boxing, tức là đưa từ kiểu tham chiếu ra kiểu tham trị.
    Quá trình này sẽ được thực hiện một cách tường minh. Gồm có 2 bước :
    – Bước 1 : Kiểm tra chắc chắn rằng đối tượng đã được boxing đúng kiểu giá trị đưa ra.
    – Bước 2 : Copy giá trị sang biến dữ liệu kiểu tham trị.

    Chuyển đổi xâu các kí tư số thành giá trị số tương ứng


*/
public class autoboxing {
    public static void main(String[] args) {
        int i = 3 ;
        Integer integer = i; // tử động chuyển đổi giữa kiểu lớp đối tượng qua kiểu nguyên thủy
        System.out.println(integer);// boxing

        Integer integer1 = Integer.valueOf(1); // gán giá trị cho biến kiểu đối tuọng
        int j = integer1; // tự chuyển đổi giữa kiểu nguyên thủy sang kiểu đối tượng
        System.out.println(j);

        String str = "1234567";
        int number = Integer.parseInt(str); // chuyển đối xâu các kí tự số thành giá trị số
        System.out.println(number);

        String str1 = String.valueOf(number); // chuyển đổi giá trị số thành xâu các kí tự
        System.out.println(str1);


    }
}
