package java_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

// try with resource , cú pháp try()
// có chức năng tự động mở ,đóng file khi ta thao tác xong với điều kiện ta truyền resource cho nó
public class Bai3 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        try(Scanner readfile = new Scanner(
                new File("C:\\Users\\Huy Coc\\IdeaProjects\\JAVA,Starting\\src\\java_exception\\Bai2.java")
                ,"UTF8"); // Đọc file
            PrintWriter printWriter =
                    new PrintWriter("C:\\Users\\Huy Coc\\IdeaProjects\\JAVA,Starting\\src\\java_exception\\Bai2.DAT","UTF-8");
        )
        {
            while(readfile.hasNextLine()) // nếu còn line đọc thì lặp
            {
                var i = readfile.nextLine(); // thì đọc hết line
                printWriter.println(i); // rồi ghi vào file
            }
        }
    }
}
