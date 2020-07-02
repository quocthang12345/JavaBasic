package Java_interface;
/*
    Interface là một bản thiết kế của một lớp. Nó chỉ có các phương thức trừu tượng.Interface là một kỹ thuật để thu được
    tính trừu tượng hoàn toàn và đa kế thừa trong Java.
    Interface chỉ định ra những phương thức trừu tượng để các lớp con implement triển khai chúng
    Nói cách khác, các trường(thuộc tính) của Interface là public, static và final theo mặc định và các phương thức là
    public và abstract.
    Một interface khác với một class ở một số điểm sau đây:
        +Bạn không thể khởi tạo một interface( vì nó trừu tượng).
        +Một interface không chứa bất cứ hàm Contructor nào.
        +Tất cả các phương thức của interface đều là abstract.
        +Một interface không thể chứa một trường nào trừ các trường vừa static và final.
        +Một interface không thể kế thừa từ lớp, nó được triển khai bởi một lớp.
        +Một interface có thể kế thừa từ nhiều interface khác.
        +Một class có thể implements(triển khai) nhiều interface
*/
public class Bai1 {
    public static void main(String[] args) {
        //Animal animal = new Animal(); lỗi không thể khởi tạo , interface được xem như lớp trườu tượng nên chỉ tham chiếu
        // đến các lớp con implement chúng
        Animal animal = new Dog(); // thể hiện được tính đa hình trong java , lớp cha tham chiếu đến các lớp on
        var animal1 = new Fish(); // một type inferent của java 11 được xác định kiểu dữ liệu bằng bên đối tượng nó khởi tạo
        Animal animal2 = new Bird();
        animal.Eat();
        animal1.Move();
        animal2.Sleep();
    }
}
