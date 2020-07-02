package java_operator;

/* toán tử tăng giảm : a++ ; ++a ; a-- ; --a
   toán tử so sánh : > < >= <= == !=
   Lưu ý :
   a++ : lấy biến a ra sử dụng rồi mới tăng a lên 1 đơn vị
   ++a: tăng biến a lên 1 đơn vị rồi mới sử dụng
* */
public class Bai2 {
    public static void main(String[] args) {
        int a = 10;
        int b ;
        b = a++ ;
        System.out.println(b);
        b = ++a;
        System.out.println(b);
        int c = 12;
        int d = 14;
        System.out.println("Ket qua cua c == d: "+ (c==d));
        System.out.println("Ket qua cua c >= d: "+ (c>=d));
        System.out.println("Ket qua cua c <= d: "+ (c<=d));
        System.out.println("Ket qua cua c != d: "+ (c!=d));
    }
}

