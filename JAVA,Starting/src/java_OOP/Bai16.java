package java_OOP;

import model.Employee;
import model.Person;
import model.Student;

/*
    Lớp Object
    Mọi lớp trong java đều kế thừa từ lớp object vì vậy biến của lớp object có thể tham chiếu đến mọi lớp trong Java
*/
public class Bai16 {
    public static void main(String[] args) {
        Object object = new Employee(); // có thể tham chiếu đến tất cả lớp để tạo đối tượng
        Object obj = new Person();
        Object obj1 = new Student();
        Student student = new Student("Tran Quoc Thang",20,"K126/15 Le Do","123gkeo4","ĐHBK",8);
        Employee employee = new Employee("Tran Quoc Thang" , 20 , "K126/15 Le Do" , "12fhfefj2", "100tr");
        Object[] objects = new Object[3];
        objects[0] = obj;
        objects[1] = student; // tham chiếu đến biến student để lấy dữ liệu của biến student
        objects[2] = employee;
        ((Student) objects[1]).Out();
        System.out.println();
        ((Employee) objects[2]).Out();
    }
}
