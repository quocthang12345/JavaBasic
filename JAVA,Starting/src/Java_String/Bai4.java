package Java_String;
/*StringBuilder là khái niệm về một chuỗi kí tự được xây dựng bằng cách thêm sửa xóa và có thể thay đổi chuỗi hoặc build nhiều kiểu khi xây dựng ctrinh lớn,
những thứ mà String thông thường không thể làm được , sau đó convert sang chuỗi String thêm vào database*/
public class Bai4 {
    public static void main(String[] args) {
        StringBuilder StringB = new StringBuilder();
        StringB.append("Tran ");
        StringB.append("Thang");// append() thêm kí tự vào chuỗi stringbuilder
        String Name = StringB.toString();
        System.out.println(Name);
        StringB.insert(4," Quoc"); // thêm kí tự vào vị trí mình muốn thêm vào chuỗi Stringbuilder
        String Name1 = StringB.toString();
        System.out.println(Name1);
        StringB.replace(0,4,"TRAN"); // thay đổi phần tử kí tự về vị trí mình cho trước
        String Name2 = StringB.toString();
        System.out.println(Name2);
        String Name3 = StringB.reverse().toString(); // đảo ngược chuỗi kí tự Stringbuilder
        System.out.println(Name3);
    }
}
