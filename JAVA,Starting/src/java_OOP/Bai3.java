package java_OOP;

import model.Person;

/* Phương thức khởi tạo (constructor) */
/*    Dùng để khởi tạo giá trị cho đối tượng của class
      Cùng tên với class
      Một lớp thì có nhiều hơn 1 constructor
      một constructor thì có 0,1 hoặc nhiều tham số
      Constructor thì kbh trả về
      Constructor luôn đc gọi với toán tử new
      Sử dụng overloading để xây dựng nạp chồng nhiều hơn 1 constructor
Lưu ý:  mỗi class đều có một constructor ngầm định khởi tạo đối tượng = 0 hoặc null
nếu ta khởi tạo một constructor và truyền cho nó tham số đối tượng thì ta bắt buộc phải khai báo thêm hàm constructor
ngâm định có nghĩa là khai bao hàm constructor ko tham số
 */
public class Bai3 {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.getName()+ " " + person1.getAge() + " " + person1.getAddress());
    }
}
