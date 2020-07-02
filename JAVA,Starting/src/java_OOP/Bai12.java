package java_OOP;

import model.Employee;
import model.Person;
import model.Student;

/*
    OVERRIDE(Ghi đè phương thức) là phương pháp chỉ được sử dụng khi lớp con kế thừa lớp cha , lớp con sử dụng phương
    thức của lớp cha ghi đè lại chức năng của lớp cha để phù hợp với lớp con của mình nhưng k làm mất ý nghĩa của phương
    thưc lớp cha
    Phương thức super() được gọi để thực hiện lại chức năng của phương thức lớp cha lớp kế thừa , phương thức super()
    gọi hàm constructor phải đươc viết ở đầu trong phương thức constructor lớp con và được truyền đôi số nếu có tham số
    , còn super() gọi một phuong thức cụ thể nào đó thì ở đầu hay cuối gì đều đc
    Đa hình là khả năng của một đối tượng có nhiều dạng. Việc sử dụng đa hình phổ biến nhất trong OOP xảy ra khi
    tham chiếu lớp cha được sử dụng để chỉ đối tượng lớp con.


 */
public class Bai12 {
    public static void main(String[] args) {
        Student student = new Student("Tran Quoc Thang",20,"K126/15 Le Do","123gkeo4","ĐHBK",8);
        Employee employee = new Employee("Tran Quoc Thang" , 20 , "K126/15 Le Do" , "12fhfefj2", "100tr");
        Person person = new Person("Quoc Thang",20,"K126/15 Le DO");
        Person[] people = new Person[3];
        people[0] = person;
        people[1] = student;
        people[2] = employee;
        for (Person p: people) {
            System.out.println("Thong tin Person: ");
            p.Out();
            System.out.println();
        }
    }
}
