package Java_basic;



/*Hằng số chỉ được định nghĩa gán một lần và duy nhất trong một vòng đời chương trình
 * cú pháp: final_Kiểu DL_Biến;
 * Để hằng số có thể sử dụng làm đối số tại các phương thức khác thì nên khai báo nó ở class;
 * */
public class Bai3 {
    public static final double PI=3.14;
    public static final float G=9.72f;
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(G);
        SHOWG();
        SHOWP();
    }
    public static void SHOWG()
    {
        System.out.println(G);
    }
    public static void SHOWP(){
        System.out.println(PI);
    }


}
