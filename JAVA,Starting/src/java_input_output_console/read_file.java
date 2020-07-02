package java_input_output_console;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Scanner;

public class read_file {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("C:\\Users\\Huy Coc\\IdeaProjects\\JAVA,Starting\\Hello Java.txt"),
                "UTF-8"); // mở file Hello Java document ra đọc
        String s = scanner.nextLine();
        System.out.println(s);
        while(scanner.hasNextInt()){
            int a = scanner.nextInt();
            System.out.print(a + "\t");
        }
        System.out.println("");
        boolean bb = scanner.nextBoolean();
        System.out.println(bb);
        scanner.close();// đóng file Hello Java document lại
    }
}
