package java_OOP;

import model.Person;
import model.PersonFactory;
/*
    Factory method ;
    chức năng : dùng để thay thế việc khởi tạo trực tiếp
    sẽ thay thế cho Person person = new Person();
*/
public class Bai8 {
    public static void main(String[] args) {
        Person person = PersonFactory.getPersonInstance();
        Person person1 = PersonFactory.getPersonInstance();
        Person person2 = PersonFactory.getPersonInstance();
        Person person3 = PersonFactory.getPersonInstance();

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
