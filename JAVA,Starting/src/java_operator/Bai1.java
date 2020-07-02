package java_operator;

/*
Các phép toán số học : + - * / %
các phép toán gán: = += -= *= /= %=
để sử dụng phép toán gán cho một số học thì số học đó phải được khởi tọa ( nếu không ctrinh báo lỗi hoặc biến sẽ mang giá trị rác)
* */
public class Bai1 {
    public static void main(String[] args) {
        int a = 275;
        int b = 120;
        float kq1 = a*1.0f/b;
        int kq2 = a/b;
        int kq = a%b;
        System.out.println("ket qua1 :"+ kq1);
        System.out.println("ket qua2 :"+ kq2);
        System.out.println("ket qua :"+ kq);
        a+=100; // phải khởi tạo giá trị cho a trước khi dùng toán gán
        float kq4 = a*1.0f/b;
        System.out.println("ket qua4: "+ kq4);
    }
}

