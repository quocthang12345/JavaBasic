package java_OOP;

import model.Employee;
import model.Person;
import model.Student;

/*
    Phương thức equals()
    equals() là phương thức đc định nghĩa sẵn trong lớp object nhằm so sanh giữa hai đối tượng có tương đương nhau
    hay không , nhưng đối với các class trong java thì khi khởi tạo 2 biến từ cùng 1 lớp mang cùng 1 dữ liệu thì
    equals() của lớp object vẫn trả về false vì vậy ta phải tự override phương thức equals() lại cho phù hợp với class
    + Công thức để viết ra một phương thức equals() hoàn hảo:
    - Đặt thêm tham số là otherobject kiểu Objects
    - Check xem hai đối tượng có trùng nhau không?
    if(this == otherobject) return true;
    - Check đối tượng có null không?
    if(this.otherobject == null) return false;
    - Sử dụng getClass() trong trường hợp mỗi lớp con tự định nghĩa lại phương thức equals()
    if(this.getClass() != otherobject.getClass()) return false;
    - Sử dụng instanceof trong trường hợp phương thức equals() khai báo final(cấm override) ở lớp cha:
    if(!(otherobject instanceof ClassName) return false;
    + Nếu không nằm ở tất cả trường hợp trên thì mình định nghĩa các ddkien riêng
    - Ép kiểu  otherobject sang kiểu lớp mà mình cần so sánh
    - Đối với so sánh các thuộc tính với nhau thì nếu thuộc tính mang kiểu dữ liệu nguyên thủy thì dùng == , còn
    thuộc tính mang kiểu lớp thì sử dụng Objects.equals(): return field1 == other.field1;
                                                                Objects.equals(field2,other.field2)
    - Nếu lớp con tái định nghĩa phương thức equals() thì phải gọi hàm super.equals(otherobject) trong định nghĩa
    phương thức của lớp con này
 */
public class Bai17 {
    public static void main(String[] args) {
        Student student = new Student("Tran Quoc Thang",20,"K126/15 Le Do","123gkeo4","ĐHBK",8);
        Person person = new Student("Tran Quoc Thang",20,"K126/15 Le Do","123gkeo4","ĐHBK",8);
        Employee employee = new Employee("Tran Quoc Thang" , 20 , "K126/15 Le Do" , "12fhfefj2", "100tr");
        System.out.println(student.equals(person));// true
        System.out.println(student.equals(employee)); // false
    }
}
