package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Regular Expression
    + Kiểm tra định dạng của email
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println();

        String dkien = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}[a-zA-z]+mail.{1}com$"; // Bắt đầu với 1 hoặc nhiều  kí tự cho phép trong ngoặc và \w+ có nghĩa là chỉ 1 kí tự từ
        Pattern pattern = Pattern.compile(dkien);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find())
        {
            System.out.println("OK");
        }
        else
        {
            System.out.println("Moi nhap lai");
        }

    }
}
