package java_OOP;

import model.Person;
/*  con trỏ this dùng để trỏ đến phương thức và thuộc tinh của class mình xây dựng ,
    xây dưng phương thức this() truyền đối số nó sẽ trỏ đến phương thức có đối số tương ứng trong class và chú ý lun
    xếp phương thức this() lên đầu của khối code của một phương thức khác
* */

public class Bai4 {
    public static void main(String[] args) {
        Person person1 = new Person("TranQuocThang",20, "K126/15 Le do");
        System.out.println(person1.getName() + " " + person1.getAge()+ " " + person1.getAddress());
    }
}
