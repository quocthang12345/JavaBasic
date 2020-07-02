package java_OOP;

import model.Person;

// overloading là xây dựng nhiều phương thức cùng tên nhưng khác kiểu trả về hoặc kiểu tham số , tham số . Khi ta goị
//phuong thức cùng tên dựa vào đối số truyền vào thì sẽ thực thi phương thức có kiểu trả về , kiểu dữ liệu và tham số phù
//hợp nhất
public class Bai2 {
    public static void main(String[] args) {
        Person person1;
        int a = 1;
        String b = "Thang";
        person1 = new Person();
        System.out.println(person1.show(a));
        System.out.println(person1.show(b));

    }
}
