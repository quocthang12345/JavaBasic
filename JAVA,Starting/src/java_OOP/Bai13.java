package java_OOP;

import model.Employee;
import model.Person;
import model.Student;

import javax.swing.border.EmptyBorder;

/*
    Ép kiểu đối tượng
    Để ép kiểu từ lớp cha xuống lớp con phải làm tường minh gán lơp cha bằng lớp con , còn ép lớp con với lớp con thì
    phải dùng từ khóa instanceof và cấu trúc rẽ nhánh để làm
*/
public class Bai13 {
    public static void main(String[] args) {
        Student student = new Student("Tran Quoc Thang",20,"K126/15 Le Do","123gkeo4","ĐHBK",8);
        Employee employee = new Employee("Tran Quoc Thang" , 20 , "K126/15 Le Do" , "12fhfefj2", "100tr");
        Person person = new Person("Quoc Thang",20,"K126/15 Le DO");
        Person[] people = new Person[3];
        people[0] = person;
        people[1] = student;
        people[2] = employee;

        Student s1 = new Student();
        Employee e1 = new Employee();
        for (Person p: people) {
            if (p instanceof Student)// nếu p là lớp student thì ép kiểu p qua Student
            {
                s1 = (Student) p;
            }
            if (p instanceof Employee) {
                e1 = (Employee) p;
            }
        }

            if(s1 != null)
            {
                s1.setAvg(9);
            }
            System.out.println("Thong tin Person: ");
            s1.Out();
            if(e1 != null)
            {
                e1.setSalary("1ty");
            }
            System.out.println("Thong tin Person: ");
            e1.Out();

    }
}
