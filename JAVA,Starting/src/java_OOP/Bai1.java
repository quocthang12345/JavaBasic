package java_OOP;

import model.Person;

public class Bai1 {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person();
        person1.setName("Tran Quoc Thang");
        person1.setAge(20);
        person1.setAddress("K126/15 Le do");
        System.out.println(person1.getName()+" " +person1.getAge() + " " +person1.getAddress());
    }
}
