package java_OOP;

import model.Person;

/*  Biến đối tượng và đối tượng
để truy xuất đến thông tin của đối tượng thì cân phải khởi tạo nó
*/
public class Bai6 {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1); /// xuất ra địa chỉ của biến vừa khởi tạo để truy xuất
    }
}
