package java_OOP;

import model.Employee;
import model.Person;
import model.Student;

/*
    Phương thức toString()
    override phương thức để có thể xuất tất cả thông tin của đối tượng khi ta khởi tạo mà k cần dùng get set
*/
public class Bai18 {
    public static void main(String[] args) {
        Student student = new Student("Tran Quoc Thang",20,"K126/15 Le Do","123gkeo4","ĐHBK",8);
        Employee employee = new Employee("Tran Quoc Thang" , 20 , "K126/15 Le Do" , "12fhfefj2", "100tr");
        Person person = new Person("Quoc Thang",20,"K126/15 Le DO");
        System.out.println(person.toString());//person
        System.out.println(employee);//employee.toString()
        System.out.println(student.toString());
    }
}
