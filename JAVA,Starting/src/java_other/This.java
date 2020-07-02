package java_other;

import model.Student;

/* Từ khóa This*/
public class This {
    private String Dosomething;
    private String AskSomething;
    private String TalkSomething;

    public This(){}

    public This(String dosomething) {
        this.Dosomething = dosomething;
    }

    //Cách 1: Dùng this để tham chiếu đến thuộc tính của lớp hiện thời
    public This(String dosomething, String askSomething, String talkSomething) {
        this.Dosomething = dosomething;
        this.AskSomething = askSomething;
        this.TalkSomething = talkSomething;
    }
    //Cách 2: Dùng this để gọi các hàm khởi tạo khác của lớp ( phải đặt đầu tiên trong phương thức)

    public This(String dosomething, String askSomething) {
        this(dosomething);
        AskSomething = askSomething;
    }
    //Cách 3: Dùng this để return về thể hiện của lớp
    public This getThis()
    {
        return this;
    }
    //Cách 4: Dùng this làm tham số của các phương thức khác
    //Cách 5: Dùng this để gọi các phương thức cùng lớp ( đặt ở đâu cũng đc )
}
