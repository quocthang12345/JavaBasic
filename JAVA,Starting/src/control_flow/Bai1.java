package control_flow;
// khối code , phạm vi code
public class Bai1 {
    int x = 1; // biến thuộc tính , biến chung , mất đi khi hết ctrinh
    public static void main(String[] args) {
        int x = 90; // biến cục bộ , biến của khối , mất đi khi thực hiện hết một khối lệnh bao quanh biến
        {
            System.out.println(x);
        }
    }
}
