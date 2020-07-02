package java_OOP;

import model.Employee;
import model.Person;

/*
    Lớp trừu tượng , phương thức trừu tượng ( keyword abstract)
    Phương thức trừu tượng phải được khai báo trong lớp trừu tượng;
    Lớp trừu tượng là lớp có chức năng tham chiếu đến những lớp con kế thừa nó mà nó ko thể tự khởi tạo lớp cho
    chính mịnh
    Phương thức trừu tượng là phương thức được khai báo abstract trước kiểu dữ liệu , phương thức được khai báo
    trừu tượng có khả năng ko định nghĩa phương thức mà để phần định nghĩa đó cho những lớp con có phương thức
    cùng tên(overload) kế thừa định nghĩa
*/
public class Bai15 {
    //Person person = new Person(); // lỗi vì lớp trừu tượng ko thể khởi tạo chính mình
    Person person1 = new Employee(); // ok vì lớp trừu tượng có quyền tham chiếu đến các lớp con
}
