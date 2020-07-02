package java_input_output_console;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class write_file {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printwriter = new PrintWriter("C:\\Users\\Huy Coc\\IdeaProjects\\JAVA,Starting\\Hello Java.txt",
                "UTF-8");// mở file cần ghi
        printwriter.println("Hello Java From Quoc Thang"); /* ghi vào file , sử dụng append() có thể thêm dữ liệu mà k bị mất
        dữ liệu cũ , còn dùng những phương thức khác mà trùng tên file thì dữ liệu cũ sẽ mất đi */
        printwriter.close();// nhớ đóng file
    }
}
