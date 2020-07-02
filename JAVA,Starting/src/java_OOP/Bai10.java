package java_OOP;

import model.Employee;
import model.Student;

// Inheritnace ( Kế thừa )
/*
    Lớp cha (base class or parent class) là những lớp sở hữu những thuộc tính chung nhất khi thiết kế
    lớp con (subtrclass) là những lớp kế thừa từ lớp cha nhưng thuộc tính phương thức chung bắt buộc có và sinh ra
    những thuộc tính riêng đặc tả của lớp con . Lớp con kế thừa lớp cha có thể gọi phương thức, thuộc tính ở dạng
    public
*/
public class Bai10 {
    public static void main(String[] args) {
        Student student = new Student();
        Employee employee = new Employee();
        student.getName(); // gọi phuong thức public của person
        employee.getAddress();
    }
}
