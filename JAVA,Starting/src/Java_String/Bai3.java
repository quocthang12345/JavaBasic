package Java_String;
//Giới thiệu string API - Các phương thức của lớp string
public class Bai3 {
    public static void main(String[] args) {
        String Myname = "My Name is Quoc Thang";
        System.out.println(Myname.toCharArray());// chuyển sang dạng mảng kí tự
        System.out.println(Myname.toLowerCase()); // chuyển tất cả kí tự sang HOA
        System.out.println(Myname.toUpperCase()); // chuyển tất cả kí tự sang thường
        System.out.println(Myname.startsWith("My")); // kiểm tra phần tử bắt đầu của chuỗi có đúng hay ko
        System.out.println(Myname.startsWith("my"));
        System.out.println(Myname.endsWith("g"));// kiểm tra phần tử kết thúc của chuỗi có đúng hay ko
        System.out.println(Myname.endsWith("G"));
        String result[] = Myname.split(" "); // cắt từng kí tự trong chuỗi vói ddkien cho trước
        for(String s : result) System.out.print("\t" + s);
    }
}
