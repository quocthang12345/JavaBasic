package Java_String;


/* String là chuỗi bất biến vì mỗi kí tự trong chuỗi string đều ko thể thay đổi được , chỉ có thể thay đổi đối tượng chuỗi
* */
public class Bai2 {
    public static void main(String[] args) {
        String Name1 = "Thang";
        String Name2 = "Thang";
        String Name3 = "THANG";
        String Name4 = "thang";
        /* So sanh giữa 2 chuỗi có tương đương nhau hay không
         * Sử dụng toán tử "==" , lưu ý sử dụng toán tử == chỉ khi 2 đối tượng chuỗi cùng trỏ về một vùng nhớ thì 2 chuỗi mới tương đương
         * Sử dụng Name.equals(biến) để so sánh phần tử giữa 2 chuỗi phân biệt chữ hoa và thường
         * Sử dụng Name.equalsInoreCase(biến) để so sánh phần tử giữa 2 chuỗi không phân biệt hoa thường
         */
        System.out.println(Name1 == Name2 ); // true vì cùng trỏ vào 1 vùng nhớ chứa chuỗi Thang
        System.out.println(Name1.equals(Name2));
        System.out.println(Name1.equals(Name3));
        System.out.println(Name1.equals(Name4));
        System.out.println(Name1.equalsIgnoreCase(Name3));
        String Myname = "QuocThang";
        for(int i = 0 ; i<Myname.length() ; i++)
        {
            System.out.print(Myname.charAt(i)+ "\t");// lấy từng kí tự từ chuỗi Myname
        }
        String Name5 = ""; // chuỗi rỗng có độ dài bằng 0
        System.out.println(Name5.length());
        String NullString = null ; // chuỗi null không có độ dài
        System.out.println(NullString.length());
    }
}
